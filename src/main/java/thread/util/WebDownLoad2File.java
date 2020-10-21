package thread.util;

import lombok.extern.log4j.Log4j;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author dreamFly
 * @date 22:41 2020/9/9
 * @className WebDownLoad2File
 * @description
 */
@Log4j
public class WebDownLoad2File {

    /**
     * 下载器
     * @param url
     * @param fileName
     */
    public void webImage2File(String url,String fileName){

        try {
            FileUtils.copyURLToFile(new URL(url),new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            log.error("IO 异常");
        }

    }

}
