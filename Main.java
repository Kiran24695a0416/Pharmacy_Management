import java.util.*;
public class Main{
    public static void main(String[] a){
        ArrayList <Medicines> Medicine =new ArrayList();
        Scanner sc = new Scanner(System.in);
        Adding adding = new Adding();
            System.out.println("===========================");
            System.out.println("Pharmacy Management System");
            System.out.println("===========================");
            while (true){
            System.out.println("Please Enter the Option");
            System.out.println("1==> Management");
            System.out.println("2==> Customer");
            System.out.println("3==> Exit");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    int option;
                        do { 
                            System.out.println("Please Enter your Option");
                            System.out.println("1==> Add Medicines");
                            System.out.println("2==> View Medicines");
                            System.out.println("3==> Stock Availability");
                            System.out.println("4==> Back");
                            option = sc.nextInt();
                            switch (option){
                                    
                                    case 1:
                                        adding.addMedicine(Medicine, sc);
                                        break;
                                    case 2:
                                        adding.viewMedicine(Medicine);
                                        break;
                                    case 3:
                                        adding.lowStockReport(Medicine, sc);
                                        break;
                                    }
                            }
                            while (option !=4);
                            break;
                case 2:
                    int select;
                    do { 
                        System.out.println("1==> Search Medicines");
                        System.out.println("2==> Purchase Medicines");
                        System.out.println("3==> Billing");
                        System.out.println("4==> Back");
                        select = sc.nextInt();
                        switch (select) {
                            case 1:
                                adding.searchMedicine(Medicine, sc);
                                break;
                            case 2:
                                adding.purchaseMedicine(Medicine, sc);
                                break;
                            case 3:
                                adding.generateBill(Medicine, sc);
                            default:
                                System.out.println("enter the valid option");
                                break;
                        }
                    } while (select !=4);  
                    break;    
             }
        }
    }
}