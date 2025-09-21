

package edu.unc.comp301.a02mothership;

public class ThrusterModule extends AModule {

    private int fuel;
    private boolean lastFired;

    public ThrusterModule(String name) {
        super(name);
        fuel = 100;
        lastFired = false;
    }

    public ThrusterModule() {
        super("Thruster Module");
        fuel = 100;
        lastFired = false;
    }

    public ThrusterModule(String name, int fuel, boolean lastFired) {
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

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        statusReport();
        super.statusReport(moduleStatus, isSuccessful);
    }

    public void statusReport(){
        String lastFiredString = "No";
        if(lastFired){
            lastFiredString = "Yes";
        }
        //Ex: Thruster Module: 100 units of fuel remaining. Last fired: No
        System.out.println("Thruster Module: " + fuel + " units of fuel remaining. Last fired: " + lastFiredString);

    }

    public boolean thrust(int availablePower){
        if(fuel >= 5 && availablePower >= 5){
            fuel -= 5;
            lastFired = true;
            //Ex: Thruster Module: 95 units of fuel remaining.
            System.out.println("Thruster Module: " + fuel + " units of fuel remaining.");
            return true;
        }

        lastFired = false;
        System.out.println("Thruster Module: Not enough power or fuel to fire.");
        return false;
    }
}
