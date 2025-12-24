import java.util.Scanner;

//2. Create a class EmpOverriding and Employee and create a displayName(). Create a displayName() in both the classes (overriding methods)
//Make employee class is a super class of empoverriding class. Display the empNames of the both classes using super keyword and call the methods accordingly.
class Employee{
    String name,name1; //If we remove it then child class method will show error
    public void displayName(String name,String name1){// To display the input so we have to pass the parameter otherwise it will give error when calling
        System.out.println(name+"\n"+name1);
    }
}
//Does child class inherit the values of method parameter?
class EmpOverriding extends Employee{
    public void displayName(){
        super.displayName(name, name1);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name2=sc.nextLine();
        String name3=sc.nextLine();
        EmpOverriding em=new EmpOverriding();
        em.displayName(name2, name3); //If we don't use the parameter it will give null
    }
}
