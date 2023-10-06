/**
 * @apiNote Класс для описания комплексного числа.
 */
public class ComplexNumber {
    private double realPart;
    private double imagPart;

    /**
     * Коструктор класса.
     *
     * @param realPart действиетльная часть комплексного числа.
     * @param imagPart мнимая часть комплексного числа.
     */
    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    @Override
    public String toString() {
        if (imagPart >= 0) {
            return realPart + " + " + imagPart + "i";
        } else {
            return realPart + " - " + Math.abs(imagPart) + "i";
        }
    }

    /**
     * Меод сложения комплексных чисел.
     *
     * @param input второе слогаемое.
     * @return рузультат сложения
     */
    public ComplexNumber addition(ComplexNumber input) {
        double realPart = this.realPart + input.realPart;
        double imagPart = this.imagPart + input.imagPart;
        return new ComplexNumber(realPart, imagPart);
    }

    /**
     * Метод умножения комплексных чисел.
     *
     * @param input второй множитель.
     * @return рузультат умножения.
     */
    public ComplexNumber multiplication(ComplexNumber input) {
        double realPart = this.realPart * imagPart - this.imagPart * input.imagPart;
        double imagPart = this.realPart * input.imagPart + this.imagPart * input.realPart;
        return new ComplexNumber(realPart, imagPart);
    }

    /**
     * Метод деления комплексных чисел.
     *
     * @param input делитель.
     * @return рузультат деления.
     */
    public ComplexNumber division(ComplexNumber input) {
        double dividor = input.realPart * input.realPart + input.imagPart * input.imagPart;
        double realPart = (this.realPart * input.realPart + this.imagPart * input.imagPart) / dividor;
        double imagPart = (this.imagPart * input.realPart - this.realPart * input.imagPart) / dividor;
        return new ComplexNumber(realPart, imagPart);
    }

}