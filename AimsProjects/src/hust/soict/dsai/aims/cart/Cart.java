package hust.soict.dsai.aims.cart; //Nguyễn Văn Nam 20215097

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	// Mảng chứa các đối tượng DigitalVideoDisc trong giỏ hàng
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
        itemsOrdered.add(media);
    }
    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }
    
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
	
}//Nguyễn Văn Nam - 20215097
