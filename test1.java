//  import ABC.Student;
//  import ABC.Details;
// import   ABC.Customer;
import abc.*;

public class test1{
public static void main(String[]args){

customer1 c1 =new customer1("Sneha","2345678911","itsmygmailis@gmail.com");
details1 d1=new details1("Sharanya","1234567985");
student1 s1=new student1("Uma",44,"ECE");
// c1.printCustomerdetails();
// d1.printdetails();
// s1.printStudentDetails();

System.out.println("Customer details: "); c1.printCustomerdetails();
System.out.println("details: "); d1.printdetails();
System.out.println("Student details: "); s1.printStudentDetails();
//}

}}
