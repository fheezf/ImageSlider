
package slider.core;

import java.io.IOException;


public class PrevCommand extends Command {
    
    private Slider slider;

    public PrevCommand(Slider slider) {
        this.slider = slider;
    }
    
    

    @Override
    public void execute() throws IOException {
        slider.prev();
    }
    
}
