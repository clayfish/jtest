package in.clayfish;

/**
 * @author shuklaalok7
 * @since 29/07/2016
 */
public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating='" + rating + '\'' +
                ", bpm='" + bpm + '\'' +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.title);
    }
}
