package homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Почему-то даже при добавлении в потоки проверки на пустое сообщение (clientMsg.isEmpty())
 * Что в инпуте что в аутпуте программа не реагирует совершенно. Пока что я не додумался с чем это может быть связано.
 * Поэтому в чате будет писаться абсолютно всё.
 */

public class Server {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket socket = null;

        try (ServerSocket serverSocket = new ServerSocket(2111)) {
            socket = serverSocket.accept();
            System.out.println("Добро пожаловать ");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {                     //отправляющий поток
                @Override
                public void run() {
                    try {
                        while (true) {
                            String clientMsg = scanner.nextLine();
                            out.writeUTF("Server: " + clientMsg);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(new Runnable() {                   //принимающий поток
                @Override
                public void run() {
                    String serverMsg;
                    try {
                        while (true) {
                            serverMsg = in.readUTF();
                            System.out.println(serverMsg);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
