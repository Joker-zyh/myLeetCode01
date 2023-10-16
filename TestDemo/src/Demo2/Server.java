package Demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
