
package edu.unc.comp301.a02mothership;
import java.util.ArrayList;

public class Mothership {
    private IPowerGenerator powerGenerator;
    private ThrusterModule thrusterModule;
    private ExperimentModule experimentModule;

    private ArrayList<IModule> moduleArrayList = new ArrayList<IModule>();

    public Mothership(IPowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule){
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;
    }

    public int requestPower(){
        return powerGenerator.GeneratePower();
    }

    public boolean fireThruster(int availablePower){
        return thrusterModule.thrust(availablePower);
    }

    public void runExperiment(){
        experimentModule.runExperiment();
    }

    public ExperimentModule getExperimentModule() {
        return experimentModule;
    }

    public void printStatusReports(){
        for (int i = 0; i < moduleArrayList.size(); i++){
            moduleArrayList.get(i).statusReport("Normal", true);
        }

    }

}
