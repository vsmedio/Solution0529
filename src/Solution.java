import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем регистре и нажмет Enter.
3. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
4. Программа должна корректно работать, если пользователь ввел два числа число и слово «сумма».
5. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
6. Программа должна выводить текст на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {
            String a = reader.readLine();
            if (a.equals("сумма")) {
                System.out.println(s);
                break;
            }
            else {
                int i = Integer.parseInt(a);
                s = s + i;
            }
        }
    }
}
