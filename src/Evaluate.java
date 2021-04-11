import MIFID_III.Language;
import Scens.ScenScan;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jdi.IntegerValue;
import java.lang.reflect.Type;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Evaluate {
    private String anwsers[][] = {{"3","3","3"},{"3","1","2"},{"4","3","3"},{"3","1","2"},{"3","4","3"},{"3","3","2"},{"3","3","2"},{"1","2","2"},{"1","2","3"},{"3","2","3"}};

    public String[][] getAnwsers() {
        return anwsers;
    }

    public Evaluate(){


    }

    public void handle (String[][] client) throws IOException {
        System.out.println("FP");
        int rpoints = 0;
        int anwmatrix [][] = new int[10][6];
      for (int i=0;i<10;i++) {
          if (client[i][0].equals("0")){
            anwmatrix[i][0] = 2;
          }
          if (client[i][0].equals("1")){
              anwmatrix[i][0] = 1;
          }
          if (client[i][0].equals("2")){
              anwmatrix[i][0] = 0;
          }
          if (client[i][1].equals("0")){
              anwmatrix[i][1] = 1;
          }
          if (client[i][1].equals("1")){
              anwmatrix[i][1] = 0;
          }
          anwmatrix[i][2] = parseInt(client[i][2])+1;
          anwmatrix[i][3] = parseInt(client[i][3])+1;
          anwmatrix[i][4] = parseInt(client[i][4])+1;
          if ((parseInt(client[i][5]) + 1) == Integer.parseInt(anwsers[i][0])){
              anwmatrix[i][5]++;
          }
          if ((parseInt(client[i][6]) + 1) == Integer.parseInt(anwsers[i][0])){
              anwmatrix[i][5]++;
          }
          if ((parseInt(client[i][7]) + 1) == Integer.parseInt(anwsers[i][0])){
              anwmatrix[i][5]++;
          }
      }
       /* for(int i=0;i<10;i++){
            System.out.print("AMR:");
            for(int ii=0;ii<6;ii++){
                System.out.print(anwmatrix[i][ii]+ " ");
            }System.out.print("AnW: "+ anwsers[i][0]+" " +anwsers[i][1]+" " +anwsers[i][2] + "My Anwsers are: " +(client[i][5]) + " "+ (client[i][6]) + " "+ (client[i][7]) + " " );
            System.out.println(" ");
        } */
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\aserg\\IdeaProjects\\MIFID-III\\src\\scens.json"));
        Type listType = (Type) new TypeToken<List<ScenScan>>() {}.getType();
         List<ScenScan> list = gson.fromJson(reader, (Type) listType);
         String resultTemp[] = new String[10];
          for (int i = 0;i<10;i++){
              switch (anwmatrix[i][0]){
                  case 2:
                      resultTemp[i]= "Professional";
                      System.out.println("Case2" + i);
                      break;
                  case 0:
                      resultTemp[i] = "Not Aviable";
                      System.out.println("Case0");
                      break;
                  case 1:
                      if(anwmatrix[i][1] == 1){
                          for (int ii = 1; ii<list.size(); ii++){
                              if(list.get(ii).getValues().get(0).equals(anwmatrix[i][2])){
                                  if (list.get(ii).getValues().get(1).equals(anwmatrix[i][3])){
                                      if (list.get(ii).getValues().get(2).equals(anwmatrix[i][5])){
                                        resultTemp[i] = "id:" + list.get(ii).getId();
                                        System.out.println("Case" + i+ " id:" +list.get(ii).getId());
                                      }
                                  }
                              }
                          }
                      } else{
                          resultTemp[i] = "Not Aviable";
                          System.out.println("Caseelse");
                      }
                      break;
              }

          }
          for(int i = 10;i<9;i++) {


              System.out.println(resultTemp[i]);
          }
        //System.out.println(gson.toJson(list));


    }
}
