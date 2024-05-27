// note: using todo comments to color the IDE

//TODO //////////// Base foundation ////////////
interface TrainingRegime {
    String getDescription();
}

//TODO //////////// Baseline implementation ////////////////////////
class BaselineTrainingRegime implements TrainingRegime {
    @Override
    public String getDescription() {
        return "Baseline training regime";
    }
}

//TODO//////////// Handler for the different training regimes ////////////
abstract class DecoratorHandler implements TrainingRegime {
    public TrainingRegime trainingRegime;

    public DecoratorHandler(TrainingRegime trainingRegime) {
        this.trainingRegime = trainingRegime;
    }


    @Override
    public String getDescription() {
        return trainingRegime.getDescription();
    }
}

//TODO///////////// Implementations for the different trainings ///////////////
class HeavyTrainingRegime extends DecoratorHandler {

    public HeavyTrainingRegime(TrainingRegime trainingRegime) {
        super(trainingRegime);
    }

    @Override
    public String getDescription() {
        return trainingRegime.getDescription() + " + Heavy training regime";
    }
}

class BulkTrainingRegime extends DecoratorHandler {

    public BulkTrainingRegime(TrainingRegime trainingRegime) {
        super(trainingRegime);
    }

    @Override
    public String getDescription() {
        return trainingRegime.getDescription() + " + Bulk training regime";
    }
}

class CardioTrainingRegime extends DecoratorHandler {

    public CardioTrainingRegime(TrainingRegime trainingRegime) {
        super(trainingRegime);
    }

    @Override
    public String getDescription() {
        return trainingRegime.getDescription() + " + Cardio training regime";
    }
}



