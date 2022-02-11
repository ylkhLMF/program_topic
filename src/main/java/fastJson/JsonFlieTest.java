package fastJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import fastJson.pojo.JsonPojo;

import java.lang.reflect.Field;
import java.util.HashSet;

/**
 * Copyright: Copyright (c) 2021 AsiaInfo
 *
 * @ClassName: JsonFlieTest
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 15:50 2021/8/17
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 15:50       liumf           v1.1.0
 */
public class JsonFlieTest {


    public static void main(String[] args) {

     String str = "{\n" +
             "  \"billId\": \"1\",\n" +
             "  \"xxx\": \"2\"\n" +
             "}";

        Object jsonObject = JSON.parseObject(str,Object.class);

        Class<?> aClass = jsonObject.getClass();

        Field[] fields = aClass.getFields();

        for (Field field : fields) {

            System.out.println(field.getName());
        }



        System.out.println(jsonObject);
    }

}
