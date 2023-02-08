//package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас Exercise використовується для знаходження всіх дільників даного шестицифрового числа.
 * Метод `Calculate` приймає ціле число `Number` і повертає представлення рядка
 * списку всіх його дільників, розділених комами.
 */
public class Exercise {
    public static String Calculate(int Number){
        /**
         * Знаходить усі дільники заданого шестизначного числа та повертає їх у вигляді рядка.
         *
         * @param Number шестизначне число, для якого потрібно знайти дільники
         * @return рядкове представлення дільників, розділених комами
         */
        List<String> dividers = new ArrayList<String>();

        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                dividers.add(String.valueOf(i));
            }
        }
        return dividers.toString();
    }
}
