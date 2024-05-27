import java.util.ArrayList;

public class Gym {
    private static Gym gym;
    private final Instructor instructor;
    private TrainingRegime trainingRegime = new BaselineTrainingRegime();


    private Gym(Instructor instructor) {
        this.instructor = instructor;
    }

    public void addClient(Client client){
        client.assignRegime(this.trainingRegime);
        this.instructor.clients.add(client);
    }

    public TrainingRegime getTrainingRegime() {
        return trainingRegime;
    }
    public static Gym getInstance(Instructor instructor){
        if (gym == null){
            gym = new Gym(instructor);
        }
        return gym;
    }
}
