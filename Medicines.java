import java.util.*;

public class Medicines{
int qty;
private int MedicineId;
private String MedicineName;
private String Company;
private double Price;
private int Quantity;
    public Medicines(int MedicineId,String MedicineName,String Company,double Price, int Quantity){
    this.MedicineId = MedicineId;
    this.MedicineName = MedicineName;
    this.Company = Company;
    this.Price = Price;
    this.Quantity = Quantity;
    }
public void viewMedicines(){
    System.out.println("Medicine ID : " + this.MedicineId);
    System.out.println("Medicine Name : "+ this.MedicineName);
    System.out.println("Company of Medicine : "+ this.Company);
    System.out.println("Price of the Medicine : "+ this.Price);
    System.out.println("Quantity of the Medicines : "+ this.Quantity);
    System.out.println("====================");
}

public void searchMedicine(ArrayList <Medicines> Medicine,Scanner sc) {
        if (Medicine.isEmpty()) {
            System.out.println("No Medicines Available.");
            return;
        }
        System.out.print("Enter Medicine ID: ");
        int id = sc.nextInt();
        for (Medicines a : Medicine) {
            if (a.MedicineId == id) {
                System.out.println("\n Medicine Found");
                a.viewMedicines();

                return;
            }
        }

        System.out.println("Medicine Not Found.");
    }
public void purchaseMedicine(ArrayList <Medicines> Medicine,Scanner sc) {

        if (Medicine.isEmpty()) {
            System.out.println("No Medicines Available.");
            return;
        }

        System.out.print("Enter Medicine ID: ");
        int id = sc.nextInt();
            for (Medicines b : Medicine) {
                
            if (b.MedicineId == id) {
                System.out.print("Enter Quantity: ");
                qty = sc.nextInt();
                if (qty >= this.Quantity) {
                    System.out.println("Insufficient Stock.");
                    return;
                }
                System.out.println("Remaining Stock : " + b.Quantity);

                return;
            }
        }

        System.out.println("Medicine Not Found.");
    }
    public  void generateBill(ArrayList <Medicines> Medicine,Scanner sc){
    double total;
    for (Medicines a : Medicine) {
        total = a.Price* qty; 
    
            System.out.println("\n==========================================");
            System.out.println("          PHARMACY BILL");
            System.out.println("==========================================");
            System.out.println("Medicine ID   : " + this.MedicineId);
            System.out.println("Medicine Name : " + this.MedicineName);
            System.out.println("Company       : " + this.Company);
            System.out.println("Price         : " + this.Price);
            System.out.println("Quantity      : " + qty);
            System.out.println("==========================================");
            System.out.println("Total Amount  : " + total);
            System.out.println("==========================================");
            System.out.println("      Thank You! Visit Again.");
            System.out.println("==========================================");
    }
}
    public void lowStockReport(ArrayList <Medicines> Medicine,Scanner sc) {

        boolean found = false;

        System.out.println("\n===== Low Stock Medicines =====");

        for (Medicines m : Medicine) {

            if (m.Quantity < 10) {
                m.viewMedicines();

                found = true;
            }
        }

        if (!found) {

            System.out.println("No Low Stock Medicines.");
        }
    }
}