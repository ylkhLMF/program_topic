package fastJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import fastJson.pojo.User;
import fastJson.single.SingleSerializeConfig;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: Test
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 0:20 2020/12/21
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 0:20       liumf           v1.1.0
 */
public class Test {


    public static void main(String[] args) {

        // SerializeConfig config = SingleSerializeConfig.getSerializeConfig().UP();
        // User user = new User();
        // user.setPassWord("111");
        // user.setUserName("liu");
        // String s = JSON.toJSONString(user, config);
        // System.out.println(s);
        String methodName = getMethodName();

        System.out.println(methodName);

    }

    public static String getMethodName(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return methodName;

    }
}
