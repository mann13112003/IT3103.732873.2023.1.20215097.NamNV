package hust.soict.dsai.aims.media; //Nguyễn Văn Nam - 20215097
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors= new ArrayList<String>();
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
        this.authors = new ArrayList<>();
	// TODO Auto-generated constructor stub

	}

	public List<String> getAuthors() {
		return authors;
	}


	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}


	public void addAuthor(String AuthorName) {
		if (!authors.contains(AuthorName)) {
            authors.add(AuthorName);
        }
	}
	
	public void removeAuthor(String AuthorName) {
		authors.remove(AuthorName);
	}

}  //Nguyễn Văn Nam -20215097
