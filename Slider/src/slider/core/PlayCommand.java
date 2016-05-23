
package slider.core;

import java.io.IOException;

public class PlayCommand extends Command{
    
    private Slider slider;
    private boolean play=false;

    public PlayCommand(Slider slider) {
        this.slider = slider;
    }
    

    @Override
    public void execute() throws IOException {
        if (play) {
            slider.pause();
            play=false;
        } else {
            slider.play();
            play=true;
        }
    }
    
}
