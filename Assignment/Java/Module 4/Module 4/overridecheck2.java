//3. Create overridecheck1 and  overridecheck2 and use display() in both the classes to display number and name
//   overridecheck1 extends overridecheck2  and use super and this keywords to access and assign values
import java.util.Scanner;

public class overridecheck2 {
    int number;
    String name;
    public void display(int number, String name){
        this.number=number;
        this.name=name;
        System.out.println(number+"\n"+name);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        overridecheck1 oc=new overridecheck1();// Object method is build from which class?
        oc.display(number, name);
    }
}
class overridecheck1 extends overridecheck2{
    public void display(){
        super.display(number, name);
    }

}
