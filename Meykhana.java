package lesson20Mentor;

public class Meykhana implements Music {
    private String title;
    private String artist;
    private int durationInSeconds;

    public Meykhana(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String getDetails() {
        return "Meykhana - Title: " + title + ", Artist: " + artist + ", Duration: " + durationInSeconds + " seconds";
    }
}
