public class Main {
    public static void main(String[] args) {
        System.out.println("Miles      Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = convertMilesToKilometers(miles);
            System.out.println(miles + "          " + kilometers);
        }
    }
    public static double convertMilesToKilometers(int miles) {
        return miles * 1.60934;
    }
}