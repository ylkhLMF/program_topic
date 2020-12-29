package fastJson.single;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;


/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: SingleSerializeConfig
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 23:07 2020/12/20
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 23:07       liumf           v1.1.0
 */
public class SingleSerializeConfig {

    private SingleSerializeConfig() {
    }
    private static SingleSerializeConfig  serializeConfig;

    public static SingleSerializeConfig getSerializeConfig(){
        if (serializeConfig == null) {
            synchronized (SingleSerializeConfig.class) {
                if (null == serializeConfig) {
                    serializeConfig = new SingleSerializeConfig();
                }
            }
        }
        return serializeConfig;
    }

    public SerializeConfig UP(){
        SerializeConfig config = new SerializeConfig();
        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        return config;
    }
}
