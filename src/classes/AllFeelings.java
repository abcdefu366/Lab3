package classes;

import lab3.people.Student;

public class AllFeelings {
    public void happen() {

        String degree = "мало-помалу";
        Student student = new Student("Студент");
        AbleToTakePossession feelingOfYouth = new AbleToTakePossession() {
            @Override
            public void takePossessionOfStudent(String status, String object, String subject, String inWhatDegree) {
                System.out.println(status + object + " оваладевало " + subject + " " + inWhatDegree);
            }
        };
        AbleToTakePossession feelingOfHealth = new AbleToTakePossession() {
            @Override
            public void takePossessionOfStudent(String status, String object, String subject, String inWhatDegree) {
                System.out.println(status + object + " оваладевало " + subject + " " + inWhatDegree);
            }
        };
        AbleToTakePossession feelingOfPower = new AbleToTakePossession() {
            @Override
            public void takePossessionOfStudent(String status, String object, String subject, String inWhatDegree) {
                System.out.println(status + object + " оваладевало " + subject + " " + inWhatDegree);
            }
        };
        AbleToTakePossession feelingOfAnticipation = new AbleToTakePossession() {
            @Override
            public void takePossessionOfStudent(String status, String object, String subject, String inWhatDegree) {
                System.out.println(object + " оваладевало " + subject + " " + inWhatDegree);
            }
        };
        AbleToTakePossession feelingOfHappiness = new AbleToTakePossession() {
            @Override
            public void takePossessionOfStudent(String status, String object, String subject, String inWhatDegree) {
                System.out.println(object + " оваладевало " + subject + " " + inWhatDegree);
            }
        };
        feelingOfYouth.takePossessionOfStudent("","Чувство молодости", student.getName(), degree);
        feelingOfHealth.takePossessionOfStudent("","Чувство здоровья", student.getName(), degree);
        feelingOfPower.takePossessionOfStudent("","Чувство силы", student.getName(), degree);
        feelingOfAnticipation.takePossessionOfStudent("Невыразимое сладкое ", "Чувство ожидания", student.getName(), degree);
        feelingOfHappiness.takePossessionOfStudent("Неведомое, таинственное ", "Чувство счастья", student.getName(), degree);
    }
}
