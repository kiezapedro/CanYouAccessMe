class Superclass{
    int number = 56;
}
class Subclass extends Superclass
{
    int number = 96;
    void printNumber(){
        System.out.println(number);
    }
}
public class Super {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.printNumber();
    }
}
