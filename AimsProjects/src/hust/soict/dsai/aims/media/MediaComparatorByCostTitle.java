package hust.soict.dsai.aims.media; //Nguyễn Văn Nam - 20215097

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    
    public int compare(Media m1, Media m2) {
        int costCompare = Float.compare(m2.getCost(), m1.getCost());
        if (costCompare != 0) {
            return costCompare; // Sắp xếp theo giá giảm dần
        } else {
            return m1.getTitle().compareToIgnoreCase(m2.getTitle()); // Nếu giá giống nhau, sắp xếp theo tiêu đề
        }
    }
}
