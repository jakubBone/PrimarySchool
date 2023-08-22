public class Student extends Person{

    String firstLessonAt;
    String lastLessonAt;
    int examResult;
    int classNumber;
    @Override
    public void goToSchool() {
        super.goToSchool();
        System.out.println(printStudentName() + " starts lesson at " + firstLessonAt );
        System.out.println("Oh no... Don't want to go school today!");
    }
    @Override
    public void leaveSchool() {
        super.leaveSchool();
        System.out.println(printStudentName() + " last lesson at " + lastLessonAt);
        System.out.println("Yeah! The end!");
    }

    public String printStudentName(){
        return firstName + " " + lastName;
    }

    public void learn(){
        System.out.println("Student is learning");
    }
    public void passTheExam() {
        if (classNumber == 6) {
            System.out.println("Is time to exam!");
                if (classNumber>= 2){
                System.out.println("Congratulation! You pass!");
                switch(examResult){
                    case 2:
                        System.out.println("But the result is terrible...");
                        break;
                    case 3:
                        System.out.println("The result is medium. You could be better");
                        break;
                    case 4:
                        System.out.println("Pretty good. Stay on this road. ");
                        break;
                    case 5:
                        System.out.println("Excellent! You are the best :) ");
                        break;
                    case 6:
                        System.out.println("Brilliant, It could't be better!");
                        break;
                    }
                }
                else
                    System.out.println("Not good... you have to repeat :(");
        }
    }

}
