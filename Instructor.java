import java.util.ArrayList;

public class Instructor { //observer
    public ArrayList<Client> clients = new ArrayList<>();

    public void notifyClients(TrainingRegime NewTrainingRegime){
        for(Client client : clients){
            client.alert(NewTrainingRegime);
        }
    }

}
