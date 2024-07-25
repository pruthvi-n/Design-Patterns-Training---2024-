package net.media.training.live.dip;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader implements Reader{
    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException{
        BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
}
