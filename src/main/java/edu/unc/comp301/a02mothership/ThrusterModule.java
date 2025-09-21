

package edu.unc.comp301.a02mothership;

public class ThrusterModule extends AModule {

    private int fuel = 100;
    private boolean lastFired = false;

    ThrusterModule(String name) {
        super(name);
    }

    ThrusterModule(String name, int fuel, boolean lastFired) {
        super(name);
        this.fuel = fuel;
        this.lastFired = lastFired;
    }

    public int getFuel(){
        return fuel;
    }

    public boolean lastFired(){
        return lastFired;
    }

    public void statusReport(){
        String lastFiredString = "No";
        if(lastFired){
            lastFiredString = "Yes";
        }

        System.out.println("ThrusterModule: " + fuel + " units of fuel remaining. Last fired: " + lastFiredString);

        //Ex: ThrusterModule: 80 units of fuel remaining. Last fired: Yes
    }

    public boolean thrust(int availablePower){
        if(fuel >= 5 && availablePower >= 5){
            fuel -=5;
            lastFired = true;
            System.out.println("ALERT Captain: 5 fuel used for propulsion maneuver.");
            return true;
        }

        lastFired = false;
        System.out.println("ThrusterModule: Not enough power or fuel to fire.");
        return false;
    }
}
