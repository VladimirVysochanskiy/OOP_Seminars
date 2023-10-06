/**
 * @apiNote Интерфейс для описания взаимодействия с калькулятором.
 */
public interface iCalculator {
    /**
     * Складывает два комплексных числа.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    ComplexNumber addition(ComplexNumber num1, ComplexNumber num2);

    /**
     * Умножает два комплексных числа.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения комплексных чисел.
     */
    ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2);

    /**
     * Делит одно комплексное число на другое.
     *
     * @param num1 Делимое комплексное число.
     * @param num2 Делитель комплексное число.
     * @return Результат деления комплексных чисел.
     */
    ComplexNumber division(ComplexNumber num1, ComplexNumber num2);
}