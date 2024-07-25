package net.media.training.live.dip;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements Writer {
     private String filePath;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath));
        writer.write(data);
        writer.close();
    }
}
