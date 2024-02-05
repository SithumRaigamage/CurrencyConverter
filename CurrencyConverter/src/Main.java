import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Currency Converter made by Sithum Raigamage made on 24/09/2023 ");

        //the program code
        String line="------------------";
        String line1="                         ";
        System.out.println("");

        Scanner input=new Scanner(System.in);
        System.out.println("");
        //menu bar

        boolean condition=true;

        while (condition) {
            System.out.println(line+"Welcome to Currency Converter "+line);
            System.out.println("");
            System.out.println(line1+"1. US to LKR"+line1);
            System.out.println(line1+"2. GBP to LKR"+line1);
            System.out.println(line1+"3. AUS to LKR"+line1);
            System.out.println(line1+"4. LKR to US"+line1);
            System.out.println(line1+"5. LKR to GBP"+line1);
            System.out.println(line1+"6. LKR to AUS"+line1);
            System.out.println(" ");

            //Asking the user to amount
            System.out.print("Enter the Amount that u want to convert :");
            double Amount=input.nextDouble();

            System.out.print("Enter Choice :");
            int choice=input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("US($) Converted to SriLankan is : "+"Rs/="+UsToLkr(Amount));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("GBP(£) Converted to SriLankan is : "+"Rs/="+GbpToLkr(Amount));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("AUS($) Converted to SriLankan is : "+"Rs/="+AusToLkr(Amount));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(" SriLankan Converted to US($)  is : "+"UsDollars= $"+LkrToUs(Amount));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(" SriLankan Converted to GBP(£) is : "+"Pounds= £"+LkrToGbp(Amount));
                    System.out.println("");
                    break;
                case 6:
                    System.out.println(" SriLankan Converted to AUS($)  is : "+"AusDollars= $"+LkrToAus(Amount));
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Program Exit");
                    condition=false;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }

        }




    }
    public static double UsToLkr(double Amount){
        double Total=Amount*323.11;
        return Total;
    }
    public static double GbpToLkr(double Amount){
        double Total=Amount*395.45;
        return Total;

    }
    public static double AusToLkr(double Amount){
        double Total=Amount*208.15;
        return Total;

    }
    public static double LkrToUs(double Amount){
        double Total =Amount/323.11;
        return Total;
    }
    public static double LkrToGbp(double Amount){
        double Total=Amount/395.45;
        return Total;
    }
    public static double LkrToAus(double Amount){
        double Total=Amount/208.15;
        return Total;

    }

}