package slider.desktop;

import java.awt.image.BufferedImage;
import slider.core.Bitmap;

public class AwtBitmap extends Bitmap {    
    private BufferedImage data;

    public AwtBitmap(BufferedImage data) {
        this.data = data;
    }

    public BufferedImage getData() {
        return data;
    }
    
}
