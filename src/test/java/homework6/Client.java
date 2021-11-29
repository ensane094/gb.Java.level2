package homework6;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    private final String SERVER_ADRESS = "localhost";
    private final int SERVER_PORT = 2111;
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutput output;

    public Client() {
        try {
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openConnection() throws IOException {
        socket = new Socket(SERVER_ADRESS, SERVER_PORT);
        inputStream = new DataInputStream(socket.getInputStream());
        output = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        new Thread(new Runnable() {                                         //поток принимающий данные
            @Override
            public void run() {
                String serverMsg;
                try {
                    while (true) {
                        serverMsg = inputStream.readUTF();
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        while (true) {
            String clientMsg = scanner.nextLine();
            if(clientMsg.equals("/end")){
                closeConnection();
            }
            output.writeUTF("Client: " + clientMsg);
        }

    }

    public void closeConnection() {
        try {                                       //Почему-то output.close идея не даёт сделать
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
