public class Main {
    public static void main(String[] args) {
        // задание №1
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // задание №2
        int friday = 3;
        while (friday < 32) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }

        // задание №3
        int currentYear = 2022;
        int period = 79;
        for (int i = 0; i < currentYear + period; i += period) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }
    }
}