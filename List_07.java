//Q 6 a. Code By Rajat Jangid.

import java.awt.*;
import java.awt.event.*;

public class List_07 implements ActionListener{
    Choice C;
    Label L;
    Button B;
    List_07(){
        Frame F=new Frame();
        F.setSize(450,400);
        F.setLayout(new FlowLayout());
        F.setBackground(Color.GREEN);

        L=new Label("1");
        C=new Choice();
        B=new Button("Show");
        B.addActionListener(this);

        C.add("Red");
        C.add("Orange");
        C.add("Yellow");
        C.add("Green");
        C.add("Blue");
        C.add("indigo");
        C.add("Violet");

        //Adding to frame
        F.add(L);
        F.add(B);
        F.add(C);
        F.setVisible(true);

        F.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                F.dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        L.setText(String.valueOf(C.getSelectedIndex()+1));
    }
    public static void main(String[] args) {
        List_07 L=new List_07();
    }
}