package com.redis;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author: T-XUE
 * @Date: Created in 15:11 2017/8/11 0011
 * @Description: redis测试
 * @Version: 1.0
 * @History: <li>Author: T-XUE</li> <li>Date: 2017-08-11</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class RedisClient {

    //Redis服务器IP
    private static String ADDR = "127.0.0.1";

    //Redis的端口号
    private static int PORT = 6379;

    //可用连接实例的最大数目，默认值为8；
    //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
    private static int MAX_ACTIVE = 1024;

    //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
    private static int MAX_IDLE = 200;

    //等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
    private static int MAX_WAIT = 10000;

    //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool = null;

    private static ThreadLocal<Jedis> jedisThreadLocal = new ThreadLocal<Jedis>();

    /**
     * 初始化Redis连接池
     */
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxActive(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWait(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, ADDR, PORT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Jedis实例
     *
     * @return
     */
    public static Jedis getJedis() {
        System.out.println("从连接池获取jedis连接资源");
        Jedis jedis = jedisThreadLocal.get();
        if (jedis == null) {
            jedis = jedisPool.getResource();
            jedisThreadLocal.set(jedis);
            return jedis;
        }
        return jedis;
    }

    /**
     * 释放jedis资源tx
     *
     * @param jedis
     */
    public static void returnResource(final Jedis jedis) {
        System.out.println("jedis连接返回到连接池");
        if (jedis != null) {
            jedisPool.returnResource(jedis);//该方法仅仅将资源返回到连接池了，但是暂时没有断开连接
            jedisThreadLocal.set(null);
        }
    }

    public static void main(String[] args) {
        Jedis jedis = RedisClient.getJedis();
        jedis.set("name","田雪");
        String name = jedis.get("name");
        System.out.println(name);
    }
}
