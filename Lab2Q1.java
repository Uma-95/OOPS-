//  Write a program to create a class Student with data ‘name, city and age’ along with method printData to display the 
// data. Create the two objects s1 ,s2 to declare and access the values.
 
 class Lab2Q1
 
{
	public static void main(String[] args) {
		Student s1= new Student("Uma","Hyd",21);
		System.out.println(s1.printData());
	}
}

 class Student
 {
    String name;
    String city;
    int age;
    public Student(String name,String city,int age){
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
