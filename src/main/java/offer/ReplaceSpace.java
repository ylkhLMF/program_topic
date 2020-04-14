package offer;

/**
 * @author dreamFly
 * @date 23:36 2020/4/14
 * @className offer.ReplaceSpace
 * @description 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class ReplaceSpace {


    /**
     * 方法一
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {

        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).equals(" ")) {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(str.charAt(i));
            }

        }
        return stringBuffer.toString();
    }

    /**
     * 方法二
     * @param str
     * @return
     */
    public String replaceSpace2(StringBuffer str) {

        if (str == null) {
            return null;
        }
        return str.toString().replaceAll(" ","%20");
    }

    /**
     * 方法三
     * @param str
     * @return
     */
    public static String replaceSpace3(StringBuffer str) {

        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (" ".equals(String.valueOf(str.charAt(i)))) {
                str.replace(i, i + 1, "%20");
            }
        }
        return str.toString();

    }
}
