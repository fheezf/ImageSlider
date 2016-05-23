package slider.core;

import java.util.ArrayList;

public class ImageList extends ArrayList<Image> {

    public ImageList link() {
        Image sentinel = get(size()-1);
        for (Image image : this) {
            image.setPrev(sentinel);
            sentinel.setNext(image);
            sentinel = image;
        }
        return this;
    }

}
