package lab3.people;

import classes.*;
import lab3.Person;

public class Student extends Person implements AbleToThink {

    private String status;
    private int age;
    private double conviction;
    private String soul = "душа " + getName();
    private String progress = "";
    @Override
    public void thinkAbout(String s) {
        System.out.println(getName() + " думал о " + s);
    }
    public void sayGoodNight() {
        class Widows {
            private String widows;

            @Override
            public String toString() {
                return widows;
            }

            Widows(String widows) {
                this.widows = widows;
            }
        }
        Widows widows = new Widows("вдовы");
        System.out.println(getName() + " пожелал " + widows + " спокойной ночи");
    }

    public void wentFurther() {
        System.out.println(getName() + " пошёл дальше");
        System.out.println();
    }

    public String tell(String s) {
        return getName() + s;
    }

    public void getCold(){
        class Hands {
            private String hands;

            Hands(String hands) {
                this.hands = hands;
            }
        }
        Hands hands = new Hands("Руки");
        System.out.println(hands.hands + " стали зябнуть");
    }

    public void readyForFirstMemory(boolean firstCondition, boolean secondCondition, boolean thirdCondition) {
        if (firstCondition == true & secondCondition == true & thirdCondition == true) {
            System.out.println(getName() + " готов к первому воспоминанию");
            setStatus("ready");
        } else {
            System.out.println(getName() + " не готов к первому воспоминанию");
            setStatus("unready");
        }
    }

    public String getStatus() {
        return status;
    }

    public void lockedBack() {
        System.out.println(getName() + " оглянулся");
    }

    public Student(String name, Place place, String status, int age, int conviction) {
        super(name, place);
        this.status = status;
        this.age = age;
        this.conviction = conviction;
    }
    public Student(String name) {
        super(name);
    }
    public void readyForSecondMemory(boolean condition, String fireStatus) {
        if (condition == true & fireStatus == "lonely") {
            System.out.println(getName() + " готов ко второму воспоминанию");
            setStatus("ready");
            setProgress(getProgress() + "Первое");
        } else {
            System.out.println(getName() + " не готов ко второму воспоминанию");
            setStatus("unready");
        }
    }

    public void seeTheConnectionBetween(String s, String thing) {
        System.out.println(getName() + " видит связь между" + s + " и " + thing);
        conviction = conviction + 0.2;
    }

    public int convertConviction(double conviction) {
        int x = (int) (conviction * 100);
        return x;
    }
    public String getConviction () {
        String s = String.valueOf(conviction);
        return s;
    }

    public void studentConviction() {
        System.out.println(getName() + " убеждён на " + convertConviction(conviction) + "%");
        if (conviction == 1.0) {
            System.out.println(getName() + " убедился!");
            setStatus("convinced");
        } else {
            System.out.println(getName() + " ещё недостаточно убеждён...");
        }
    }

    @Override
    public int hashCode() {
        int value;
        value = getName().hashCode() * status.hashCode();
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return other.status == status;
    }

    public String understandThat() {
        return getName() + " понимает, что ";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void suddenlyFellHappy() {
        System.out.println("Радость вдруг заволновалась в " + soul);
    }

    public void stopForAWhile(String time, String reason) {
        System.out.println(getName() + " остановился на " + time + " по причине " + reason);
        setStatus("rested");
        System.out.println();
    }

    public void readyForThirdMemory(String studentStatus) {
        if (studentStatus == "rested") {
            System.out.println(getName() + " готов к третьему воспоминанию");
            setStatus("ready");
            setConviction(0.0);
            setProgress(getProgress() + ", второе");
        } else {
            System.out.println(getName() + " не готов к третьему воспоминанию");
            setStatus("unready");
        }
    }
    public void see(String s) {
        System.out.println(getName() + " увидел" + s);
    }
    public void touch(String s) {
        System.out.println(getName() + " дотронулся " + s);
    }
    public void setConviction(double d) {
        this.conviction = d;
    }
    public void crossOverBy(Place vehicle, Place let) {
        System.out.println(getName() + " переправлялся на " + vehicle + " через " + let);
        setPlace(Place.FERRY);
    }
    public void climb(Place place) {
        System.out.println(getName() + " поднимался на " + place);
        setPlace(Place.MOUNTAIN);
    }
    public void lookAt(Place place) {
        System.out.println(getName() + " глядел на " + place);
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getProgress() {
        return progress;
    }

    public void readyForFourthMemory(boolean firstCondition, boolean secondCondition) {
        if (firstCondition == true & secondCondition == true) {
            System.out.println(getName() + " готов к четвёртому воспоминанию");
            setStatus("ready");
            setProgress(getProgress() + ", третье воспоминания восстановлены");
        } else {
            System.out.println(getName() + " не готов к четвёртому воспоминанию");
            setStatus("unready");
        }
    }
    public void beSomeYearsOld() {
        try {
            AgeCheck.checkingTheAgeValue(age);
            System.out.println(getName() + " было " + age + " года");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public void feelAtTheEnd() {
        class Life {
            private String name;
            private String status;
            Life(String name, String status) {
                this.name = name;
                this.status = status;
            }
            public void seemToSomeone(String object, String subject, String inWhatWay) {
                System.out.println(object + " казалась " + subject + " " + inWhatWay);
            }
        }
        Life life = new Life("Жизнь", "восхитительная, чудесная и полная высокого смысла!");
        life.seemToSomeone(life.name, getName(), life.status);
    }
    public Student(String name, String status) {
        super(name);
        this.status = status;
    }
    public Student(String name, String status, double conviction) {
        super(name);
        this.status = status;
        this.conviction = conviction;
    }
}
