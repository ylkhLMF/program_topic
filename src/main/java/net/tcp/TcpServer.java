package net.tcp;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author dreamFly
 * @date 18:27 2020/8/23
 * @className TcpServer
 * @description 服务端(先启动server端)
 */

public class TcpServer {

    private static final int PORT = 9999;

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream osMsg = null;
        // 管道流
        ByteArrayOutputStream pipeline = null;
        try {
            // 1.首先需要个地址
            serverSocket = new ServerSocket(PORT);
            while (true){
                // 2. 等待客户端连接
                socket = serverSocket.accept();
                // 3.读取客户端消息
                osMsg = socket.getInputStream();
                pipeline = new ByteArrayOutputStream();
                // 4.创建一个缓冲区,把消息写入缓冲区
                byte[] bytes = new byte[1024];
                int len;
                while ((len=osMsg.read(bytes)) !=-1){
                    pipeline.write(bytes,0,len);
                }
                System.out.println(pipeline.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5. 释放资源
            closeByteArrayOutputStream(pipeline);
            closeInputStream(osMsg);
            closeSocketResource(socket);
            closeServerSocket(serverSocket);
        }
    }

    private static void closeInputStream(InputStream stream){
        if (null !=stream){
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void closeServerSocket(ServerSocket serverSocket){

        if (null != serverSocket){
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    private static void closeByteArrayOutputStream(ByteArrayOutputStream byteArrayOutputStream){
        if (null!=byteArrayOutputStream){
            try {
                byteArrayOutputStream.close();
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
