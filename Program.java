
import java.io.IOException;
import java.util.logging.*;

public class Program {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        RationalResult rational = new RationalResult();
        ComplexResult complex = new ComplexResult();
        Print print = new Print();
        int contin = 0;
        while (contin == 0) {
            System.out.print("\033[H\033[J");
            logger.info("Начало работы калькулятора");            
            System.out.println("1 - рациональные числа");
            System.out.println("2 - комплексные числа");
            int kind = Input.kindValue("Введите вид чисел: ");
            logger.info("Выбор вида числа");
            if (kind == 1) {
                int a = Input.getValue("Введите числитель первого числа: ");
                int b = Input.getValue("Введите знаменатель первого числа: ");
                int c = Input.getValue("Введите числитель второго числа: ");
                int d = Input.getValue("Введите знаменатель второго числа: ");
                logger.info("Ввод чисел");
                String action = Input.getAction("Введите действие (+,-,*,/): ");
                logger.info("Ввод действия");
                rational.setA(a);
                rational.setB(b);
                rational.setC(c);
                rational.setD(d);
                logger.info("Запись чисел");
                String result = rational.result(action);
                logger.info("Вычисление");
                print.print(result, "Результат: ");
                logger.info("Результат");
            }
            if (kind == 2) {
                int a1 = Input.getValue("Введите величину a первого числа: ");
                int b1 = Input.getValue("Введите величину b первого числа: ");
                int a2 = Input.getValue("Введите величину a второго числа: ");
                int b2 = Input.getValue("Введите величину b второго числа: ");
                logger.info("Ввод чисел");
                String action = Input.getAction("Введите действие (+,-,*,/): ");
                logger.info("Ввод действия");
                complex.setA1(a1);
                complex.setB1(b1);
                complex.setA2(a2);
                complex.setB2(b2);
                logger.info("Запись чисел");
                String result = complex.result(action);
                logger.info("Вычисление");
                print.print(result, "Результат: ");
                logger.info("Результат");
            }
            contin = Input.contin("Продолжить вычисления? (0-да;1-нет): ");
        }
    }
}
