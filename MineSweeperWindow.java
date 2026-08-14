
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;


public class MineSweeperWindow extends JFrame{
    int height = 400, 
        width = 400, 
        gridHeight = 0, 
        gridWidth = 0;

    JButton easy, 
            med, 
            hard;
    
    
    public MineSweeperWindow(){

        setSize(height, width);
        setLayout(new GridLayout(1,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton easy = new JButton("Easy");
        JButton med = new JButton("Medium");
        JButton hard = new JButton("Hard");
        add(easy);
        add(med);
        add(hard);
        
        ActionListener ez = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                gridHeight = 9;
                gridWidth = 9;
            }
        };

        ActionListener md = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                gridHeight = 16;
                gridWidth = 16;
            }
        };

        ActionListener hd = new ActionListener() {
            public void actionPerformed( ActionEvent e){
                gridHeight = 30;
                gridWidth = 16;
            }
        };

        easy.addActionListener(ez);
        med.addActionListener(md);
        hard.addActionListener(hd);

        setVisible(true);
    }
    void makeGameWindow(int height, int width){
        
    }
    

}