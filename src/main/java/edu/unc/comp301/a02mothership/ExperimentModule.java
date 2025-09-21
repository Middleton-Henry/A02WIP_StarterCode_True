package edu.unc.comp301.a02mothership;

public class ExperimentModule {
    private String experimentName;
    private double[] parameters;
    private double result;
    private boolean hasRun;

    ExperimentModule(String experimentName, double[] parameters){
        this.experimentName = experimentName;
        this.parameters = parameters;
        result = 0;
        hasRun = false;
    }

    public void runExperiment(){
        for(int i = 0; i < parameters.length; i++) {
            result += parameters[i] * Math.random();
        }
        hasRun = true;
    }

    public String getSummary(){
        if(hasRun){
            return "Experiment '" + experimentName + "' result: " + result;
        }

        return "Experiment not run yet.";
    }

    public void statusReport(String moduleStatus, boolean isSuccessful){
        if(hasRun){
            System.out.println("ExperimentModule: " + experimentName + " completed.");
        }
        else{
            System.out.println("ExperimentModule: " + experimentName + " pending.");
        }
    }

}
