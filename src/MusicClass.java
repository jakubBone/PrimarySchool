public class MusicClass extends ClassRoom {

    String instrument;

    public void goToPlace() {
        super.goToPlace();
        System.out.println("Don't forget taking your:" + instrument);
    }

    @Override
    public void learn() {
        super.learn();
    }

    public void play(){
        System.out.println("Play the " + instrument);
    }

}
