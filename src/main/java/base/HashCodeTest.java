package base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Copyright: Copyright (c) 2021 AsiaInfo
 *
 * @ClassName: HashCodeTest
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 11:00 2021/9/6
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 11:00       liumf           v1.1.0
 */
public class HashCodeTest {


    @Test
    public void getHashCode(){

        new ArrayList<>();
        HashCodeTest hashCodeTest = new HashCodeTest();
        HashCodeTest hashCodeTest2 = hashCodeTest;
        System.out.println(hashCodeTest.hashCode());
        System.out.println(hashCodeTest2.hashCode());
        Set set  =new HashSet();
        set.add(hashCodeTest);
        set.add(hashCodeTest2);
        System.out.println(set.size());

    }
}
