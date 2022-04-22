package test.assignment07.Exercise4.back_end;

import java.io.File;
import java.io.FileInputStream;

public class IOManager {
    public void readFile(String filePath) throws Exception {
        var file = new File(filePath);
        if (!file.exists())
            throw new Exception("Error! File does not exist!");
        else {
            byte[] readByte = new byte[1024];
            var fileInputStream = new FileInputStream(file);
            int length = fileInputStream.read(readByte);

            while (length != -1) {
                var content = new String(readByte,0, readByte.length);
                System.out.print(content);
                length = fileInputStream.read(readByte);
            }
            fileInputStream.close();
        }
    }

    public void writeFile(String filePath, boolean isContinuing, String content) {
        var file = new File(filePath);

    }
}
