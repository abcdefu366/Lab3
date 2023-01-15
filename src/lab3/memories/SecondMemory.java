package lab3.memories;

import classes.Place;
import lab3.people.*;

public class SecondMemory implements AbleToBegin{
    private String name;
    public SecondMemory(String name) {
        this.name = name;
    }
    Student student = new Student("Студент", "",0.0);
    Vasilisa vasilisa = new Vasilisa("Василиса", "");
    DaughterOfVasilisa daughterOfVasilisa = new DaughterOfVasilisa("Дочь Василисы", "");

    public void memoryBegins(String studentStatus, String vasilisaStatus) {
        String s = "ready";
        if (s.equals(studentStatus) && s.equals(vasilisaStatus)) {
            System.out.println(name + " начинается");
        }
        else {
            System.out.println(name + " ещё невозможно");
        }
    }
    public void memoryTwoPartOne() {
        student.thinkAbout(vasilisa.getName() + " и " + daughterOfVasilisa.getName());
        daughterOfVasilisa.getEmbarrassed();
        String reason = student.tell(" рассказал о происходившем 19 веков назад");
        vasilisa.cryForTheReason(reason);
        int delay = 1000;
        try {
            String storyOfStudent = " рассказом " + student.getName() + "а";
            student.studentConviction();
            Thread.sleep(delay);
            delay += 500;
            student.seeTheConnectionBetween(storyOfStudent, "настоящее");
            student.studentConviction();
            Thread.sleep(delay);
            delay += 500;
            student.seeTheConnectionBetween(storyOfStudent, vasilisa.getName() + " и " + daughterOfVasilisa.getName());
            student.studentConviction();
            Thread.sleep(delay);
            delay += 500;
            student.seeTheConnectionBetween(storyOfStudent, "пустынная " + Place.VILLAGE);
            student.studentConviction();
            Thread.sleep(delay);
            delay += 500;
            student.seeTheConnectionBetween(storyOfStudent, student.getName());
            student.studentConviction();
            Thread.sleep(delay);
            delay += 500;
            student.seeTheConnectionBetween(storyOfStudent, "все люди");
            student.studentConviction();
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void memoryTwoPartTwo() {
            String status = "convinced";
            String nameOfStudent = "Студент";
            if (student.hashCode() != status.hashCode() * nameOfStudent.hashCode()) {
                System.out.println(student.getName() + " не готов продолжить вспоминать...");
            }
            else {
                System.out.println(student.getName() + " готов продолжить вспоминать");
                class Granny {
                    private String name;
                    public String cry(String s) {
                        return name + " заплакала из-за " + s;
                    }
                    Granny(String name) {
                        this.name = name;
                    }
                }
                class Peter {
                    private String name;
                    private String soul;
                    Peter(String name, String soul) {
                        this.name = name;
                        this.soul = soul;
                    }
                }
                Granny granny = new Granny("Старуха");
                Peter peter = new Peter("Пётр", "Душа Петра");
                double a = 1;
                double b = Math.random();
                int delay = 1000;
                System.out.println(student.getName() + " думает, что " + granny.cry("трогательного рассказа " + student.getName()));
                while (a > b) {
                    System.out.println(student.getName() + " продолжает думать, что " + granny.cry("трогательного рассказа " + student.getName()));
                    a = Math.random();
                    b = Math.random();
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    delay += 1000;
                }
                System.out.println(student.understandThat() + "он не прав...");
                System.out.println(student.understandThat() + granny.cry("понимания близости к ") + peter.name);
                System.out.println(student.understandThat() + granny.cry("того, что ") + granny.name + " интересует происходящее в " + peter.soul);
                vasilisa.setStatus("");
                student.setStatus("");
                System.out.println(name + " закончилось");
                System.out.println();
            }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

