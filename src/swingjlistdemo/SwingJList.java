package swingjlistdemo;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Ankur-Agg
 */
public class SwingJList {
     public static JList  mylist;
    public static void main(String args[]){
        JFrame frame = new JFrame("Swing JList demo CSE 5D");
       
        String[] mylistdata = {"Ankur","MWMF","Data","a","b","c","d","e","f","g","h"};
        
        mylist = new JList(mylistdata);
        
        JScrollPane sp = new JScrollPane(mylist);
        //mylist.setVisibleRowCount(5);
        
        
        System.out.println(mylist.getSelectedValuesList());
        frame.add(sp);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
   
}
