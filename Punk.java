package lesson20Mentor;

public class Punk implements Music {

    private String title;
    private String artist;
    private int durationInSeconds;

    public Punk(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String getDetails() {
        return "Punk - Title: " + title + ", Artist: " + artist + ", Duration: " + durationInSeconds + " seconds";
    }

}
