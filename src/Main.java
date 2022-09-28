import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ДЗ 1.
        System.out.println("   ДЗ 1.");

        int[] expensesTracker = generateRandomArray();

        System.out.println(Arrays.toString(expensesTracker));

        // Задание 1.
        System.out.println("   Задание 1.");
        int sum = 0;
        for (int expenseTracker : expensesTracker) {
            sum += expenseTracker;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");



        // Задание 2.
        System.out.println("   Задание 2.");
        int maximumFlow = Integer.MIN_VALUE;
        int minimumFlow = Integer.MAX_VALUE;
        for ( int expenseTracker : expensesTracker) {
            if (expenseTracker > maximumFlow) {
                maximumFlow = expenseTracker;
            }
             if (expenseTracker < minimumFlow) {
            minimumFlow = expenseTracker;
             }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximumFlow + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minimumFlow + " рублей.");



        // Задание 3.
        System.out.println("   Задание 3.");
        double averageExpense = (double) sum /expensesTracker.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");



        // Задание 4.
        System.out.println("   Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }

