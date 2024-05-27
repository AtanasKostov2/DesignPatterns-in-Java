public class Client implements ClientListener {
    private TrainingRegime trainingRegime;
    public String name;
    private Strategy strategy;

    public Client(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void assignRegime(TrainingRegime trainingRegime) {
        this.trainingRegime = trainingRegime;
    }
    @Override
    public void alert(TrainingRegime NewTrainingRegime){
        if (strategy.acceptRegime(NewTrainingRegime)){
            this.trainingRegime = NewTrainingRegime;
            System.out.print(this.name+" was notified for the new training regime and ACCEPTED the new regime ==> ");
            System.out.println(this.trainingRegime.getDescription());
        }
        else{
            System.out.print(this.name+" was notified for the new training regime and DECLINED the new regime ==> ");
            System.out.println(NewTrainingRegime.getDescription());
        }
    }

    public void getRegime(){
        System.out.println("Regime for "+this.name+": "+this.trainingRegime.getDescription());
    }
}
