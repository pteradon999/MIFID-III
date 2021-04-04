import java.util.Scanner;

public class Receiver {
    public static void reciver (String args[]){
        Scanner scanner =  new Scanner(System.in);
        //
        System.out.println("Enter Client Type");
        Client client = new Client();
        client.c_type = scanner.nextLine();
        if (client.c_type == "JUR") {
            client.Company_Name = scanner.nextLine();
            System.out.println("Enter Company Name");
            client.Reg_Num = scanner.nextLine();
            System.out.println("Enter REg.Number");
            client.Reg_country = scanner.nextLine();
            client.Pars_pam = scanner.nextLine();
            client.Name = scanner.nextLine();
            client.education = scanner.nextLine();
            client.country = scanner.nextLine();
            client.cap_value = scanner.nextInt();
            client.language = scanner.nextLine();
            client.workplace = scanner.nextLine();

        }
    }
}
