package edu.unc.comp301.a02mothership;

public class Main {
    public static void main(String[] args) {
        IPowerGenerator powerGenerator = new SolarGenerator("Solar Generator 1");
        ThrusterModule thrusterModule = new ThrusterModule("Thruster 1");

        double[] parameters = {12.3,123.45,214.5,1321.4,123.4};
        ExperimentModule experimentModule = new ExperimentModule("Experiment 1", parameters);

        powerGenerator = new FuelGenerator("Fuel Generator 1", 25);


        Mothership mothership = new Mothership(powerGenerator, thrusterModule, experimentModule);

        int power = mothership.requestPower();
        System.out.println("Power: " + power);

        boolean isThrusted = mothership.fireThruster(power);
        if(isThrusted){
            System.out.println("Thrust Successful");
        }
        else{
            System.out.println("Thrust Failed");
        }

        mothership.runExperiment();
        System.out.println("Experiment Summary: " + mothership.getExperimentModule().getSummary());

        mothership.printStatusReports();
    }
}
