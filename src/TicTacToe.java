import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TicTacToe implements ActionListener{

    Random random=new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1Turn;



    TicTacToe(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void firstTurn(){

    }
    public void check(){

    }
    public void xWins(int a, int b, int c){

    }
    public void oWins(int a, int b, int c){

    }

}
