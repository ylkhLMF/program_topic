package thread;

import thread.util.WebDownLoad2File;

/**
 * @author dreamFly
 * @date 22:40 2020/9/9
 * @className MyThreadDownLoad
 * @description
 */

public class MyThreadDownLoad extends Thread {

    private String URL;
    private String fileName;

    public MyThreadDownLoad(String url,String fileName){
        this.fileName =fileName;
        this.URL =url;
    }

    @Override
    public void run() {
        WebDownLoad2File webDownLoad2File = new WebDownLoad2File();
        webDownLoad2File.webImage2File(URL,fileName);
        System.out.println("下载了文件名为:"+fileName);
    }

    public static void main(String[] args) {
        MyThreadDownLoad myThreadDownLoad1 = new MyThreadDownLoad("http://img3.tbcdn.cn/5476e8b07b923/TB1waOtNpXXXXX7apXXXXXXXXXX", "image1.jpg");
        MyThreadDownLoad myThreadDownLoad2 = new MyThreadDownLoad("http://img3.tbcdn.cn/5476e8b07b923/TB1ZzOJNpXXXXahXVXXXXXXXXXX", "image2.jpg");
        MyThreadDownLoad myThreadDownLoad3 = new MyThreadDownLoad("http://img3.tbcdn.cn/5476e8b07b923/TB1dgOVNpXXXXaRXpXXXXXXXXXX", "image3.jpg");
        myThreadDownLoad1.start();
        myThreadDownLoad2.start();
        myThreadDownLoad3.start();
    }

}
