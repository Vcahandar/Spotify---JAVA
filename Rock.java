package lesson20Mentor;

public class Rock  implements  Music{

    private String title;
    private String artist;
    private int durationInSeconds;

    public Rock(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
    @Override
    public String getDetails() {
        return "Podcast - Title: " + title + ", Duration: " + durationInSeconds + " seconds";
    }



}
