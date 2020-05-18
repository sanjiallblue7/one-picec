package cn.javaweb.jedis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class jedis_list {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis();

        //操作
        //存储
        jedis.lpush("list","a","b","c");
        jedis.rpush("list","a","b","c");

        //获取
        List<String> list = jedis.lrange("list", 0, -1);
        System.out.println(list);

        //list 左弹出
        String list1 = jedis.lpop("list");
        System.out.println(list1);

        //list 右弹出
        String list2 = jedis.rpop("list");
        System.out.println(list2);

        //关闭连接
        jedis.close();
    }
}
