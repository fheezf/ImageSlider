
package slider.desktop;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ToolbarPanel extends JPanel{
    
    private JButton playButton;
    private JButton nextButton;
    private JButton prevButton;

    public ToolbarPanel(JButton playButton, JButton nextButton, JButton prevButton) {
        
        setMaximumSize(new Dimension(1024, 50));
        setLayout(new FlowLayout());
        addButtons(playButton, nextButton, prevButton);
    }        
        
        
    private void addButtons(JButton playButton, JButton nextButton, JButton prevButton) {
        this.playButton = playButton;
        playButton.setText("Play");
        this.nextButton = nextButton;
        nextButton.setText("Next");
        this.prevButton = prevButton;
        prevButton.setText("Previous");
        
        add(prevButton);
        add(playButton);
        add(nextButton);
    }
    
    
    
}
