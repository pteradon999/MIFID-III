import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Anwsers {
    private JComboBox FI1Q1;
    private JLabel Q1;
    private JLabel Q2;
    private JLabel Q3;
    private JLabel FI1;
    private JLabel FI2;
    private JLabel FI3;
    private JLabel FI4;
    private JLabel FI5;
    private JLabel FI6;
    private JLabel FI7;
    private JLabel FI8;
    private JLabel FI9;
    private JLabel FI10;
    private JComboBox FI1Q2;
    private JComboBox FI1Q3;
    private JComboBox FI2Q1;
    private JComboBox FI2Q2;
    private JComboBox FI2Q3;
    private JComboBox FI3Q1;
    private JComboBox FI3Q2;
    private JComboBox FI3Q3;
    private JComboBox FI4Q1;
    private JComboBox FI4Q2;
    private JComboBox FI4Q3;
    private JComboBox FI5Q1;
    private JComboBox FI5Q2;
    private JComboBox FI5Q3;
    private JComboBox FI6Q1;
    private JComboBox FI6Q2;
    private JComboBox FI6Q3;
    private JComboBox FI7Q1;
    private JComboBox FI7Q2;
    private JComboBox FI7Q3;
    private JComboBox FI8Q1;
    private JComboBox FI8Q2;
    private JComboBox FI8Q3;
    private JComboBox FI9Q1;
    private JComboBox FI9Q2;
    private JComboBox FI9Q3;
    private JComboBox FI10Q1;
    private JComboBox FI10Q2;
    private JComboBox FI10Q3;
    private JButton Submit;
    private JPanel Anwpanel;

    public Anwsers(){
        FI1Q1.addItem(1);
        FI1Q1.addItem(2);
        FI1Q1.addItem(3);
        FI1Q1.addItem(4);

        FI1Q2.addItem(1);
        FI1Q2.addItem(2);
        FI1Q2.addItem(3);
        FI1Q2.addItem(4);

        FI1Q3.addItem(1);
        FI1Q3.addItem(2);
        FI1Q3.addItem(3);
        FI1Q3.addItem(4);

        FI2Q1.addItem(1);
        FI2Q1.addItem(2);
        FI2Q1.addItem(3);
        FI2Q1.addItem(4);

        FI2Q2.addItem(1);
        FI2Q2.addItem(2);
        FI2Q2.addItem(3);
        FI2Q2.addItem(4);

        FI2Q3.addItem(1);
        FI2Q3.addItem(2);
        FI2Q3.addItem(3);
        FI2Q3.addItem(4);

        FI3Q1.addItem(1);
        FI3Q1.addItem(2);
        FI3Q1.addItem(3);
        FI3Q1.addItem(4);

        FI3Q2.addItem(1);
        FI3Q2.addItem(2);
        FI3Q2.addItem(3);
        FI3Q2.addItem(4);

        FI3Q3.addItem(1);
        FI3Q3.addItem(2);
        FI3Q3.addItem(3);
        FI3Q3.addItem(4);

        FI4Q1.addItem(1);
        FI4Q1.addItem(2);
        FI4Q1.addItem(3);
        FI4Q1.addItem(4);

        FI4Q2.addItem(1);
        FI4Q2.addItem(2);
        FI4Q2.addItem(3);
        FI4Q2.addItem(4);

        FI4Q3.addItem(1);
        FI4Q3.addItem(2);
        FI4Q3.addItem(3);
        FI4Q3.addItem(4);

        FI5Q1.addItem(1);
        FI5Q1.addItem(2);
        FI5Q1.addItem(3);
        FI5Q1.addItem(4);

        FI5Q2.addItem(1);
        FI5Q2.addItem(2);
        FI5Q2.addItem(3);
        FI5Q2.addItem(4);

        FI5Q3.addItem(1);
        FI5Q3.addItem(2);
        FI5Q3.addItem(3);
        FI5Q3.addItem(4);

        FI6Q1.addItem(1);
        FI6Q1.addItem(2);
        FI6Q1.addItem(3);
        FI6Q1.addItem(4);

        FI6Q2.addItem(1);
        FI6Q2.addItem(2);
        FI6Q2.addItem(3);
        FI6Q2.addItem(4);

        FI6Q3.addItem(1);
        FI6Q3.addItem(2);
        FI6Q3.addItem(3);
        FI6Q3.addItem(4);

        FI7Q1.addItem(1);
        FI7Q1.addItem(2);
        FI7Q1.addItem(3);
        FI7Q1.addItem(4);

        FI7Q2.addItem(1);
        FI7Q2.addItem(2);
        FI7Q2.addItem(3);
        FI7Q2.addItem(4);

        FI7Q3.addItem(1);
        FI7Q3.addItem(2);
        FI7Q3.addItem(3);
        FI7Q3.addItem(4);

        FI8Q1.addItem(1);
        FI8Q1.addItem(2);
        FI8Q1.addItem(3);
        FI8Q1.addItem(4);

        FI8Q2.addItem(1);
        FI8Q2.addItem(2);
        FI8Q2.addItem(3);
        FI8Q2.addItem(4);

        FI8Q3.addItem(1);
        FI8Q3.addItem(2);
        FI8Q3.addItem(3);
        FI8Q3.addItem(4);

        FI9Q1.addItem(1);
        FI9Q1.addItem(2);
        FI9Q1.addItem(3);
        FI9Q1.addItem(4);

        FI9Q2.addItem(1);
        FI9Q2.addItem(2);
        FI9Q2.addItem(3);
        FI9Q2.addItem(4);

        FI9Q3.addItem(1);
        FI9Q3.addItem(2);
        FI9Q3.addItem(3);
        FI9Q3.addItem(4);

        FI10Q1.addItem(1);
        FI10Q1.addItem(2);
        FI10Q1.addItem(3);
        FI10Q1.addItem(4);

        FI10Q2.addItem(1);
        FI10Q2.addItem(2);
        FI10Q2.addItem(3);
        FI10Q2.addItem(4);

        FI10Q3.addItem(1);
        FI10Q3.addItem(2);
        FI10Q3.addItem(3);
        FI10Q3.addItem(4);


        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String anwmatrix[][] = new String[10][3];

                  anwmatrix[0][0] = String.valueOf(FI1Q1.getSelectedIndex()+1);
                  anwmatrix[0][1] = String.valueOf(FI1Q2.getSelectedIndex()+1);
                  anwmatrix[0][2] = String.valueOf(FI1Q3.getSelectedIndex()+1);

                anwmatrix[1][0] = String.valueOf(FI2Q1.getSelectedIndex()+1);
                anwmatrix[1][1] = String.valueOf(FI2Q2.getSelectedIndex()+1);
                anwmatrix[1][2] = String.valueOf(FI2Q3.getSelectedIndex()+1);

                anwmatrix[2][0] = String.valueOf(FI3Q1.getSelectedIndex()+1);
                anwmatrix[2][1] = String.valueOf(FI3Q2.getSelectedIndex()+1);
                anwmatrix[2][2] = String.valueOf(FI3Q3.getSelectedIndex()+1);

                anwmatrix[3][0] = String.valueOf(FI4Q1.getSelectedIndex()+1);
                anwmatrix[3][1] = String.valueOf(FI4Q2.getSelectedIndex()+1);
                anwmatrix[3][2] = String.valueOf(FI4Q3.getSelectedIndex()+1);

                anwmatrix[4][0] = String.valueOf(FI5Q1.getSelectedIndex()+1);
                anwmatrix[4][1] = String.valueOf(FI5Q2.getSelectedIndex()+1);
                anwmatrix[4][2] = String.valueOf(FI5Q3.getSelectedIndex()+1);

                anwmatrix[5][0] = String.valueOf(FI6Q1.getSelectedIndex()+1);
                anwmatrix[5][1] = String.valueOf(FI6Q2.getSelectedIndex()+1);
                anwmatrix[5][2] = String.valueOf(FI6Q3.getSelectedIndex()+1);

                anwmatrix[6][0] = String.valueOf(FI7Q1.getSelectedIndex()+1);
                anwmatrix[6][1] = String.valueOf(FI7Q2.getSelectedIndex()+1);
                anwmatrix[6][2] = String.valueOf(FI7Q3.getSelectedIndex()+1);

                anwmatrix[7][0] = String.valueOf(FI8Q1.getSelectedIndex()+1);
                anwmatrix[7][1] = String.valueOf(FI8Q2.getSelectedIndex()+1);
                anwmatrix[7][2] = String.valueOf(FI8Q3.getSelectedIndex()+1);

                anwmatrix[8][0] = String.valueOf(FI9Q1.getSelectedIndex()+1);
                anwmatrix[8][1] = String.valueOf(FI9Q2.getSelectedIndex()+1);
                anwmatrix[8][2] = String.valueOf(FI9Q3.getSelectedIndex()+1);

                anwmatrix[9][0] = String.valueOf(FI10Q1.getSelectedIndex()+1);
                anwmatrix[9][1] = String.valueOf(FI10Q2.getSelectedIndex()+1);
                anwmatrix[9][2] = String.valueOf(FI10Q3.getSelectedIndex()+1);

                BufferedWriter writer;
                StringBuilder str = new StringBuilder();
                for (int i = 0;i<=9;i++){
                    for (int ii = 0;ii <=2;ii++){
                        if (ii !=2){
                            str.append(anwmatrix[i][ii]+",");
                        }else {
                            str.append(anwmatrix[i][ii]+"|");
                        }
                    }
                }

                String outstr = str.toString();
                //System.out.println(outstr);
                File anwsers = new File("anwsers.txt");
                try {
                    writer = new BufferedWriter(new FileWriter(anwsers));
                    writer.write(outstr);
                    writer.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


            }
        });
    }

    public void NewAnwsersPanel(){
        JFrame nap = new JFrame("NAP");
        nap.setContentPane(new Anwsers().Anwpanel);
        nap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nap.setVisible(true);

    }

}
