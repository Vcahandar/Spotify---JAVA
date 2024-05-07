package lesson20Mentor;

public class Main {

    public static void main(String[] args) {

        Playlist<Music> musicPlaylist = new Playlist<>();
        musicPlaylist.addToList(new Punk("London Calling", "The Clash", 180));
        musicPlaylist.addToList(new Rock("War", "Ramble On", 240));
        musicPlaylist.addToList(new Meykhana("Sen O Canana Gore", "Resad Dagli & Orxan ", 200));

        Playlist<Podcast> podcastPlaylist = new Playlist<>();
        podcastPlaylist.addToList(new Podcast("Söhbətgah", 600));
        podcastPlaylist.addToList(new Podcast("Balaban Podcast", 900));

        System.out.println("Details of Music Playlist:");
        musicPlaylist.printDetails();

        System.out.println("\nDetails of Podcast Playlist:");
        podcastPlaylist.printDetails();
    }
}
