public class EnglishClass extends ClassRoom{

    String topic;

    public void goToPlace() {
        super.goToPlace();
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Today topic is: " + topic);
    }

    public void readBook(String book){
        System.out.println("Read " + book);
    }
}
