package lab3.memories;

import lab3.people.Student;

public class ThirdMemory implements AbleToBegin {
    private String name;

    public ThirdMemory(String name) {
        this.name = name;
    }

    Student student = new Student("Студент", "ready", 0.0);

    public void memoryBegins(Object otherStudent, Object studentConviction) {
        String convictionOfStudent = student.getConviction();
        if (student.equals(otherStudent) && convictionOfStudent.equals(studentConviction)) {
            System.out.println(name + " начинается");
        } else {
            System.out.println(name + " ещё невозможно");
        }
    }
    public void memoryThree(){
        class ContinuousChainOfSomething {
            private String name;
            private String status;
            private String something;
            ContinuousChainOfSomething(String name, String something, String status) {
                this.name = name;
                this.something = something;
                this.status = status;
            }
            public void bind(String obj1, String obj2, String wayOfLinkingObjects) {
                System.out.println(name + " связывала " + obj1 + " и " + obj2 + " " + wayOfLinkingObjects);
            }
        }
        ContinuousChainOfSomething continuousChainOfEvents = new ContinuousChainOfSomething("Непрерывная цепь", "события","вытекавших одно из другого");
        student.thinkAbout(continuousChainOfEvents.name + " " + continuousChainOfEvents.something);
        continuousChainOfEvents.bind("Прошлое", "Настоящее", "c помощью" + " " + continuousChainOfEvents.something + ", " + continuousChainOfEvents.status);
        student.thinkAbout(student.getName());
        student.see(" " + "Оба конца" + " " + continuousChainOfEvents.name);
        double a = 1;
        double b = Math.random();
        int delay = 1000;
        while (a > b) {
            student.touch("до одного конца");
            System.out.println(student.getName() + " не видит никаких изменений");
            a = Math.random();
            b = Math.random();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            delay += 1000;
        }
        student.touch("до одного конца");
        student.see(", что другой конец дрогнул!");
        student.setStatus("");
        System.out.println(name + " закончилось");
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

