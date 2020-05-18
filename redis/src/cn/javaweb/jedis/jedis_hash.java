package cn.javaweb.jedis;

import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.Set;

public class jedis_hash {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis();

        //操作
        //存储
        jedis.hset("user", "name", "zhansan");
        jedis.hset("user", "age", "20");
        jedis.hset("user", "sex", "nan");

        //获取
        String name = jedis.hget("user", "name");
        String age = jedis.hget("user", "age");
        String sex = jedis.hget("user", "sex");
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);

        //获取全部
        Map<String, String> user = jedis.hgetAll("user");

        //遍历map集合
        //keySet 将所有的map中的key放到set集合,再根据key一一取出value
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }

        //关闭连接
        jedis.close();
    }
}
