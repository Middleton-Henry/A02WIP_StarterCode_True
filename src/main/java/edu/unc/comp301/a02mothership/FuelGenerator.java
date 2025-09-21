package edu.unc.comp301.a02mothership;

public class FuelGenerator extends AModule implements IPowerGenerator {
    private int fuel;

    FuelGenerator(String name){
        super(name);
        fuel = 0;
    }

    FuelGenerator(String name, int fuel){
        super(name);
        this.fuel = fuel;
    }

    public int GeneratePower() {
        if(fuel >= 10){
            fuel -= 10;
            return 10;
        }

        int remainingFuel = fuel;
        fuel = 0;

        return remainingFuel;
    }

    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println("FuelGenerator: " + fuel + " units of fuel remaining.");
        super.statusReport(moduleStatus, isSuccessful);
    }
}
