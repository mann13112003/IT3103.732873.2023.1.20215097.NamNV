package Lab02; //Nguyễn Văn Nam 20215097

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	// Sức chứa tối đa của giỏ hàng, giả sử là 20 đĩa
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	// Mảng chứa các đối tượng DigitalVideoDisc trong giỏ hàng
	private int qtyOrdered;

	public Cart() {
		itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		qtyOrdered = 0;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) { // Nếu giỏ hàng chưa đầy
			itemsOrdered[qtyOrdered] = disc; // Thêm đĩa vào vị trí qtyOrdered
			qtyOrdered++; // Tăng số lượng đĩa trong giỏ hàng
			System.out.println("Đĩa đã được thêm vào giỏ hàng.");
		} 
		else {
			System.out.println("Giỏ hàng gần đầy."); // Thông báo nếu giỏ hàng đã đầy
		}
	}
	// Overloaded method 1
	public void addDigitalVideoDisc (DigitalVideoDisc [] dvdList) { 
		for (DigitalVideoDisc dvd :dvdList) { 
			addDigitalVideoDisc (dvd);
		}
	}
	// Overloaded method 2
	public void addDigitalVideoDisc (DigitalVideoDisc dvdl, DigitalVideoDisc dvd2) { 
		addDigitalVideoDisc (dvdl); 
		addDigitalVideoDisc (dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
      for (int i = 0; i < qtyOrdered; i++) { // Duyệt từng đĩa trong giỏ hàng
          if (itemsOrdered[i] == disc) { // Nếu tìm thấy đĩa cần xóa
              for (int j = i; j < qtyOrdered - 1; j++) {
                  itemsOrdered[j] = itemsOrdered[j + 1]; 
                  // Di chuyển các đĩa phía sau về trước để xóa đĩa hiện tại
              }
              qtyOrdered--; // Giảm số lượng đĩa trong giỏ hàng
              itemsOrdered[qtyOrdered] = null; 
              // Gán vị trí cuối cùng là null (đối tượng đã xóa)
              System.out.println("Đĩa đã được xóa khỏi giỏ hàng.");
              return;
          }
      }
      System.out.println("Không tìm thấy đĩa trong giỏ hàng.");

	}
	
	//Hiển thị các DVDS trong giỏ hàng
	public void showCart ()
	{   
		System.out.println("  Giỏ hàng hiện có:");
		int i = 1;
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null) {
				System.out.println(i++ + " " + disc.getTitle() + " " + disc.getCost());
			}
        }
	}
	public float totalCost() {
      float total = 0; // Khởi tạo tổng chi phí
      for (int i = 0; i < qtyOrdered; i++) { // Duyệt qua từng đĩa trong giỏ hàng
          total += itemsOrdered[i].getCost(); // Cộng thêm chi phí của từng đĩa vào tổng
      }
      return total; // Trả về tổng chi phí của giỏ hàng
   }
	
	// in danh sách các mặt hàng đã đặt trong giỏ hàng, giá từng mặt hàng và tổng giá
		public void print()
	    {   
	        int i = 1;
	        System.out.println("**********************CART**********************");
	        for (DigitalVideoDisc disc : itemsOrdered) {
	        	if (disc != null) {
	        		System.out.println(i++ + ".DVD - " + disc.toString());
	        	}
	        }
	        System.out.print("Total Cost: ");
	        System.out.println(totalCost());
	        System.out.println("*************************************************");
	    }
		
	

}//Nguyễn Văn Nam - 20215097
