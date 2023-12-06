package hust.soict.dsai.aims.media;  //Nguyễn Văn Nam - 20215097

import java.util.ArrayList;
import java.util.List;

public class DigitalVideoDisc extends Disc {
	List<Media> mediae = new ArrayList<Media>();
    private static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc(int id, String title, String category, float cost,
    		String director, int length) {
        super(id, title, category, cost, length, director); 
        // Gọi constructor của lớp cha Disc với các tham số tương ứng
    }

    public void play() {
        System.out.println("Đang phát DVD: " + this.getTitle());
        System.out.println("Độ dài DVD: " + this.getLength());
    } 
//Constructor

  public String toString() 
	{
		String dvd;
		dvd = "[" + getTitle() + "]-[" + getCategory() + "]-[" + getDirector() + "]-["  +getLength() + "]: " + getCost() + "$";
		return dvd;
	}


}   //Nguyễn Văn Nam - 20215097

