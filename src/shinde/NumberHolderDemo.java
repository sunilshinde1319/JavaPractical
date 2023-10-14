package shinde;

public class NumberHolderDemo {

    public static void main(String[] args) {
        // 1. Create an instance of the NumberHolder class
        NumberHolder numberHolder = new NumberHolder();
        
        // 2. Initialize its two member variables
        numberHolder.anInt = 5;
        numberHolder.aFloat = 10.5f;

        // 3. Display the value of each member variable
        System.out.println("Value of anInt: " + numberHolder.anInt);
        System.out.println("Value of aFloat: " + numberHolder.aFloat);
    }

}

class NumberHolder {
    public int anInt;
    public float aFloat;
}

