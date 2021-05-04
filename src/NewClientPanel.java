import MIFID_III.Language;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class NewClientPanel {
    public JTabbedPane tabbedPane1;
    public JPanel panel1;
    public JComboBox client_type;
    public JComboBox Language_cb;
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JTextField textField5;
    public JTextField textField9;
    public JComboBox PP_box;
    public JComboBox Q2Box;
    public JComboBox Q3Box;
    public JComboBox Q1Box;
    public JComboBox EdBox;
    public JComboBox Jobbox;
    public JTextField textField4;
    public JTextField textField6;
    public JTextField textField7;
    public JComboBox Q4Box;
    public JComboBox FI1_1B;
    public JLabel CN;
    public JLabel RN;
    public JLabel RC;
    public JLabel NS;
    public JLabel PC;
    public JLabel PP;
    public JLabel Q1;
    public JLabel Q2;
    public JLabel Q3;
    public JLabel Ed;
    public JLabel Prev_Prof;
    public JTextField textField8;
    public JLabel Prof_false;
    public JLabel Prev_workplace;
    public JLabel Work_cn;
    public JLabel Years;
    public JLabel Q4;
    public JEditorPane FI_thb =  new JEditorPane();
    public JEditorPane kn_FI =  new JEditorPane();
    public JEditorPane Rsk_thmb =  new JEditorPane();
    public JEditorPane exp_thmb =  new JEditorPane();
    public JEditorPane FI_quant =  new JEditorPane();
    public JEditorPane volume_thmb =  new JEditorPane();
    public JEditorPane FI_TA_thmb =  new JEditorPane();
    public JEditorPane FI1_1 =  new JEditorPane();
    public JEditorPane FI1_2 =  new JEditorPane();
    public JEditorPane FI1_3 =  new JEditorPane();
    public JEditorPane FI1_4 =  new JEditorPane();
    public JEditorPane FI1_5 =  new JEditorPane();
    public JEditorPane FI1_Q1 =  new JEditorPane();
    public JEditorPane FI1_Q2 =  new JEditorPane();
    public JEditorPane FI1_Q3 =  new JEditorPane();
    public JComboBox FI1_2B;
    public JComboBox FI1_3B;
    public JComboBox FI1_4B;
    public JComboBox FI1_5B;
    public JComboBox FI1_A1;
    public JComboBox FI1_A2;
    public JComboBox FI1_A3;
    public JEditorPane FI2_1;
    public JEditorPane FI2_2;
    public JEditorPane FI2_3;
    public JEditorPane FI2_4;
    public JEditorPane FI2_5;
    public JEditorPane FI2_Q1;
    public JEditorPane FI2_Q2;
    public JEditorPane FI2_Q3;
    public JComboBox FI2_1B;
    public JComboBox FI2_2B;
    public JComboBox FI2_3B;
    public JComboBox FI2_4B;
    public JComboBox FI2_5B;
    public JComboBox FI2_A1;
    public JComboBox FI2_A2;
    public JComboBox FI2_A3;
    public JEditorPane FI3_1;
    public JEditorPane FI3_2;
    public JEditorPane FI3_3;
    public JEditorPane FI3_4;
    public JEditorPane FI3_5;
    public JEditorPane FI3_Q1;
    public JEditorPane FI3_Q2;
    public JEditorPane FI3_Q3;
    public JComboBox FI3_1B;
    public JComboBox FI3_2B;
    public JComboBox FI3_3B;
    public JComboBox FI3_4B;
    public JComboBox FI3_5B;
    public JComboBox FI3_A1;
    public JComboBox FI3_A2;
    public JComboBox FI3_A3;
    public JEditorPane FI4_1;
    public JEditorPane FI4_2;
    public JEditorPane FI4_3;
    public JEditorPane FI4_4;
    public JEditorPane FI4_5;
    public JEditorPane FI4_Q1;
    public JEditorPane FI4_Q2;
    public JEditorPane FI4_Q3;
    public JComboBox FI4_1B;
    public JComboBox FI4_2B;
    public JComboBox FI4_3B;
    public JComboBox FI4_4B;
    public JComboBox FI4_5B;
    public JComboBox FI4_A1;
    public JComboBox FI4_A2;
    public JComboBox FI4_A3;
    public JComboBox FI5_1B;
    public JComboBox FI5_2B;
    public JComboBox FI5_3B;
    public JComboBox FI5_4B;
    public JComboBox FI5_5B;
    public JEditorPane FI5_1;
    public JEditorPane FI5_2;
    public JEditorPane FI5_3;
    public JEditorPane FI5_4;
    public JEditorPane FI5_5;
    public JEditorPane FI5_Q1;
    public JEditorPane FI5_Q2;
    public JEditorPane FI5_Q3;
    public JComboBox FI5_A1;
    public JComboBox FI5_A2;
    public JComboBox FI5_A3;
    public JEditorPane FI6_1;
    public JEditorPane FI6_2;
    public JEditorPane FI6_3;
    public JEditorPane FI6_4;
    public JEditorPane FI6_5;
    public JEditorPane FI6_Q1;
    public JEditorPane FI6_Q2;
    public JEditorPane FI6_Q3;
    public JComboBox FI6_1B;
    public JComboBox FI6_2B;
    public JComboBox FI6_3B;
    public JComboBox FI6_4B;
    public JComboBox FI6_5B;
    public JComboBox FI6_A1;
    public JComboBox FI6_A2;
    public JComboBox FI6_A3;
    public JEditorPane FI7_1;
    public JEditorPane FI7_2;
    public JEditorPane FI7_3;
    public JEditorPane FI7_4;
    public JEditorPane FI7_5;
    public JEditorPane FI7_Q1;
    public JEditorPane FI7_Q2;
    public JEditorPane FI7_Q3;
    public JComboBox FI7_1B;
    public JComboBox FI7_2B;
    public JComboBox FI7_3B;
    public JComboBox FI7_4B;
    public JComboBox FI7_5B;
    public JComboBox FI7_A1;
    public JComboBox FI7_A2;
    public JComboBox FI7_A3;
    public JEditorPane FI8_1;
    public JEditorPane FI8_2;
    public JEditorPane FI8_3;
    public JEditorPane FI8_4;
    public JEditorPane FI8_5;
    public JEditorPane FI8_Q1;
    public JEditorPane FI8_Q2;
    public JEditorPane FI8_Q3;
    public JComboBox FI8_1B;
    public JComboBox FI8_2B;
    public JComboBox FI8_3B;
    public JComboBox FI8_4B;
    public JComboBox FI8_5B;
    public JComboBox FI8_A1;
    public JComboBox FI8_A2;
    public JComboBox FI8_A3;
    public JEditorPane FI9_1;
    public JEditorPane FI9_2;
    public JEditorPane FI9_3;
    public JEditorPane FI9_4;
    public JEditorPane FI9_5;
    public JEditorPane FI9_Q1;
    public JEditorPane FI9_Q2;
    public JEditorPane FI9_Q3;
    public JComboBox FI9_1B;
    public JComboBox FI9_2B;
    public JComboBox FI9_3B;
    public JComboBox FI9_4B;
    public JComboBox FI9_5B;
    public JComboBox FI9_A1;
    public JComboBox FI9_A2;
    public JComboBox FI9_A3;
    public JEditorPane FI10_1;
    public JEditorPane FI10_2;
    public JEditorPane FI10_3;
    public JEditorPane FI10_4;
    public JEditorPane FI10_5;
    public JEditorPane FI10_Q1;
    public JEditorPane FI10_Q2;
    public JEditorPane FI10_Q3;
    public JComboBox FI10_1B;
    public JComboBox FI10_2B;
    public JComboBox FI10_3B;
    public JComboBox FI10_4B;
    public JComboBox FI10_5B;
    public JComboBox FI10_A1;
    public JComboBox FI10_A2;
    public JComboBox FI10_A3;
    public  JPanel TestPanel = new JPanel();
    private JPanel Test;
    private JScrollPane Scrollable;
    private JPanel Testfield;
    private JEditorPane FI1;
    private JEditorPane FI2;
    private JEditorPane FI3;
    private JEditorPane FI4;
    private JEditorPane FI5;
    private JEditorPane FI6;
    private JEditorPane FI7;
    private JEditorPane FI8;
    private JEditorPane FI9;
    private JEditorPane FI10;
    private JLabel FI_thumb;
    private JButton submit;



    public NewClientPanel()
    {


        Language_cb.setEditable(true);
        Language_cb.addItem("LV");
        Language_cb.addItem("RU");
        Language_cb.addItem("EN");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try {
            Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\aserg\\eclipse-workspace\\MIFID-III\\src\\Language_struct.json"));
            MIFID_III.Language language = gson.fromJson(reader,MIFID_III.Language.class);

        Language_cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Object selected = Language_cb.getSelectedItem();
                if (selected.toString().equals("RU")){

                }
                if (selected.toString().equals("EN")){

                }
                if (selected.toString().equals("LV")){
                    LLV(language);
                }

            }

        });
        } catch (JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }


         submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Evaluate eval = new Evaluate();
                String[][] anw = eval.getAnwsers();
                int[] points = new int[10];
                String[][] client = new String[10][8];
                client[0][0] = String.valueOf(FI1_1B.getSelectedIndex());
                client[0][1] = String.valueOf(FI1_2B.getSelectedIndex());
                client[0][2] = String.valueOf(FI1_3B.getSelectedIndex());
                client[0][3] = String.valueOf(FI1_4B.getSelectedIndex());
                client[0][4] = String.valueOf(FI1_5B.getSelectedIndex());
                client[0][5] = String.valueOf(FI1_A1.getSelectedIndex());
                client[0][6] = String.valueOf(FI1_A2.getSelectedIndex());
                client[0][7] = String.valueOf(FI1_A1.getSelectedIndex());

                client[1][0] = String.valueOf(FI2_1B.getSelectedIndex());
                client[1][1] = String.valueOf(FI2_2B.getSelectedIndex());
                client[1][2] = String.valueOf(FI2_3B.getSelectedIndex());
                client[1][3] = String.valueOf(FI2_4B.getSelectedIndex());
                client[1][4] = String.valueOf(FI2_5B.getSelectedIndex());
                client[1][5] = String.valueOf(FI2_A1.getSelectedIndex());
                client[1][6] = String.valueOf(FI2_A2.getSelectedIndex());
                client[1][7] = String.valueOf(FI2_A1.getSelectedIndex());

                client[2][0] = String.valueOf(FI3_1B.getSelectedIndex());
                client[2][1] = String.valueOf(FI3_2B.getSelectedIndex());
                client[2][2] = String.valueOf(FI3_3B.getSelectedIndex());
                client[2][3] = String.valueOf(FI3_4B.getSelectedIndex());
                client[2][4] = String.valueOf(FI3_5B.getSelectedIndex());
                client[2][5] = String.valueOf(FI3_A1.getSelectedIndex());
                client[2][6] = String.valueOf(FI3_A2.getSelectedIndex());
                client[2][7] = String.valueOf(FI3_A1.getSelectedIndex());

                client[3][0] = String.valueOf(FI4_1B.getSelectedIndex());
                client[3][1] = String.valueOf(FI4_2B.getSelectedIndex());
                client[3][2] = String.valueOf(FI4_3B.getSelectedIndex());
                client[3][3] = String.valueOf(FI4_4B.getSelectedIndex());
                client[3][4] = String.valueOf(FI4_5B.getSelectedIndex());
                client[3][5] = String.valueOf(FI4_A1.getSelectedIndex());
                client[3][6] = String.valueOf(FI4_A2.getSelectedIndex());
                client[3][7] = String.valueOf(FI4_A1.getSelectedIndex());

                client[4][0] = String.valueOf(FI5_1B.getSelectedIndex());
                client[4][1] = String.valueOf(FI5_2B.getSelectedIndex());
                client[4][2] = String.valueOf(FI5_3B.getSelectedIndex());
                client[4][3] = String.valueOf(FI5_4B.getSelectedIndex());
                client[4][4] = String.valueOf(FI5_5B.getSelectedIndex());
                client[4][5] = String.valueOf(FI5_A1.getSelectedIndex());
                client[4][6] = String.valueOf(FI5_A2.getSelectedIndex());
                client[4][7] = String.valueOf(FI5_A1.getSelectedIndex());

                client[5][0] = String.valueOf(FI6_1B.getSelectedIndex());
                client[5][1] = String.valueOf(FI6_2B.getSelectedIndex());
                client[5][2] = String.valueOf(FI6_3B.getSelectedIndex());
                client[5][3] = String.valueOf(FI6_4B.getSelectedIndex());
                client[5][4] = String.valueOf(FI6_5B.getSelectedIndex());
                client[5][5] = String.valueOf(FI6_A1.getSelectedIndex());
                client[5][6] = String.valueOf(FI6_A2.getSelectedIndex());
                client[5][7] = String.valueOf(FI6_A1.getSelectedIndex());

                client[6][0] = String.valueOf(FI7_1B.getSelectedIndex());
                client[6][1] = String.valueOf(FI7_2B.getSelectedIndex());
                client[6][2] = String.valueOf(FI7_3B.getSelectedIndex());
                client[6][3] = String.valueOf(FI7_4B.getSelectedIndex());
                client[6][4] = String.valueOf(FI7_5B.getSelectedIndex());
                client[6][5] = String.valueOf(FI7_A1.getSelectedIndex());
                client[6][6] = String.valueOf(FI7_A2.getSelectedIndex());
                client[6][7] = String.valueOf(FI7_A1.getSelectedIndex());

                client[7][0] = String.valueOf(FI8_1B.getSelectedIndex());
                client[7][1] = String.valueOf(FI8_2B.getSelectedIndex());
                client[7][2] = String.valueOf(FI8_3B.getSelectedIndex());
                client[7][3] = String.valueOf(FI8_4B.getSelectedIndex());
                client[7][4] = String.valueOf(FI8_5B.getSelectedIndex());
                client[7][5] = String.valueOf(FI8_A1.getSelectedIndex());
                client[7][6] = String.valueOf(FI8_A2.getSelectedIndex());
                client[7][7] = String.valueOf(FI8_A1.getSelectedIndex());

                client[8][0] = String.valueOf(FI9_1B.getSelectedIndex());
                client[8][1] = String.valueOf(FI9_2B.getSelectedIndex());
                client[8][2] = String.valueOf(FI9_3B.getSelectedIndex());
                client[8][3] = String.valueOf(FI9_4B.getSelectedIndex());
                client[8][4] = String.valueOf(FI9_5B.getSelectedIndex());
                client[8][5] = String.valueOf(FI9_A1.getSelectedIndex());
                client[8][6] = String.valueOf(FI9_A2.getSelectedIndex());
                client[8][7] = String.valueOf(FI9_A1.getSelectedIndex());

                client[9][0] = String.valueOf(FI10_1B.getSelectedIndex());
                client[9][1] = String.valueOf(FI10_2B.getSelectedIndex());
                client[9][2] = String.valueOf(FI10_3B.getSelectedIndex());
                client[9][3] = String.valueOf(FI10_4B.getSelectedIndex());
                client[9][4] = String.valueOf(FI10_5B.getSelectedIndex());
                client[9][5] = String.valueOf(FI10_A1.getSelectedIndex());
                client[9][6] = String.valueOf(FI10_A2.getSelectedIndex());
                client[9][7] = String.valueOf(FI10_A1.getSelectedIndex());
                try {
                    /*for(int i=0;i<10;i++){
                        for(int ii=0;ii<8;ii++){
                        System.out.print(client[i][ii]+ " ");
                    }
                        System.out.println(" ");
                    } */
                   // System.out.println("_____________________");
                    eval.handle(client);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }


    public void LLV (Language language){


            CN.setText(language.getLanguage().getLv().getCompanyName());
            RN.setText(language.getLanguage().getLv().getRegNum());
            RC.setText(language.getLanguage().getLv().getRegCountry());
            NS.setText(language.getLanguage().getLv().getNameSurname());
            PC.setText(language.getLanguage().getLv().getPersCode());
            PP.setText(language.getLanguage().getLv().getParsPam());
            Q1.setText(language.getLanguage().getLv().getClientPortQ1());
            Q2.setText(language.getLanguage().getLv().getClientPortQ2());
            Q3.setText(language.getLanguage().getLv().getClientPortQ3());
            Ed.setText(language.getLanguage().getLv().getEducation());
            Prev_Prof.setText(language.getLanguage().getLv().getPrevWorkplace());
            Prof_false.setText("Ja cita profesija, ievadiet to:");
            Prev_workplace.setText(language.getLanguage().getLv().getPrevWorkplaceName());
            Work_cn.setText(language.getLanguage().getLv().getPrevWorlpaceCountry());
            Years.setText(language.getLanguage().getLv().getWorkexp());
            Q4.setText(language.getLanguage().getLv().getClientQ4());
            PP_box.setEditable(true);



            try {
                for (int i = 0; i <= (language.getLanguage().getLv().getParsPamVar().size()-1); i++) {
                    PP_box.addItem(language.getLanguage().getLv().getParsPamVar().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                Q1Box.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    Q1Box.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {

                Q2Box.setEditable(true);

                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    Q2Box.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                } } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                Q3Box.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    Q3Box.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }} catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                Q4Box.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    Q4Box.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }} catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                EdBox.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getEducations().size()-1; i++) {
                    EdBox.addItem(language.getLanguage().getLv().getEducations().get(i));
                }} catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                EdBox.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getEducations().size()-1; i++) {
                    EdBox.addItem(language.getLanguage().getLv().getEducations().get(i));
                }} catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                Jobbox.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getPrevWorkplaces().size()-1; i++) {
                    Jobbox.addItem(language.getLanguage().getLv().getPrevWorkplaces().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }

            //TESTS PAGE ANNOTATIONS

            FI_thb.setText(language.getLanguage().getLv().getFIThumbnail());
            kn_FI.setText(language.getLanguage().getLv().getKnExpThumbnail());
            Rsk_thmb.setText(language.getLanguage().getLv().getFIUnderstandingThumbnail());
            exp_thmb.setText(language.getLanguage().getLv().getExpThumbnail());
            FI_quant.setText(language.getLanguage().getLv().getFIQuantityThumbnail());
            volume_thmb.setText(language.getLanguage().getLv().getFIVolumeThumbnail());
            FI_TA_thmb.setText(language.getLanguage().getLv().getFITAThumbnail());

            FI1_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI1_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI1_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI1_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI1_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI1_Q1.setText(language.getLanguage().getLv().getFi1().getFi1Q1());
            FI1_Q2.setText(language.getLanguage().getLv().getFi1().getFi1Q2());
            FI1_Q3.setText(language.getLanguage().getLv().getFi1().getFi1Q3());
            try {
                FI1_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI1_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI1_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI1_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI1_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi1().getVolume().size()-1; i++) {
                    FI1_5B.addItem(language.getLanguage().getLv().getFi1().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi1().getFiQ1A().size()-1; i++) {
                    FI1_A1.addItem(language.getLanguage().getLv().getFi1().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi1().getFiQ2A().size()-1; i++) {
                    FI1_A2.addItem(language.getLanguage().getLv().getFi1().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI1_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi1().getFiQ3A().size()-1; i++) {
                    FI1_A3.addItem(language.getLanguage().getLv().getFi1().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }



            FI2_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI2_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI2_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI2_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI2_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI2_Q1.setText(language.getLanguage().getLv().getFi2().getFi2Q1());
            FI2_Q2.setText(language.getLanguage().getLv().getFi2().getFi2Q2());
            FI2_Q3.setText(language.getLanguage().getLv().getFi2().getFi2Q3());
            try {
                FI2_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI2_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI2_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI2_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI2_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi2().getVolume().size()-1; i++) {
                    FI2_5B.addItem(language.getLanguage().getLv().getFi2().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi2().getFiQ1A().size()-1; i++) {
                    FI2_A1.addItem(language.getLanguage().getLv().getFi2().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi2().getFiQ2A().size()-1; i++) {
                    FI2_A2.addItem(language.getLanguage().getLv().getFi2().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI2_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi2().getFiQ3A().size()-1; i++) {
                    FI2_A3.addItem(language.getLanguage().getLv().getFi2().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI3_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI3_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI3_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI3_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI3_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI3_Q1.setText(language.getLanguage().getLv().getFi3().getFi3Q1());
            FI3_Q2.setText(language.getLanguage().getLv().getFi3().getFi3Q2());
            FI3_Q3.setText(language.getLanguage().getLv().getFi3().getFi3Q3());
            try {
                FI3_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI3_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI3_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI3_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI3_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi3().getVolume().size()-1; i++) {
                    FI3_5B.addItem(language.getLanguage().getLv().getFi3().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi3().getFiQ1A().size()-1; i++) {
                    FI3_A1.addItem(language.getLanguage().getLv().getFi3().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi3().getFiQ2A().size()-1; i++) {
                    FI3_A2.addItem(language.getLanguage().getLv().getFi3().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI3_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi3().getFiQ3A().size()-1; i++) {
                    FI3_A3.addItem(language.getLanguage().getLv().getFi3().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI4_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI4_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI4_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI4_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI4_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI4_Q1.setText(language.getLanguage().getLv().getFi4().getFi4Q1());
            FI4_Q2.setText(language.getLanguage().getLv().getFi4().getFi4Q2());
            FI4_Q3.setText(language.getLanguage().getLv().getFi4().getFi4Q3());
            try {
                FI4_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI4_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI4_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI4_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI4_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi4().getVolume().size()-1; i++) {
                    FI4_5B.addItem(language.getLanguage().getLv().getFi4().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi4().getFiQ1A().size()-1; i++) {
                    FI4_A1.addItem(language.getLanguage().getLv().getFi4().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi4().getFiQ2A().size()-1; i++) {
                    FI4_A2.addItem(language.getLanguage().getLv().getFi4().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI4_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi4().getFiQ3A().size()-1; i++) {
                    FI4_A3.addItem(language.getLanguage().getLv().getFi4().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI5_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI5_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI5_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI5_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI5_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI5_Q1.setText(language.getLanguage().getLv().getFi5().getFi5Q1());
            FI5_Q2.setText(language.getLanguage().getLv().getFi5().getFi5Q2());
            FI5_Q3.setText(language.getLanguage().getLv().getFi5().getFi5Q3());
            try {
                FI5_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI5_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI5_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI5_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI5_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi5().getVolume().size()-1; i++) {
                    FI5_5B.addItem(language.getLanguage().getLv().getFi5().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi5().getFiQ1A().size()-1; i++) {
                    FI5_A1.addItem(language.getLanguage().getLv().getFi5().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi5().getFiQ2A().size()-1; i++) {
                    FI5_A2.addItem(language.getLanguage().getLv().getFi5().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI5_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi5().getFiQ3A().size()-1; i++) {
                    FI5_A3.addItem(language.getLanguage().getLv().getFi5().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }



            FI6_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI6_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI6_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI6_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI6_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI6_Q1.setText(language.getLanguage().getLv().getFi6().getFi6Q1());
            FI6_Q2.setText(language.getLanguage().getLv().getFi6().getFi6Q2());
            FI6_Q3.setText(language.getLanguage().getLv().getFi6().getFi6Q3());
            try {
                FI6_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI6_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI6_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI6_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI6_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi6().getVolume().size()-1; i++) {
                    FI6_5B.addItem(language.getLanguage().getLv().getFi6().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi6().getFiQ1A().size()-1; i++) {
                    FI6_A1.addItem(language.getLanguage().getLv().getFi6().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi6().getFiQ2A().size()-1; i++) {
                    FI6_A2.addItem(language.getLanguage().getLv().getFi6().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI6_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi6().getFiQ3A().size()-1; i++) {
                    FI6_A3.addItem(language.getLanguage().getLv().getFi6().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI7_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI7_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI7_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI7_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI7_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI7_Q1.setText(language.getLanguage().getLv().getFi7().getFi7Q1());
            FI7_Q2.setText(language.getLanguage().getLv().getFi7().getFi7Q2());
            FI7_Q3.setText(language.getLanguage().getLv().getFi7().getFi7Q3());
            try {
                FI7_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI7_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI7_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI7_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI7_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi7().getVolume().size()-1; i++) {
                    FI7_5B.addItem(language.getLanguage().getLv().getFi7().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi7().getFiQ1A().size()-1; i++) {
                    FI7_A1.addItem(language.getLanguage().getLv().getFi7().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi7().getFiQ2A().size()-1; i++) {
                    FI7_A2.addItem(language.getLanguage().getLv().getFi7().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI7_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi7().getFiQ3A().size()-1; i++) {
                    FI7_A3.addItem(language.getLanguage().getLv().getFi7().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI8_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI8_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI8_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI8_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI8_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI8_Q1.setText(language.getLanguage().getLv().getFi8().getFi8Q1());
            FI8_Q2.setText(language.getLanguage().getLv().getFi8().getFi8Q2());
            FI8_Q3.setText(language.getLanguage().getLv().getFi8().getFi8Q3());
            try {
                FI8_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI8_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI8_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI8_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI8_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi8().getVolume().size()-1; i++) {
                    FI8_5B.addItem(language.getLanguage().getLv().getFi8().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi8().getFiQ1A().size()-1; i++) {
                    FI8_A1.addItem(language.getLanguage().getLv().getFi8().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi8().getFiQ2A().size()-1; i++) {
                    FI8_A2.addItem(language.getLanguage().getLv().getFi8().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI8_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi8().getFiQ3A().size()-1; i++) {
                    FI8_A3.addItem(language.getLanguage().getLv().getFi8().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI9_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI9_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI9_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI9_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI9_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI9_Q1.setText(language.getLanguage().getLv().getFi9().getFi9Q1());
            FI9_Q2.setText(language.getLanguage().getLv().getFi9().getFi9Q2());
            FI9_Q3.setText(language.getLanguage().getLv().getFi9().getFi9Q3());
            try {
                FI9_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI9_A3.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI9_A2.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI9_A1.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI9_5B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi9().getVolume().size()-1; i++) {
                    FI9_4B.addItem(language.getLanguage().getLv().getFi9().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi9().getFiQ1A().size()-1; i++) {
                    FI9_3B.addItem(language.getLanguage().getLv().getFi9().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi9().getFiQ2A().size()-1; i++) {
                    FI9_2B.addItem(language.getLanguage().getLv().getFi9().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI9_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi9().getFiQ3A().size()-1; i++) {
                    FI9_1B.addItem(language.getLanguage().getLv().getFi9().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }


            FI10_1.setText(language.getLanguage().getLv().getKnExpThumbnailSec());
            FI10_2.setText(language.getLanguage().getLv().getFIUnderstThumbSec());
            FI10_3.setText(language.getLanguage().getLv().getFIExpThumbSec());
            FI10_4.setText(language.getLanguage().getLv().getFIQuantityThumbnailSec());
            FI10_5.setText(language.getLanguage().getLv().getFIVolumeThumbnailSec());
            FI10_Q1.setText(language.getLanguage().getLv().getFi10().getFi10Q1());
            FI10_Q2.setText(language.getLanguage().getLv().getFi10().getFi10Q2());
            FI10_Q3.setText(language.getLanguage().getLv().getFi10().getFi10Q3());
            try {
                FI10_1B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getKnExpThumbnailAtb().size()-1; i++) {
                    FI10_1B.addItem(language.getLanguage().getLv().getKnExpThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_2B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIUnderstThumbAtb().size()-1; i++) {
                    FI10_2B.addItem(language.getLanguage().getLv().getFIUnderstThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_3B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIExpThumbAtb().size()-1; i++) {
                    FI10_3B.addItem(language.getLanguage().getLv().getFIExpThumbAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_4B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFIQuantityThumbnailAtb().size()-1; i++) {
                    FI10_4B.addItem(language.getLanguage().getLv().getFIQuantityThumbnailAtb().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_5B.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi10().getVolume().size()-1; i++) {
                    FI10_5B.addItem(language.getLanguage().getLv().getFi10().getVolume().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_A1.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi10().getFiQ1A().size()-1; i++) {
                    FI10_A1.addItem(language.getLanguage().getLv().getFi10().getFiQ1A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_A2.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi10().getFiQ2A().size()-1; i++) {
                    FI10_A2.addItem(language.getLanguage().getLv().getFi10().getFiQ2A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                FI10_A3.setEditable(true);
                for (int i = 0; i <= language.getLanguage().getLv().getFi10().getFiQ3A().size()-1; i++) {
                    FI10_A3.addItem(language.getLanguage().getLv().getFi10().getFiQ3A().get(i));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }







    }


    public void actionPerformed(ActionEvent e) {

    }

    public void StartNCP(){
        JFrame ncp = new JFrame("NCP");
        ncp.setContentPane(new NewClientPanel().panel1);
        //JScrollPane vert = new JScrollPane(TestPanel1);

        //TestPanel1.setVisible(false);
        //TestPanel.add(vert);
        //ncp.add(vert);

        Language_cb.setEditable(true);
        Language_cb.addItem("LV");
        Language_cb.addItem("RU");
        Language_cb.addItem("EN");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        ncp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ncp.setSize(1900,1000);
        ncp.setVisible(true);
    }

    public void createUIComponents() {
        // TODO: place custom component creation code here
    
    }
}


