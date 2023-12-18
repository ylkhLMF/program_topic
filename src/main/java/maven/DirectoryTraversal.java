package maven;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: program_topic
 * @description:
 * @author: liumf
 * @create: 2023-11-06 10:13
 **/

public class DirectoryTraversal {

    public static void main(String[] args) {


        int i = 1/0;

    }

    public static String[] extractIPAddresses(String text) {
        // 定义IP地址的正则表达式模式
        String ipPattern = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";

        // 编译正则表达式
        Pattern pattern = Pattern.compile(ipPattern);

        // 在文本中查找匹配的部分
        Matcher matcher = pattern.matcher(text);

        // 存储提取到的IP地址
        java.util.List<String> ipAddresses = new java.util.ArrayList<>();

        // 遍历匹配结果并添加到列表中
        while (matcher.find()) {
            ipAddresses.add(matcher.group());
        }

        // 将列表转换为数组并返回
        return ipAddresses.toArray(new String[0]);
    }
}
