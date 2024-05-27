public interface Strategy {
    boolean acceptRegime(TrainingRegime trainingRegime);
}

class WeightLossStrategy implements Strategy {
    @Override
    public boolean acceptRegime(TrainingRegime trainingRegime) {
        return trainingRegime.getDescription().contains("Cardio");
    }
}

class BulkStrategy implements Strategy {
    @Override
    public boolean acceptRegime(TrainingRegime trainingRegime) {
        return trainingRegime.getDescription().contains("Heavy");
    }
}