package lab3.memories;

import lab3.people.*;

public class FirstMemory implements AbleToBegin{
    private String name;
    public FirstMemory(String name) {
        this.name = name;
    }
    Student student = new Student("Студент", "");
    Vasilisa vasilisa = new Vasilisa("Василиса", "");
    public void memoryBegins(String studentStatus, String vasilisaStatus) {
        String s = "ready";
        if (s.equals(studentStatus) && s.equals(vasilisaStatus)) {
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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
