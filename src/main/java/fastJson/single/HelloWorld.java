package fastJson.single;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Copyright: Copyright (c) 2021 AsiaInfo
 *
 * @ClassName: HelloWorld
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 16:32 2021/10/22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 16:32       liumf           v1.1.0
 */
public class HelloWorld {


    public static void main(String[] args) {



        List list = new ArrayList<String>(16);

        for (int i = 0; i < 10; i++) {

            list.add("元素"+i);

        }

        System.out.println(list);

        List newList= new ArrayList(16);

        Collections.addAll(newList,new String[list.size()]);

        Collections.copy(newList,list);

        System.out.println(newList);

        // list.add(0,"xxx");
        // Object o = list.get(0);

        list.set(0,"liu");

        System.out.println(list);
        System.out.println(newList);








    }
}