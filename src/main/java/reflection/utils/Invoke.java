package reflection.utils;


import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: Invoke
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 11:16 2020/6/22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 11:16       liumf           v1.1.0
 */
public class Invoke {

    // private static final Logger log = LogManager.getLogger(Invoke.class);
    public static final Logger logger = Logger.getLogger(Invoke.class);
    public String exampleMethod(){

        return "无参反射调用成功";
    }


    public String exampleMethod2(String str1){

        logger.error(str1);
        return "有参反射调用成功";
    }

    public String exampleMethod3(String str1,String Str2){
        logger.error(str1);
        logger.error(Str2);
        return "有参反射调用成功";
    }

    public void variableParameter(String... args){

        System.out.println(args[0]);
        System.out.println(args[1]);

        logger.error("调用成功");
    }


    /**
     * @param map
     */

    public void mapParam(Map<String,String> map){

        if (map.isEmpty()){
            return;
        }
        for (Map.Entry<String,String> objMap:map.entrySet()){

            String key = objMap.getKey();
            String value = objMap.getValue();
            System.out.println(key+":"+value);
        }

    }

}