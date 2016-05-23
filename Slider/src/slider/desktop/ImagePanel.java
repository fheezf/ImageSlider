package slider.desktop;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel() {
        setSize(1024, 628);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
    }
    
    
    
    

}
