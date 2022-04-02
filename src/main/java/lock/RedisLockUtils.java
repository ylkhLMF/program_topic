package lock;

import redis.clients.jedis.Jedis;

/**
 * Copyright: Copyright (c) 2021 DNT
 *
 * @ClassName: RedisLockUtils
 * @Description: redis实现分布式锁
 * @Version: v1.0.0
 * @Author: liumf
 * @Date: 14:49 2022/2/28
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 14:49       liumf           v1.1.0
 */
public class RedisLockUtils {


    private static Jedis jedis;
    static {

         jedis = new Jedis("localhost");
    }



    /**
     * 分布式锁
     * 方案一:setnx+expire实现
     *
     * 弊端:
     * @return
     */
    public static void getDistributedLock(String resKey){

        if (null != jedis){

            if (jedis.setnx(resKey,"1000") == 1){

                jedis.expire(resKey,50);

                try {
                    Thread.sleep(1);
                }catch (Exception e){

                }finally {
                    jedis.del(resKey);
                }

            }else {

                System.out.println("有锁不执行");
            }

        }

    }

    /**
     * @link
     * @param args
     */
    public static void main(String[] args) {

        for (int i =0 ;i<10;++i){
            getDistributedLock("123456fs");
        }
    }



}
