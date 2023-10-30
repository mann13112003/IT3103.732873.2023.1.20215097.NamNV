package lab02;  //Nguyễn Văn Nam - 20215097

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
	
	public float totalCost() {
        float total = 0; // Khởi tạo tổng chi phí
        for (int i = 0; i < qtyOrdered; i++) { // Duyệt qua từng đĩa trong giỏ hàng
            total += itemsOrdered[i].getCost(); // Cộng thêm chi phí của từng đĩa vào tổng
        }
        return total; // Trả về tổng chi phí của giỏ hàng
    }
}//Nguyễn Văn Nam - 20215097
