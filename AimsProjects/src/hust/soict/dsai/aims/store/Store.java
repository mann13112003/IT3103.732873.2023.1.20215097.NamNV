package hust.soict.dsai.aims.store;  //Nguyễn Văn Nam - 20215097

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store() {
        itemsInStore = new ArrayList<>();
    }
    public void addMedia(Media media) {
        itemsInStore.add(media);
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }
    public static void storeMenu() {

    	System.out.println("Options: ");

    	System.out.println("--------------------------------");

    	System.out.println("1. See a media’s details");

    	System.out.println("2. Add a media to cart");

    	System.out.println("3. Play a media");

    	System.out.println("4. See current cart");

    	System.out.println("0. Back");

    	System.out.println("--------------------------------");

    	System.out.println("Please choose a number: 0-1-2-3-4");

    	}

}
