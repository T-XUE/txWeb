import com.redis.RedisClient;
import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {
        Jedis jedis = RedisClient.getJedis();
        jedis.set("name","田雪");
        String name = jedis.get("name");
        System.out.println(name);
    }
}
