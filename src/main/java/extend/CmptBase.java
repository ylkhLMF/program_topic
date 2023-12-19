package extend;

/**
 * Copyright: Copyright (c) 2020 Dreamfly
 *
 * @InterfaceName: CmptBase
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 9:54 2020/12/15
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 9:54       liumf           v1.1.0
 */
public interface CmptBase {

    public <T> T execute(Object ... str) throws Exception;
}
