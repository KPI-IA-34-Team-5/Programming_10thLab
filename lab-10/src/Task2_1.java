@FunctionalInterface
interface Task {
    void perform(double a, double b,double c, double d);
}

public class Task2_1 {
    public static void task1(double a, double b,double c, double d) {
        double sinDividedByA = Math.sin(c) / a;
        double lnOfAbsABandC = Math.log(Math.abs(a * b) * c);
        double logSqrtCofD = Math.log(d) / Math.log(Math.sqrt(c));
        double sqrtAbsOfLnAndLog = Math.sqrt(Math.abs(lnOfAbsABandC / logSqrtCofD));
        double finalAbsResult = Math.abs(sinDividedByA * sqrtAbsOfLnAndLog);

        double finalValue = Math.log(finalAbsResult) / Math.log(a);

        System.out.println("Значення параметрів:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("Значення ф-ції:");
        System.out.println(finalValue);
    }

    public static void main(String[] args) {
        double a = 21.58;
        double b = 5.34;
        double c = 2.65;
        double d = 3.33;

        Task task1 = Task2_1::task1;
        task1.perform(a,b,c,d);
    }
}
