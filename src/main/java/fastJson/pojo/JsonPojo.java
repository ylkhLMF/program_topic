package fastJson.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Copyright: Copyright (c) 2021 Dreamfly
 *
 * @ClassName: JsonPojo
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 15:50 2021/8/17
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 15:50       liumf           v1.1.0
 */
public class JsonPojo {

    @JSONField(name = "JSON_NAME")
    private String jsonName;

    public String getJsonName() {
        return jsonName;
    }

    public void setJsonName(String jsonName) {
        this.jsonName = jsonName;
    }
}
