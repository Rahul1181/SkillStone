//2. Write a class StaticDemo consists of ‘ a’ and ‘b’ static integer variables  (a= 42 and b = 32) and static method  find() -
// which displays ‘b’ value. Create a class StaticByName to call the method and access the static variable ‘a’ to display the values of a and b
class StaticDemo {
    static int a = 42;
    static int b = 32;

    public static int find() {
        return b;
    }
}
public class StaticByName {
        public static void main(String[] args) {
            System.out.println("The values of a and b are:\n"+StaticDemo.a+"\n"+StaticDemo.find());//We have called the class and accessed the values
        }
}
