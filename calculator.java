public class calculator{
    public static int add(int a, int b){
    return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
        }

    public static int multiply(int a, int b){
            return a * b;
            }
    public static int divide(int a , int b){
            if (b==0){
                throw new
                ArithmeticException("Division by zero is not allowed");
            }
                return a/b;
            }
            public static int modulus(int a, int b){
                return a % b;
                }
    
    public static void main (String[] args){
        System.out.println("Sum: " + add(20,10));
        System.out.println("Difference: " + subtract(20,5));
        System.out.println("Product: " + multiply(20,5));
        System.out.println("Quotient: " + divide(50,5));
        System.out.println("Modulus: " + modulus(25,90));
    }
}