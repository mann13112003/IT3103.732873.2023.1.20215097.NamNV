package hust.soict.dsai.aims.disc;  //Nguyễn Văn Nam - 20215097

public class DigitalVideoDisc {
//thuộc tính 
	private String title;
	private String category;
	private String director;
	public void setTitle(String title) {
		this.title = title;
	}

	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDisc = 0;
	
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
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
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
      this.id = ++nbDigitalVideoDisc;
  }

  // Phương thức khởi tạo dựa trên đạo diễn, danh mục, tiêu đề và chi phí
  public DigitalVideoDisc(String director, String category, String title, float cost) {
      this.director = director;
      this.category = category;
      this.title = title;
      this.cost = cost;
      this.id = ++nbDigitalVideoDisc;
  }

  // Phương thức khởi tạo dựa trên tất cả các thuộc tính: tiêu đề, danh mục, đạo diễn,
  //độ dài và chi phí
  public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
      this.title = title;
      this.category = category;
      this.director = director;
      this.length = length;
      this.cost = cost;
      this.id = ++nbDigitalVideoDisc;
  }
  
  //
  public String toString() 
	{
		String dvd;
		dvd = "[" + getTitle() + "]-[" + getCategory() + "]-[" + getDirector() + "]-["  +getLength() + "]: " + getCost() + "$";
		return dvd;
	}
  
  //
  public boolean isMatch(String title)  //Nguyễn Văn Nam 
	{  
  	return this.title.equalsIgnoreCase(title);
	}

}   //Nguyễn Văn Nam - 20215097

