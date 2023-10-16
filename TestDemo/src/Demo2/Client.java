package Demo2;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("===客户端启动===");
        // 1.实现客户端类
        Socket socket = new Socket(
                InetAddress.getLocalHost(),8888);

        // 2.得到输入字节输出流
        OutputStream os = socket.getOutputStream();

        // 3.包装字节输出流
        PrintWriter pw = new PrintWriter(os);

        // 4.输出到服务端
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true){
            System.out.println("请说：");
            str = sc.nextLine();
            pw.println(str);
            if ("exit".equals(str)){
                socket.close();
                break;
            }
            pw.flush();
        }


    }
}
