package UIexample;

import javax.swing.*;
import java.awt.*;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles.title;

public class UIexample {
    JFrame window = (JFrame) new Frame("Example App");

    JPanel myPanel = new JPanel();

    JTextField emailField = new JTextfield("Enter your email");

    void drawUI(){
        myPanel.add(emailField);
        Component myButton;
        myPanel.add(myButton);
        myPanel.setLayout(new GridLayout(2,1));
        window.add(myPanel);
        window.setLayout(new GridLayout(1, 2));

        window.setSize(300,500);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_);

    }


    public static void main(String[] args) {
        UIexample   UIexample = new UIexample();
    }
}
