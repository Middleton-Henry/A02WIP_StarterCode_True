package edu.unc.comp301.a02mothership;

public class ExperimentModule extends AModule{
    private String experimentName;
    private double[] parameters;
    private double result;
    private boolean hasRun;

    public ExperimentModule(String experimentName, double[] parameters){
        super("Experiment Module");
        this.experimentName = experimentName;
        this.parameters = parameters;
        result = 0;
        hasRun = false;
    }

    public ExperimentModule(String moduleName, String experimentName, double[] parameters){
        super(moduleName);
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

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        if(hasRun){
            System.out.println("ExperimentModule: " + experimentName + " completed.");
        }
        else{
            System.out.println("Experiment Module: " + experimentName + " pending.");
        }
        super.statusReport(moduleStatus, isSuccessful);
    }

}
