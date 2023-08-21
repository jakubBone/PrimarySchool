public class Student extends Person{

    String firstLessonAt;
    String lastLessonAt;
    boolean ifGoodStudent;
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
    public void passTheExam(){
        if(ifGoodStudent)
            System.out.println("Congratulation! You pass!");
        else
            System.out.println("Not good... you have to repeat :(");
    }

}
