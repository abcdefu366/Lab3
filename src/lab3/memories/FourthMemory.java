package lab3.memories;

import classes.Place;
import lab3.people.Student;

public class FourthMemory implements AbleToBegin{

    private String name;
    Student student = new Student("Студент", "ready");
    public void memoryBegins(Object otherStudent, Object studentProgress) {
        String progress = "Первое, второе, третье воспоминания восстановлены";
        if (student.equals(otherStudent) && progress.equals(studentProgress)) {
            System.out.println(name + " начинается");
        }
        else {
            System.out.println(name + " ещё невозможно");
        }
    }
    public void memoryFour() {
        class TruthAndBeauty {
            private String name;
            private String status;
            TruthAndBeauty(String name, String status) {
                this.name = name;
                this.status = status;
            }
            public void continueUninterruptedForSomeTime(String time) {
                System.out.println(status + " " + name + " продолжались непрерывно до " + time);
            }
            public void beTheMainThingIn(String time, String something) {
                System.out.println(name + " " + time + " составляли главное в " + something);
            }
        }
        TruthAndBeauty truthAndBeauty = new TruthAndBeauty("Правда и красота", "Направлявшие человеческую жизнь в " + Place.GARDEN + " и " + Place.COURTOFTHEHIGHPRIEST);
        student.thinkAbout(truthAndBeauty.name);
        truthAndBeauty.continueUninterruptedForSomeTime("сего дня");
        truthAndBeauty.beTheMainThingIn("всегда", "человеческой жизни и вообще на земле...");
        student.setStatus("");
        System.out.println(name + " закончилось");
        System.out.println();
    }
    public FourthMemory(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
