package net.media.training.live.dip;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private Reader reader;
    private Writer writer;

    public EncodingModule(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() {
        try {
            String input = reader.read();
            String encoded = Base64.getEncoder().encodeToString(input.getBytes());
            writer.write(encoded);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
