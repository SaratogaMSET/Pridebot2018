
package org.usfirst.frc.team649.robot;
import edu.wpi.first.wpilibj.Joystick;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Joystick stick1 = new Joystick(0);
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public boolean button1() {
		return stick1.getRawButton(1);
	}
	
	public boolean button2() {
		return stick1.getRawButton(2);
	}
	
	public boolean button3() {
		return stick1.getRawButton(3);
	}
	
	public boolean button4() {
		return stick1.getRawButton(4);
	}
	
	public double axis0() {
		return stick1.getRawAxis(0);
	}
	
	public double axis1() {
		return stick1.getRawAxis(1);
	}
	
	public double axis4() {
		return stick1.getRawAxis(4);
	}
	
	public double axis5() {
		return stick1.getRawAxis(5);
	}
	
	public double POV(int x) {
		return stick1.getPOV(x);
	}
	
}