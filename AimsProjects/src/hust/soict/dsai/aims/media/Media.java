package hust.soict.dsai.aims.media;//Nguyễn Văn Nam - 20215097
public abstract class Media {
	private int id;
	private String title;
	private String category;  
	private float cost;
	private static final MediaComparatorByTitleCost mediaComparatorByTitleCost = new MediaComparatorByTitleCost();
    private static final MediaComparatorByCostTitle mediaComparatorByCostTitle = new MediaComparatorByCostTitle();
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true; // Trường hợp cùng một đối tượng
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false; // Kiểu dữ liệu khác hoặc obj là null
	    }
	    Media media = (Media) obj;
	    return title.equals(media.title);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;//Nguyễn Văn Nam - 20215097
	}
}//Nguyễn Văn Nam - 20215097
