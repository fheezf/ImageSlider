package slider.desktop;

import java.awt.image.BufferedImage;
import slider.core.Bitmap;
import slider.core.Image;
import slider.core.view.ImageViewer;

public class SwingImageViewer extends ImageViewer {
    private ImagePanel panel;

    public SwingImageViewer() {
        panel = new ImagePanel();
    }
    
    public ImagePanel getPanel() {
        return panel;
    }

    @Override
    public void refresh() {
        Bitmap bitmap = getImage().getBitmap();
        if (bitmap instanceof AwtBitmap) {
            BufferedImage data = ((AwtBitmap) bitmap).getData();
            panel.setImage(data);
        }
    }
    
}
