import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.*;
public class GameFrame
{
    public GameFrame(int x, int y)
    {
        JFrame gamemap = new JFrame();
        gamemap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Question newQ = new Question();
        Question newQ2 = new Question();

        JLabel titleLabel = new JLabel("Is "+ newQ.getQuestion()+ " greater than, less than or equal to " + newQ2.getQuestion());
        gamemap.getContentPane().add(titleLabel);
        titleLabel.setVisible(true);
        

        JButton greaterThan = new JButton("<");
        JButton lessThan = new JButton(">");
        JButton equals = new JButton("=");
        JButton nextQ = new JButton("Next Question");
        nextQ.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
           System.out.println("nice");

        }
        });
        JPanel buttonContainer = new JPanel();
        GridLayout newLayout = new GridLayout(1,3);
        buttonContainer.setLayout(newLayout);
        buttonContainer.add(lessThan);
        buttonContainer.add(greaterThan);
        buttonContainer.add(equals);

        gamemap.add(buttonContainer, BorderLayout.CENTER);
        gamemap.add(nextQ, BorderLayout.SOUTH);
        gamemap.add(titleLabel, BorderLayout.NORTH);

        gamemap.setVisible(true);
        gamemap.setTitle("Hello world!");
        gamemap.setSize(x,y);

        }
        








}