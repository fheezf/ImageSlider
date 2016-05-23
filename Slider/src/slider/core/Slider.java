package slider.core;

import java.util.Timer;
import java.util.TimerTask;

public class Slider extends Observable {
    private static final int PERIOD = 2000;
    private Image currentImage;
    private Timer timer = null;
    
    public Slider() {
    }

    public Image getCurrentImage() {
        return currentImage;
    }

    public void setCurrentImage(Image currentImage) {
        this.currentImage = currentImage;
        notifyChanges();
    }
    
    public void next() {
        setCurrentImage(currentImage.getNext());
    }
    
    public void prev() {
        setCurrentImage(currentImage.getPrev());
    }
    
    public void play() {
        if (timer != null) return;
        timer = new Timer();
        timer.scheduleAtFixedRate(getTimerTask(), PERIOD, PERIOD);
    }
    
    public void pause() {
        if (timer == null) return;
        timer.cancel();
        timer = null;
    }

    private TimerTask getTimerTask() {
        return new TimerTask() {

            @Override
            public void run() {
                next();
            }
        };
    }
    

}
