package Demo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("===服务端启动===");

        // 1.创建服务端类
        try {
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2.接收客户端Socket连接请求
            Socket socket = serverSocket.accept();

            // 3.得到字节输入流
            InputStream is = socket.getInputStream();

            // 4.包装输入流为字符输入缓冲流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // 5.读取消息
            String str = "";
            while ((str = br.readLine()) != null){
                if (!"exit".equals(str)){
                System.out.println("收到" + socket.getRemoteSocketAddress() + "的消息：" + str);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
