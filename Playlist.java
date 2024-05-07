package lesson20Mentor;

import java.util.ArrayList;
import java.util.List;

public class Playlist <T extends  Playable> {
    private List<T> playlist = new ArrayList<>();

    public void addToList(T playable) {
        playlist.add(playable);
    }

    public void printDetails() {
        for (T item : playlist) {
            System.out.println(item.getDetails());
        }
    }

}

