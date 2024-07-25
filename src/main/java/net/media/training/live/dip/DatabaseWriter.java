package net.media.training.live.dip;

public class DatabaseWriter implements Writer{
    @Override
    public void write(String data) {
        MyDatabase database = new MyDatabase();
        database.write(data);
    }
}
