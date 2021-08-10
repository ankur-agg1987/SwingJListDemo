package swingjlistdemo;

import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author Ankur-Agg
 */
public class SwingJListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("Our Swing JList demo");
        
        String data[] = {"ABC", "Xyz", "AA", "Hello"};
        JList mylist = new JList(data);
        
        frame.add(mylist);
        
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

                
    }
    
}
