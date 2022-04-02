import com.alibaba.fastjson.JSONObject;
import entity.Book;

import lombok.pojo.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Copyright: Copyright (c) 2021 AsiaInfo
 *
 * @ClassName: ObjectTest
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 14:11 2021/1/22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 14:11       liumf           v1.1.0
 */
public class ObjectTest {


    public static void main(String[] args) throws Exception {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(0);
        Date currentTime_2 = formatter.parse(dateString, pos);
        System.out.println(currentTime_2);

    }
    }
