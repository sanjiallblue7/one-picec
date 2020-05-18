package cn.javaweb.jedis;

import redis.clients.jedis.Jedis;

public class jedis_string {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis("localhost", 6379); //如果使用空参构造,默认值"localhost", 6379

        //存储操作
        jedis.set("username", "zhansan");

        //获取
        String username = jedis.get("username");
        System.out.println("username: "+username);

        //可以使用setex()方法存储可以指定过期时间的key value
        jedis.setex("username",5,"hehe");//将activecode：hehe键值对存入redis，并且20秒后自动删除该键值对

        //关闭连接
        jedis.close();
    }
}
