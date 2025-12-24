//31. Write a class EmpConsOver a display name and number using display() and assign the values using constructors.
// Use objects to call the methods and pass the parameters to the constructors accordingly.

public class EmpConsOver {
    String name;
    int id;
    public EmpConsOver(String name, int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Employee name: "+name+"\n Employee number: "+id);
    }
    public static void main(String[] args){
        //How can we use Scanner in this ?
        EmpConsOver emp1=new EmpConsOver("Akil", 101);
        emp1.display();
        EmpConsOver emp2=new EmpConsOver("Arun", 102);
        emp2.display();
        EmpConsOver emp3=new EmpConsOver("Rajesh", 103);
        emp3.display();
        EmpConsOver emp4=new EmpConsOver("Vishal", 104);
        emp4.display();

    }
}
