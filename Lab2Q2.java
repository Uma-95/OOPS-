/******************************************************************************
Write a program to create a class Student2 along with two method getData(),printData() to get the value through 
argument and display the data in printData. Create the two objects s1 ,s2 to declare and access the values from 
class STtest.
*******************************************************************************/
public class Lab2Q2
{
	public static void main(String[] args) {
		Student2 s1= new Student2();
		s1.getData("Uma","Hyd",21);
		System.out.println(s1.printData());
	
	}
}


class Student2{
    private String name;
    private String city;
    private int age;

    public void getData(String name,String city,int age){
        this.name=name;
        this.city=city;
        this.age=age;
    }
     public int printData(){
         System.out.println(this.name);
        //  System.out.println(this.age);
         System.out.println(this.city);
        return age;
     }
}
