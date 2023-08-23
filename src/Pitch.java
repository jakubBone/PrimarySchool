public class Pitch extends Field{

    String ball;

    @Override
    public void goToPlace() {
        super.goToPlace();
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Take " + ball + " and play " + kindOfGame);
    }
}
