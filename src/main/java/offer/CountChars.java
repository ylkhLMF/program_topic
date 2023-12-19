package offer;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2020 Dreamfly
 *
 * @ClassName: CountChars
 * @Description: 统计字符串中字符出现的次数 使用map
 * @version: v1.0.0
 * @author: liumf
 * @date: 13:22 2020/6/23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 13:22       liumf           v1.1.0
 */
public class CountChars {

    public CountChars(String str) {
        countNum(str);
    }

    public static void main(String[] args) {
        new CountChars("");

    }
    void countNum(String str) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        Map<Character,Integer> treeMap = new HashMap<>(16);
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){

            if (!treeMap.containsKey(chars[i])){
                treeMap.put(chars[i],1);
            }else {
                Integer integer = treeMap.get(chars[i]);
                treeMap.put(chars[i],++integer);
            }
        }
        for (Map.Entry mapString: treeMap.entrySet()){

            String key = String.valueOf(mapString.getKey());
            String value = String.valueOf(mapString.getValue());
            System.out.println(key+"出现了"+value+"次");
        }

    }


}