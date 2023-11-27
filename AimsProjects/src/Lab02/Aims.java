package Lab02;  //Nguyễn Văn Nam - 20215097

public class Aims {

	public static void main(String[] args) {
    	//Create a new cart 
    	Cart anOrder = new Cart();
    	//Create new dvd objects and add them to the cart 
    	DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
    	anOrder.addDigitalVideoDisc (dvd1);
    	DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
    	anOrder.addDigitalVideoDisc (dvd2);
    	DigitalVideoDisc dvd3= new DigitalVideoDisc ("Aladin", "Animation", 18.99f); 
    	anOrder.addDigitalVideoDisc (dvd3);
    	//print total cost of the items in the cart 
    	anOrder.removeDigitalVideoDisc(dvd1);
    	System.out.println("Total Cost is: "); 
    	System.out.println(anOrder.totalCost());
    	
    	System.out.println("\nTesting removeDigitalVideoDisc method");
	    //remove dvd3 
	    anOrder.removeDigitalVideoDisc(dvd3);
	    //show cart
	    anOrder.showCart();
    	
    	// Tạo danh sách DVDS
    	DigitalVideoDisc[] dvdList = new DigitalVideoDisc[4];
    	dvdList[0]=dvd1;
    	dvdList[1]=dvd2;
    	dvdList[2]=dvd3;
    	dvdList[3]=dvd2;
    	 	
    	//Kiểm tra Overloaded method addDigitalVideoDisc
    	//Phương thức thêm danh sách DVDS 	
    	
    	System.out.println("\nKiểm tra phương thức chồng thêm danh sách DVD:");
    	anOrder.showCart();							//show cart
    	anOrder.addDigitalVideoDisc(dvdList);		//add DVDs
    	anOrder.showCart();							//show cart
    	
    	//method add two DVDs
    	System.out.println("\nKiểm tra phương thức chồng thêm 2 DVD:");
    	anOrder.addDigitalVideoDisc(dvd3,dvd1);		//add DVDs
    	anOrder.showCart();							//show cart
	}

	

}//Nguyễn Văn Nam - 20215097
