package gb.ru;

public class HomeWork2 {

    public static void main(String[] args) {

        System.out.println(sum(10, 10));
        number(3);
        System.out.println(number2(2));
        strings(11, "aaaaa");
        System.out.println(year(200));

    }

    public static boolean sum(int a, int b) {

        if (a + b >= 10 && a + b <= 20)
            return true;
        else return false;

    }

    public static void number(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean number2(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void strings(int a, String b) {
        int i;
        for (i = 0; i != a; i++) {
            System.out.println(b);
        }

    }

    public static boolean year(int year) {

        if (year % 4 != 0) {
            return false;
        } else {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            } else return false;
        }
    }


}





