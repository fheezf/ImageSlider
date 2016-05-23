
package slider.core;

import java.io.IOException;


public class NextCommand extends Command{

    private Slider slider;

    public NextCommand(Slider slider) {
        this.slider = slider;
    }
    
    
    
    @Override
    public void execute() throws IOException {
        slider.next();
    }
    
}
