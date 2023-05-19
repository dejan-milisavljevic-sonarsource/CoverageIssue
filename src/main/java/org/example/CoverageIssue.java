package org.example;

public class CoverageIssue {
  private static final String ALL = "ALL";
  private final String configuration;

  public CoverageIssue(String configuration) {
    this.configuration = configuration;
  }

  public void mainCheck() {
    if (ALL.equals(configuration)) {
      stopProcessing();
    }
  }

  private void stopProcessing() {
    System.out.println(configuration);
    throw new IllegalArgumentException("Service is currently unavailable");
  }

}
