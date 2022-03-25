package sampleTestNG;

import org.testng.annotations.Test;

public class sample {
 
	@Test (priority =100)
  public void facebook()
  {
	  System.out.println("Welcome to facebook");
  }
  
  @Test (priority=-80)
  public void google()
  {
	  System.out.println("welcome to google");
  }
  @Test
  public void twitter()
  {System.out.println("welcome to twitter");
  }
  }
