package offer;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Stack;

/**
 * Copyright: Copyright (c) 2021 AsiaInfo
 *
 * @ClassName: ReverseString
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 12:45 2021/4/12
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 12:45       liumf           v1.1.0
 */
public class ReverseString {


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String str ="ABCDE";

        // 随机数范围[0,3)
        Random random = new Random();
        int i = random.nextInt(3) + 1;
        Class<ReverseString> reverseStringClass = ReverseString.class;
        ReverseString reverseString = reverseStringClass.getDeclaredConstructor().newInstance();
        System.out.println(reverseString.reverse(str,i));
    }


    /**
     * type 1. 栈方式 2 .StringBufferAPI 3 . 遍历
     *
     * @return java.lang.String
     * @author liumf
     * @params [str, type]
     * @time 2021/4/12 12:46
     * @version V1.0
     */

    private  String reverse(String str, int type) {

        switch (type) {

            case 1:
                char[] chars = str.toCharArray();
                // 1.进出栈
                Stack<Character> characters = new Stack<>();
                for (char aChar : chars) {
                    characters.push(aChar);
                }
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = characters.pop();
                }
                return String.valueOf(chars);
            case 2:
                // 2.利用StringBuffer的reverse方法
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.reverse();
                return stringBuffer.toString();
            case 3:
                // 3.倒序遍历
                char[] charArray = str.toCharArray();
                String str2 = new String();
                for (int i = charArray.length - 1; i >= 0; i--) {
                    str2 = str2 + charArray[i];
                }
                return str2;
            default:
                return null;
        }
    }
}
