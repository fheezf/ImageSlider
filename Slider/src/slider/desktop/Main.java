package slider.desktop;

import javax.swing.JButton;
import slider.core.ImageList;
import slider.core.PlayCommand;
import slider.core.Slider;
import slider.core.NextCommand;
import slider.core.PrevCommand;
import slider.core.view.SliderObserver;

public class Main {

    public static void main(String[] args) {
        ImageList imageList = FileImageListLoader.getInstance().load("images");
        Slider slider = new Slider();
        slider.setCurrentImage(imageList.get(0));
        
        SwingImageViewer imageViewer = new SwingImageViewer();
        SliderObserver sliderObserver = new SliderObserver(slider);
        sliderObserver.setImageViewer(imageViewer);
        
        SliderFrame frame = new SliderFrame();
        frame.addPanel(imageViewer.getPanel());
        
        PlayCommand playCommand = new PlayCommand(slider);
        NextCommand nextCommand = new NextCommand(slider);
        PrevCommand prevCommand = new PrevCommand(slider);
        
        JButton playButton = new JButton();
        playButton.setAction(playCommand);
        
        JButton nextButton = new JButton();
        nextButton.setAction(nextCommand);
        
        JButton prevButton = new JButton();
        prevButton.setAction(prevCommand);
        
        ToolbarPanel toolbarPanel = new ToolbarPanel(playButton, nextButton, prevButton);
        
        frame.addPanel(toolbarPanel);
        
    }
}
