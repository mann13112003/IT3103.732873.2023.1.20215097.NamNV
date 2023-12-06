package hust.soict.dsai.aims.media;  //Nguyễn Văn Nam - 20215097

public class Track {
    String title;
    int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    public void play() {
        System.out.println("Đang phát track: " + this.getTitle());
        System.out.println("Độ dài track: " + this.getLength());
    }

    // Getter cho title
    public String getTitle() {
        return title;
    }
    // Getter cho length
    public int getLength() {
        return length;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Trường hợp cùng một đối tượng
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Kiểu dữ liệu khác hoặc obj là null
        }
        Track track = (Track) obj;
        return title.equals(track.title) && length == track.length;
    }
}//Nguyễn Văn Nam - 20215097
