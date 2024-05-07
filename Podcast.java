package lesson20Mentor;

public class Podcast implements  Playable{
    private String title;
    private int durationInSeconds;

    public Podcast(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String getDetails() {
        return "Podcast - Title: " + title + ", Duration: " + durationInSeconds + " seconds";
    }
}
