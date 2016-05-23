package slider.core.view;

import slider.core.Observer;
import slider.core.Slider;

public class SliderObserver extends Observer {
    private Slider slider;
    private ImageViewer imageViewer;

    public SliderObserver(Slider slider) {
        this.slider = slider;
        this.slider.add(this);
        this.imageViewer = null;
    }

    public ImageViewer getImageViewer() {
        return imageViewer;
    }

    public void setImageViewer(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
        update();
    }

    @Override
    public void changed() {
        update();
    }
    
    private void update() {
        if (imageViewer == null) return;
        imageViewer.setImage(slider.getCurrentImage());
    }
    
    

}
