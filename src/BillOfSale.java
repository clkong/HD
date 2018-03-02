/*
 * Sean Luo
 * BillOfSale.java
 * This program calculates the BillOfSale
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchaseprice=12.49;
        double taxes=12.49*0.13;
        double total=purchaseprice+taxes;
        double change=20-total;
        System.out.println("The purchaseprice is= $"+purchaseprice);
        System.out.println("The taxes is= $"+taxes);
        System.out.println("The total is= $"+total);
        System.out.println("The change is= $ "+change);
    }
    
}
