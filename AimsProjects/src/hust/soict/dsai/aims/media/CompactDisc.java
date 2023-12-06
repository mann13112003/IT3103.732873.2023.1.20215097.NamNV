package hust.soict.dsai.aims.media;//Nguyễn Văn Nam - 20215097
import java.util.ArrayList;
public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;
    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super(id, title, category, cost, 0, director); // Giả định độ dài ban đầu của CD là 0
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
    
    public void play() {
        System.out.println("Đang phát CD: " + this.getTitle());
        System.out.println("Độ dài CD: " + this.getLength());

        for (Track track : tracks) {
            track.play();
        }
    }
    
    // Phương thức getter cho artist
    public String getArtist() {
        return artist;
    }
    // Phương thức thêm track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Bản nhạc đã tồn tại trong CD.");
        } else {
            tracks.add(track);
        }
    }
    // Phương thức xoá track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Bản nhạc đã được xoá khỏi CD.");
        } else {
            System.out.println("Bản nhạc không tồn tại trong CD.");
        }
    }
    // Phương thức lấy độ dài của CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
