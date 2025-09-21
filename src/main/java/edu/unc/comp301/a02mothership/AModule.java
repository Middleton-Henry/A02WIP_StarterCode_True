package edu.unc.comp301.a02mothership;

public abstract class AModule implements IModule {
  private String name;

  AModule(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void statusReport(String moduleStatus, boolean isSuccessful) {
    System.out.println(name + " " + moduleStatus);
    if (isSuccessful) {
      System.out.println("Action Successful.");
    } else {
      System.out.println(name + " needs immediate attention!");
    }
  }
}
