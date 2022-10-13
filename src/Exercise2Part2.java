public class Exercise2Part2 {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 12;
        int second = 13;
        System.out.println("The time right now is " + (int) hour + ":" + (int) minute + ":" + (int) second);
        System.out.println("The time right now is " + (int) hour + " hours " + ":" + " " + (int) minute + " minutes " + ":" + " " + (int) second + " seconds ");
        System.out.print("There is " + ((int) hour * 60 * 60 + (int) minute * 60 + (int) second) + " seconds since midnight." );
    }
}
