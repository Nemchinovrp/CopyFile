import java.io.IOException;

public class CopyFile {

   
    public static void main(String[] args) throws IOException {
       java.io.FileInputStream fileInputStream =
                        new java.io.FileInputStream("/home/roman/Desktop/val.txt");
        java.io.FileOutputStream fileOutputStream =
                        new java.io.FileOutputStream("/home/roman/Desktop/val2.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
    
}
