import classes.*;
import lab3.enviromentState.*;
import lab3.memories.*;
import lab3.people.*;


public class Program {
    public static void main(String[] args) {
        Worker worker = new Worker("Работник", Place.RIVER);
        Student student = new Student("Студент", Place.WIDOWS, "", 22, 0);
        Wind wind = new Wind("Жестокий ветер", false);
        Darkness darkness = new Darkness("Потёмки", false);
        Season winter = new Season("Зима", false);
        Easter easter = new Easter("Пасха", false);

        Vasilisa vasilisa = new Vasilisa("Василиса", "");
        FirstMemory firstMemory = new FirstMemory("Первое воспоминание");
        Fire fire = new Fire("Одинокий огонь", "", false);
        SecondMemory secondMemory = new SecondMemory("Второе воспоминание");
        ThirdMemory thirdMemory = new ThirdMemory("Третье воспоминание");
        Dawn dawn = new Dawn("заря", false,"Холодная багровая ");
        FourthMemory fourthMemory = new FourthMemory("Четвёртое воспоминание");
        AllFeelings allFeelings = new AllFeelings();

        worker.returnFromRiver();
        worker.rideOnHorse();
        worker.lightTrembledOn();

        student.sayGoodNight();
        student.wentFurther();

        darkness.hadCome();
        student.getCold();
        wind.blow();
        winter.comeBack();
        winter.notPresage(easter);

        student.readyForFirstMemory(wind.getIsOccured(), winter.getIsOccured(), darkness.getIsOccured());
        vasilisa.readyToBeRemembered();
        firstMemory.memoryBegins(student, vasilisa);
        firstMemory.memoryOne();

        student.lockedBack();
        fire.quietlyBlinkedInTheDark();
        fire.becameUnsociable();

        student.readyForSecondMemory(fire.getIsOccured(), fire.getStatus());
        vasilisa.readyToBeRemembered();
        secondMemory.memoryBegins(student, vasilisa);
        secondMemory.memoryTwoPartOne();
        secondMemory.memoryTwoPartTwo();

        student.suddenlyFellHappy();
        student.stopForAWhile("минута", "перевести дух");

        student.readyForThirdMemory(student.getStatus());
        thirdMemory.memoryBegins(student, student.getConviction());
        thirdMemory.memoryThree();

        student.crossOverBy(Place.FERRY, Place.RIVER);
        student.climb(Place.MOUNTAIN);
        student.lookAt(Place.VILLAGE);
        dawn.shineLikeStripOnWest();

        student.readyForFourthMemory(dawn.getIsOccured(), student.getPlace() == Place.MOUNTAIN);
        fourthMemory.memoryBegins(student, student.getProgress());
        fourthMemory.memoryFour();

        allFeelings.happen();
        student.beSomeYearsOld();
        student.feelAtTheEnd();
    }
}























