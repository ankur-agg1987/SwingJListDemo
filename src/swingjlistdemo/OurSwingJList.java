package swingjlistdemo;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Ankur-Agg
 */
public class OurSwingJList {
    
    public static void main(String []args){
        // create a container to hold list as component
        JFrame frame = new JFrame("Our Swing JList Demo");
        // create a string array to have list of elements for JList
        String [] listData = {"hello","ankur","mwmf","ajava","cse5c","netbeans","hello","ankur","mwmf","ajava","cse5c","netbeans","hello","ankur","mwmf","ajava","cse5c","netbeans"};
        // create JList component and pass data as parameter to constructor of JList
        JList mylist = new JList(listData);
        
        // add a JScrollPane to hold the JList to have scrolling feature for list elements
        JScrollPane myscrollpane = new JScrollPane(mylist);
        //add the JList object as component to frame container
        frame.add(myscrollpane);
        
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
