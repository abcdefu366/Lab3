package lab3.memories;

import lab3.people.*;

public class FirstMemory implements AbleToBegin{
    private String name;
    public FirstMemory(String name) {
        this.name = name;
    }
    Student student = new Student("Студент", "ready");
    Vasilisa vasilisa = new Vasilisa("Василиса", "ready");
    public void memoryBegins(Object otherStudent, Object otherVasilisa) {
        if (student.equals(otherStudent) && vasilisa.equals(otherVasilisa)) {
            System.out.println(name + " начинается");
        }
        else {
            System.out.println(name + " ещё невозможно");
        }
    }
    public void memoryOne() {
        student.thinkAbout(vasilisa.getName());
        class Peter {
            private String name;
            private String action;
            public String doSomething() {
                return name + " сделал " + action;
            }
            Peter(String name) {
                this.name = name;
            }
        }
        Peter peter = new Peter("Пётр");
        peter.action = "что-то страшное ночью...";
        vasilisa.cryForTheReason(peter.doSomething());
        vasilisa.setStatus("");
        student.setStatus("");
        System.out.println(name + " закончилось");
        System.out.println();
    }
}
