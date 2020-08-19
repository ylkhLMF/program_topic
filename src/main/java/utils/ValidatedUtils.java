package utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author dreamFly
 * @date 21:54 2020/8/19
 * @className ValidatedUtils
 * @description
 */

public class ValidatedUtils {

    public static void main(String[] args) throws Exception {
        String str1 ="";
        String str2="1";
        String str3="3";
        String str4="4";

        Map<String, String> validatedMap = new HashMap(16){{
            put("Str1",str1);
            put("str2",str2);
            put("Str3",str3);
            put("Str4",str4);
        }};
        if (StringUtils.isBlank(str1)){
            System.out.println("为空"+str1);
        }
        String s = validatedParams(validatedMap);
        System.out.println(s);


    }
    public static String validatedParams(Map<String,String> map) {

        if (CollectionUtils.isEmpty(map)){
            return null;
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            if (StringUtils.isBlank(entry.getValue())){
                return entry.getKey();
            }
        }
        return null;
    }


}
