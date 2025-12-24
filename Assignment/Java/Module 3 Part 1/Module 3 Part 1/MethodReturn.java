//8. Write a class MethodReturn which contains instance method displaySalary(double salary, double hra) to calculate the salary of Vishal.

public class MethodReturn {
    private float displaySalary(double salary, double hra){
        return (float)(salary+hra);
    }
    public static void main(String[] args){
        MethodReturn mr=new MethodReturn();
        System.out.println("Vishal salary is: "+mr.displaySalary(20000,2000));
    }

}