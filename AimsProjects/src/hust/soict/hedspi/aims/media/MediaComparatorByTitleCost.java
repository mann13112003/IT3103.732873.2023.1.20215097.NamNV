package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int titleCompare = m1.getTitle().compareToIgnoreCase(m2.getTitle());
        if (titleCompare != 0) {
            return titleCompare; // Sắp xếp theo tiêu đề
        } else {
            return Float.compare(m2.getCost(), m1.getCost()); // Nếu tiêu đề giống nhau, sắp xếp theo giá giảm dần
        }
    }
}
