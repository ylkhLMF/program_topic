package fastJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import fastJson.pojo.User;
import fastJson.single.SingleSerializeConfig;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import javax.accessibility.Accessible;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright: Copyright (c) 2020 Dreamfly
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


    public static void main(String[] val) {

        Object  var = 10 ;

        String str = (String)var;
        System.out.println(str);

    }
}
