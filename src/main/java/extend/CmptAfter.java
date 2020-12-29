package extend;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: CmptAfter
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 9:58 2020/12/15
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 9:58       liumf           v1.1.0
 */
public abstract class CmptAfter implements CmptBase {


    @Override
    public String execute(Object... str) throws Exception {
         System.out.println("CmptAfter被初始化了。");
         handleMethod("123456");
         return null;
    }



    public abstract void handleMethod(String ... str);
}
