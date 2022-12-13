/******************************************************************************
WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.
*******************************************************************************/
public class Lab2Q3

{
	public static void main(String[] args) {
	    Sample s1=new Sample("BT20ECE044","UMA");
// 		System.out.println("Hello World");
	}
}

class Sample{
    String id;
    String name;
    Sample(String id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Sample constructor is now invoked"+" ");
        System.out.println("ID :"+id+" "+"Name :"+name);
    }
}
