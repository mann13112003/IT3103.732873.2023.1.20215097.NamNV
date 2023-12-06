package hust.soict.dsai.aims.media;//Nguyễn Văn Nam - 20215097

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost); // Gọi constructor của lớp cha với các tham số tương ứng
        this.length = length;
        this.director = director;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Getter cho director
    public String getDirector() {
        return director;
    }
}