package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us -MIT BCA final year Project");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            setBounds(100, 100, 700, 500);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/aa.jpeg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Courier new", Font.BOLD, 30));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Courier New", Font.BOLD, 30));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);


            JLabel l6 = new JLabel("Developed By :Utkarsh Sharma, Utkarsh Nehwal, Tushar, Shruti");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l9 = new JLabel("Course - BCA-C ");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);
                
                
            contentPane.setBackground(Color.white);
	}
        

}


