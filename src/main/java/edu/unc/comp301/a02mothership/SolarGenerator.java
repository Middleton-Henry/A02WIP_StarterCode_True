package edu.unc.comp301.a02mothership;

public class SolarGenerator extends AModule implements IPowerGenerator {

    SolarGenerator(String name) {
        super(name);
    }

    @Override
    public int GeneratePower() {
        return 10;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println("Solar Generators will never die");
        super.statusReport(moduleStatus, isSuccessful);
    }
}
