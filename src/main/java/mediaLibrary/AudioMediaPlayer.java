package mediaLibrary;

public interface AudioMediaPlayer extends AudiblePlayer {
    void play();
    void display();
    void printInfo();
    void loadMedia(String filename);
}
