package hust.soict.dsai.test.disc;//Nguyễn Văn Nam - 20215097

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc ("Jungle"); 
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc ("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle()); 
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		//Trả lại tên cho jungleDVD
		changeTitle(jungleDVD, "Jungle");
    	
		//Kiểm tra phương thức swap đúng
		swapCorrectly(jungleDVD,cinderellaDVD);
		
		System.out.println("\n Swap correct");
    	System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    	System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());

	}
	
	public static void swap (Object o1, Object o2) {

		Object tmp= o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle(); 
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	//phương thức swap đúng
	public static void swapCorrectly(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
	    String tmp = dvd1.getTitle();
	    dvd1.setTitle(dvd2.getTitle());
	    dvd2.setTitle(tmp);
	    }	
}