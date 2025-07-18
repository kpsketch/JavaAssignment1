


public class InvoiceTest {
   public static void main(String[] args) 
   {
//setting up initial values using contructor
      Invoice invoice1 = new Invoice("part1", "tabletop",5, 12.99);
      Invoice invoice2 = new Invoice("part2", "tablelegs", -6, -8.50);

      // display initial invoice details
      System.out.println("Invoice 1 Details:");
      System.out.println("Part Number: " + invoice1.getPartNumber());
      System.out.println("Description: " + invoice1.getPartDescription());
      System.out.println("Quantity: " + invoice1.getQuantity());
      System.out.println("Price: $" + invoice1.getPrice());
      System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());
      System.out.println();

      System.out.println("Invoice 2 Details:");
      System.out.println("Part Number: " + invoice2.getPartNumber());
      System.out.println("Description: " + invoice2.getPartDescription());
      System.out.println("Quantity: " + invoice2.getQuantity());
      System.out.println("Price: $" + invoice2.getPrice());
      System.out.println("Total Invoice Amount: $" + invoice2.getInvoiceAmount());
      System.out.println();

}

}