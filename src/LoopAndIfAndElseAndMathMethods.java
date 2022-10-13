public class LoopAndIfAndElseAndMathMethods {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, ");
        System.out.println("World!");
        System.out.println(test(100));
        System.out.println(test2(2));
        System.out.println(String.valueOf(6 % 2 == 0));
        // Loop
int i =1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }
    }

    // Math methods
    public static double test(int num){
        return Math.sqrt(num);
    }

    // if and else and return
    public static String test2(int num){
        if(num > 3 && num < 10 ){
            return num + " is bigger than 3 and less than 10";
        } else {
            return num + " is bigger than 10 or smaller than 3";
        }
    }

    public static String test3(int num){
        if(num > 3 || num < 10 ){
            return num + " is bigger than 3 and less than 10";
        } else {
            return num + " is bigger than 10 or smaller than 3";
        }
    }
}
