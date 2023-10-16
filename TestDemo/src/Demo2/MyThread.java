package Demo2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyThread extends Thread{
    private Socket socket;

    @Override
    public void run() {
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

    }
}
