package hutool.convert;

import cn.hutool.core.convert.Convert;

/**
 * Copyright: Copyright (c) 2021 AsiaInfo
 *
 * @ClassName: ConvertUtil
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 11:29 2021/4/6
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 11:29       liumf           v1.1.0
 */
public class ConvertUtil {


    public static void main(String[] args) {

        int i = 10;

        String s = String.valueOf(i);
        System.out.println(s);

        String s1 = Convert.toStr(i);
        System.out.println(s1);

    }
}
