package classes;

public class AgeCheck{
    public static void checkingTheAgeValue(int a) throws AgeCheckException {
        if (a < 0) {
            throw new AgeCheckException(a);
        }
        else {
            System.out.println("Возраст корректен!");
        }
    }
}
class AgeCheckException extends Exception {
    public AgeCheckException(int a) {
        System.out.println("Введённое число " + a + " не может быть возрастом!");
    }
}
