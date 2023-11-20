//Є діапазон чисел від 1 до 6, включно.
//        За допомогою циклу while розрахуйте суму чисел наростаючим підсумком
//        та загальну суму чисел.
//        Виведення окремого пункту переліку чисел має бути пронумероване.
//        Виведення має такий вигляд (числа виводяться в спадному порядку,
//        а сума - у наростаючому):
//
//        1) Num is 6, sum is 6
//        2) Num is 5, sum is 11
//        3) Num is 4, sum is 15
//        4) Num is 3, sum is 18
//        5) Num is 2, sum is 20
//        6) Num is 1, sum is 21
//        ------------------------
//        Sum of numbers is 21


package app;

public class Main03 {
    public static void main(String[] args) {

        int number = 6;
        int count = 0;
        int sum = 0;

        while (number > 0) {
            count++;
            System.out.println(count + ") Num is " + number + "," + " sum is " + (sum = sum + number));
            number--;
        }
        System.out.println("------------------------" +
                "\nSum of numbers is " + sum);
    }
}

