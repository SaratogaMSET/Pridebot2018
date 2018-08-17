
package org.usfirst.frc.team649.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	XboxController controller1 = new XboxController(0);
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public boolean buttonA() {
		return controller1.getAButton();
	}
	
	public boolean buttonB() {
		return controller1.getBButton();
	}
	
	public boolean buttonX() {
		return controller1.getXButton();
	}
	
	public boolean buttonY() {
		return controller1.getYButton();
	}
	
	public double leftX() {
		return controller1.getX(GenericHID.Hand.kLeft);
	}
	
	public double leftY() {
		return controller1.getY(GenericHID.Hand.kLeft);
	}
	
	public double rightX() {
		return controller1.getX(GenericHID.Hand.kRight);
	}
	
	public double rightY() {
		return controller1.getY(GenericHID.Hand.kRight);
	}
}
