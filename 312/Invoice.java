
public class Invoice {

  private String partnumber;    //declaring variables
  private String partdescription;
  private Integer quantity;
  private Double price;

public Invoice(String partnumber, String partdescription,Integer quantity,double price)
{ //setting up constructor

  this.partnumber = partnumber;
  this.partdescription = partdescription;

  // validating quantity
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;          
        }

        // validating price
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;           
        }


} 

//setting up method
public void getInvoiceAmount(double InvoiceAmount)
{
 InvoiceAmount = quantity * price;

}

//method returning InvoiceAmount
public double getInvoiceAmount()
{
return quantity*price;

}

 // set and get methods for variables
  public void setPartNumber(String partnumber) {
    this.partnumber = partnumber;
  }

  public String getPartNumber() {
    return partnumber;
  }

  public void setPartDescription(String partdescription) {
    this.partdescription = partdescription;
  }

  public String getPartDescription() {
    return partdescription;
  }

  public void setQuantity(Integer quantity) {
    if (quantity > 0) {
      this.quantity = quantity;
    } else {
      this.quantity = 0;
    }
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setPrice(Double price) {
    if (price > 0) {
      this.price = price;
    } else {
      this.price = 0.0;
    }
  }

  public Double getPrice() {
    return price;
  }
}
