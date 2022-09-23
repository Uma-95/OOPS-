package abc;
public class customer1{

    String name;
String phoneNumber;
String gmailId;
public customer1(String Name,String phoneNumber,String gmailId)
{
this.name=Name;
this.phoneNumber=phoneNumber;
this.gmailId= gmailId;
//  printCustomerdetails();
}

public void printCustomerdetails()
{
    System.out.println("Name: "+name);
 System.out.println("E-mail ID : "+gmailId);
    System.out.println("Contact Number: "+phoneNumber);
}

}
