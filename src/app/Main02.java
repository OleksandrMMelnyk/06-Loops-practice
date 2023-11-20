//Є діапазон чисел від 1 до 10, включно.
//        За допомогою циклу for розрахуйте суму чисел кратних 3-м наростаючим
//        підсумком та загальну суму чисел кратних 3-м.
//        Виведення окремого пункту переліку чисел має бути пронумероване.
//        Виведення має такий вигляд:
//
//        1) Num is 3, sum is 3
//        2) Num is 6, sum is 9
//        3) Num is 9, sum is 18
//        ------------------------
//        Sum of numbers is 18

package app;


public class Main02 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;


        for (int number = 3; number <= 10; number= number +3) {
            count++;
            System.out.println(count + ")Num is " + number + "," + " sum is " + (sum = sum + number));
        }
        System.out.println("------------------------" +
                "\nSum of numbers is " + sum);
    }
}
