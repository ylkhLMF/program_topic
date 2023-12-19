package fastJson;

import lombok.Data;

/**
 * Copyright: Copyright (c) 2020 Dreamfly
 *
 * @ClassName: Output
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 17:24 2020/10/23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 17:24       liumf           v1.1.0
 */
@Data
public class Output {

    private boolean isHave;
    private String isNoHave;

    public Boolean getHave() {
        return isHave;
    }

    public void setHave(Boolean have) {
        isHave = have;
    }
}
