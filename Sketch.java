import processing.core.PApplet;

public class Sketch extends PApplet {
  

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  // First Quadrant - 10x10 grid that scales to the size of the window
    
    stroke(0);
    // Draw horizontal lines
    for (int lineX = 20; lineX <= 180; lineX += 20) {
      int lenlineX = 200;
      line(0, lineX, lenlineX, lineX);    // line (start x, start Y, end X, end Y)   
    }

    stroke(0);
    // Draw the vertical lines
    for (int lineY = 20; lineY <= 180; lineY +=20) {
      int lenlineY = 200;
      line(lineY, 0, lineY, lenlineY);
    }

    // Second Quadrant - 5 x grid of evenly spaced circles that scales to the size of window

    for (int circleY = 20; circleY <= 200; circleY += 40) {
      for (int circleX = 220; circleX <= 400; circleX += 40) {
        fill(212, 15, 159);
        ellipse(circleX, circleY, 25, 25);
      }
    }

    // Third Quadrant - Horizonatal grayscale gradient
  
    int fillColour = 33;
    int left = 0;
    int top = 200;
    int right = 20;
    int bottom = 400;

    for (int i = 0; i <= 10; i++) {
      stroke(fillColour);
      fill(fillColour, fillColour, fillColour);
      rect( left, top, right, bottom);              
      fillColour = fillColour + 20;
      left = left + 20;
      right = right + 20;      
    }
  
    // Fourth Quadrant - 8 petal flower that uses a loop to draw the petals evenly spaced around the center of the flower
    
    // Petals
    for (int angle = 0; angle < 360; angle += 45) {
      fill(196, 82, 33);
      stroke(0);
      strokeWeight((float)0.004*height);

      pushMatrix();
      translate((width/2) +  width/4, (height/2) + height/4);
      rotate(radians(angle));
      ellipse(0, 0, height/20, height/3);
      popMatrix();
    }

    // Middle part
    fill(21, 105, 38);
    stroke(0);
    ellipse((width/2) + width/4, (height/2) + height/4, 35, 35);
  }
}


  
