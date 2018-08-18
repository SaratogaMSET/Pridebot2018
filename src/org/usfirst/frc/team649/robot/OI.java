
package org.usfirst.frc.team649.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
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
	
	Joystick controller1 = new Joystick(0);
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public boolean getButtonA() {
		return controller1.getRawButton(1);
	}
	
	public boolean getButtonB() {
		return controller1.getRawButton(2);
	}
	
	public boolean getButtonX() {
		return controller1.getRawButton(3);
	}
	
	public boolean getButtonY() {
		return controller1.getRawButton(4);
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

	
	public double getLeftTrigger() {
		return controller1.getRawAxis(2);
	}
	public double getRightTrigger() {
		return controller1.getRawAxis(3);
	}

}
