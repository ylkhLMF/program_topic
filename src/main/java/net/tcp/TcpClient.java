package net.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author dreamFly
 * @date 18:26 2020/8/23
 * @className TcpClient
 * @description 客户端
 */

public class TcpClient {
    private static final String IP ="localHost";
    private static final int PORT =9999;


    public static void main(String[] args) {
        // 1.服务器地址
        InetAddress localhost = null;
        Socket socket = null;
        OutputStream stream = null;

        try {
            localhost = InetAddress.getByName(IP);
            // 2.创建socket连接
            socket = new Socket(localhost, PORT);
            // 3. 发送消息
            stream = socket.getOutputStream();
            // 4. 写入信息
            stream.write("你好".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 5. 关闭连接
            closeOutputStreamResource(stream);
            closeSocketResource(socket);
        }
    }
    private static void closeOutputStreamResource(OutputStream stream){

        if (null != stream){
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeSocketResource(Socket socket){
        if (null !=socket){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
