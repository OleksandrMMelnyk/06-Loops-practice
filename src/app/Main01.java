//Є діапазон чисел від 1 до 6, включно.
//        За допомогою циклу for розрахуйте суму перших 4-х чисел наростаючим
//        підсумком та загальну суму перших 4-х чисел.
//        Виведення окремого пункту переліку чисел має бути пронумероване.
//        Виведення має такий вигляд:
//
//        1) Num is 1, sum is 1
//        2) Num is 2, sum is 3
//        3) Num is 3, sum is 6
//        4) Num is 4, sum is 10
//        ------------------------
//        Sum of numbers is 10

package app;

public class Main01 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int number = 1; number <= 4; number++) {
            count++;
            System.out.println(count + ")Num is " + number + "," + " sum is " + (sum = sum + number));
        }
        System.out.println("------------------------" +
                "\nSum of numbers is " + sum);
    }
}

