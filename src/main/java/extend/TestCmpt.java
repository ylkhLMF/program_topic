package extend;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: TestCmpt
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 10:04 2020/12/15
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 10:04       liumf           v1.1.0
 */
public class TestCmpt extends CmptAfter {


    @Override
    public void handleMethod(String... str) {

        System.out.println("上层执行");
    }


    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("extend.TestCmpt2");
        CmptBase base =(CmptBase) aClass.newInstance();
        base.execute(11);
    }
}
