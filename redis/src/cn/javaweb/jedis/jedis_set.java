package cn.javaweb.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class jedis_set {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis();

        //操作
        //存储
        jedis.sadd("set","a","b","c");

        //获取
        Set<String> set = jedis.smembers("set");
        System.out.println(set);

        //关闭连接
        jedis.close();
    }
}
