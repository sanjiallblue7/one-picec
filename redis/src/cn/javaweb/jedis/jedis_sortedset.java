package cn.javaweb.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class jedis_sortedset {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis();

        //操作
        //存储
        jedis.zadd("myset",3,"a");
        jedis.zadd("myset",4,"b");
        jedis.zadd("myset",2,"c");

        //获取
        Set<String> set = jedis.zrange("myset", 0, -1);
        System.out.println(set);

        //关闭连接
        jedis.close();
    }
}
