
<<<<<<< HEAD
package org.usfirst.frc.team649.robot;
import edu.wpi.first.wpilibj.Joystick;
=======
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team649.robot;

import edu.wpi.first.wpilibj.Joystick;

>>>>>>> 12dbf7de0d209a13c0f855698245cddf181059d4
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Joystick stick1 = new Joystick(0);
<<<<<<< HEAD
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
=======

>>>>>>> 12dbf7de0d209a13c0f855698245cddf181059d4
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
<<<<<<< HEAD
	
	public double POV(int x) {
		return stick1.getPOV(x);
	}
	
}
=======

	public double POV(int y) {
		return stick1.getPOV(y);
	}
			
}
>>>>>>> 12dbf7de0d209a13c0f855698245cddf181059d4
