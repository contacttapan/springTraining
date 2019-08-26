package com.training.spring;

public class TTCoach implements Coach{

    private FortuneService fortuneService;

    public TTCoach() {

    }

    public TTCoach(FortuneService fortuneService) {
      this.fortuneService = fortuneService;
    }


    public String getDailyWorkout() {
      return "Play TT hard->HARD";
    }

    public String getDailyFortune() {
      return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
      System.out.println("TTCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuffYoYo() {
      System.out.println("TTCoach: inside method doMyCleanupStuffYoYo");
    }
  }






