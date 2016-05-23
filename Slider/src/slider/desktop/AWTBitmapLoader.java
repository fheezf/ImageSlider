package slider.desktop;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import slider.core.Bitmap;
import slider.core.BitmapLoader;

public class AwtBitmapLoader extends BitmapLoader {

    @Override
    public Bitmap load(String uri) {
        try {
            BufferedImage data = ImageIO.read(new File(uri));
            return new AwtBitmap(data);
        } catch (IOException e) {
            return null;
        }
    }
}
