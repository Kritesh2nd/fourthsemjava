package myframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class myframe extends Canvas{
    static myframe main = new myframe();
    static JFrame f = new JFrame("MyFrame");
    static JLabel header,footer;
    static JPanel middle;
    static JButton bold,plain,italic;
    public static void jframMain(){
        f.setSize(400,160);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void jframeText(){
        header = new JLabel("Asia e University",SwingConstants.CENTER);
        header.setBounds(0,0,400,30);
        footer = new JLabel("Object Oriented Programming-May 2019",SwingConstants.CENTER);
        footer.setBounds(0,64,400,30);
        f.add(header);
        f.add(footer);
    }
    public static void jframeButtonX(){
        bold = new JButton();
        plain = new JButton();
        italic = new JButton();
        bold.setBounds(70, 40, 80, 24);
        plain.setBounds(160, 40, 80, 24);
        italic.setBounds(250, 40, 80, 24);
        bold.setText("BOLD");
        plain.setText("PLAIN");
        italic.setText("ITALIC");
        bold.addActionListener((ActionEvent e) -> {
            footer.setFont(footer.getFont().deriveFont(Font.BOLD));
        });
        plain.addActionListener((ActionEvent e) -> {
            footer.setFont(footer.getFont().deriveFont(Font.PLAIN));
        });
        italic.addActionListener((ActionEvent e) -> {
            footer.setFont(footer.getFont().deriveFont(Font.ITALIC));
        });
        f.add(plain);
        f.add(bold);
        f.add(italic);
    }
    public static void main(String[] args) {
        jframMain();
        jframeText();
        jframeButtonX();
    }
}
