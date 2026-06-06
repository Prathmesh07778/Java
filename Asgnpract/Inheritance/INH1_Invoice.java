package Asgnpract.Inheritance;

public class INH1_Invoice {

    int invoiceId;
    String customerName;
    double totalAmount;

    INH1_Invoice(int invoiceId, String customerName, double totalAmount) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    void applyGSTAndShow(double gstPercent) {
        double gst = totalAmount * gstPercent / 100;
        double finalBill = totalAmount + gst;
        System.out.println("---- Invoice ----");
        System.out.println("Invoice ID    : " + invoiceId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Amount        : " + totalAmount);
        System.out.println("GST (" + gstPercent + "%)   : " + gst);
        System.out.println("Final Bill    : " + finalBill);
    }

    public static void main(String[] args) {
        INH1_Invoice inv = new INH1_Invoice(101, "Rahul", 5000);
        inv.applyGSTAndShow(18);
    }
}