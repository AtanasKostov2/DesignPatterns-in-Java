//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Joro", new WeightLossStrategy());
        Client client2 = new Client("Gosho", new BulkStrategy());

        Instructor instructor = new Instructor();
        Gym gym = Gym.getInstance(instructor);
        gym.addClient(client1);
        gym.addClient(client2);

        instructor.notifyClients(new CardioTrainingRegime(gym.getTrainingRegime()));
        instructor.notifyClients(new HeavyTrainingRegime(new BaselineTrainingRegime()));

        instructor.notifyClients(new HeavyTrainingRegime(new CardioTrainingRegime(gym.getTrainingRegime())));


    }
}