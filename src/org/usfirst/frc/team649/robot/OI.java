/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

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
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

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
