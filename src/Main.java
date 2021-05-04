import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    private JTextField MIFIDClientSystemTextField;
    private JButton ModAnw;
    private JButton NewClient;
    private JButton ModQuest;
    private JButton LoadClient;
    private JPanel mpanel;

    public Main() {
        NewClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewClientPanel ncp = new NewClientPanel();
                ncp.StartNCP();
            }
        });

        ModAnw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Anwsers nap = new Anwsers();
                nap.NewAnwsersPanel();
            }
        });
    }
      public static void main(String[] args) {
        JFrame frame = new JFrame("MIFID");
        frame.setContentPane(new Main().mpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

   System.out.println("Test");
        }
        }