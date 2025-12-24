//30. Write a class ConstThisOver and its default constructor to call the parameterized constructor to display the employee number.

public class ConstThisOver {
    long employeeNumber;
    public ConstThisOver(long employeeNumber){
        //this.employeeNumber=employeeNumber;
        System.out.println(employeeNumber);
    }
    public ConstThisOver(){
        this(101121);
        /*System.out.print("Enter the employee number: ");
        Scanner sc=new Scanner(System.in);
        long id=sc.nextLong();

         */
    }
    public static void main(String[] args){
        ConstThisOver co=new ConstThisOver();

    }
}
