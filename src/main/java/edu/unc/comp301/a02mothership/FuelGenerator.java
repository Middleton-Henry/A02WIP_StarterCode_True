package edu.unc.comp301.a02mothership;

public class FuelGenerator extends AModule implements IPowerGenerator {
    private int fuel;

    public FuelGenerator(String name){
        super(name);
        fuel = 0;
    }

    public FuelGenerator(){
        super("Fuel Generator");
        fuel = 0;
    }

    public FuelGenerator(String name, int fuel){
        super(name);
        this.fuel = fuel;
    }

    public FuelGenerator(int fuel){
        super("Fuel Generator");
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
        System.out.println("Fuel Generator: " + fuel + " units of fuel remaining.");
        super.statusReport(moduleStatus, isSuccessful);
    }

    public void statusReport(){
        System.out.println("Fuel Generator: " + fuel + " units of fuel remaining.");
    }
}
