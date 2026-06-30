import java.util.*;
public class Adding{
public void addMedicine( ArrayList <Medicines> Medicine,Scanner sc){
        System.out.println("Enter Medicine ID");
        int MedicineId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter medicine Name");
        String MedicineName =sc.nextLine();
        System.out.println("Enter Medicine Company");
        String Company=sc.nextLine();
        System.out.println("Enter the price of Medicine");
        double Price = sc.nextInt();
        System.out.println("Enter the Quantity of the Medicines");
        int Quantity = sc.nextInt();
        Medicine.add(new Medicines(MedicineId,MedicineName,Company,Price,Quantity));
        System.out.println("==============================");
        System.out.println("Medicine Added Successfully");
        System.out.println("==============================");
    }
    public void viewMedicine(ArrayList<Medicines>Medicine){
        if(Medicine.isEmpty()){
            System.out.println("============================");
            System.out.println("Medicines Not Found");
            System.out.println("============================");
        }
        for(Medicines M:Medicine){
            M.viewMedicines();
        }
}
    public void searchMedicine(ArrayList<Medicines>Medicine,Scanner sc){
        for(Medicines ab:Medicine){
            ab. searchMedicine(Medicine, sc);
    }
}
 public void purchaseMedicine(ArrayList<Medicines>Medicine,Scanner sc){
        for(Medicines ac:Medicine){
            ac. purchaseMedicine(Medicine, sc);
    }
}
    public void generateBill(ArrayList<Medicines>Medicine,Scanner sc){
        for(Medicines aa:Medicine){
            aa. generateBill(Medicine, sc);
    }

}
    public void lowStockReport(ArrayList<Medicines>Medicine,Scanner sc){
        for(Medicines ad:Medicine){
            ad. lowStockReport(Medicine, sc);
}
    }
}
