package Lab02;

public class DigitalVideoDisc {
//thuộc tính 
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
//Các phương thức getter cho các thuộc tính
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLenght() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
//Constructor
	// Phương thức khởi tạo dựa trên tiêu đề
  public DigitalVideoDisc(String title) {
      this.title = title;
  }

  // Phương thức khởi tạo dựa trên danh mục, tiêu đề và giá thành
  public DigitalVideoDisc(String category, String title, float cost) {
      this.category = category;
      this.title = title;
      this.cost = cost;
  }

  // Phương thức khởi tạo dựa trên đạo diễn, danh mục, tiêu đề và chi phí
  public DigitalVideoDisc(String director, String category, String title, float cost) {
      this.director = director;
      this.category = category;
      this.title = title;
      this.cost = cost;
  }

  // Phương thức khởi tạo dựa trên tất cả các thuộc tính: tiêu đề, danh mục, đạo diễn,
  //độ dài và chi phí
  public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
      this.title = title;
      this.category = category;
      this.director = director;
      this.length = length;
      this.cost = cost;
  }

}   //Nguyễn Văn Nam - 20215097

