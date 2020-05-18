package cn.javaweb.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class jedis_jedispoolconfig {
    public static void main(String[] args) {
        //创建配置对象
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);
        jedisPoolConfig.setMaxIdle(10);

        //创建连接池对象
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "localhost", 6379);

        //获取连接
        Jedis jedis = jedisPool.getResource();

        //使用
        jedis.set("a","b");

        //归还到连接池中
        jedis.close();
    }
}
