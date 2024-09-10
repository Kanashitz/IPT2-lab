public class calculator{
    public static int add(int a, int b){
    return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
        }

    public static void main (String[] args){
        System.out.println("Sum: " + add(20,10));
        System.out.println("Difference: " + subtract(20,5));
    }
    }