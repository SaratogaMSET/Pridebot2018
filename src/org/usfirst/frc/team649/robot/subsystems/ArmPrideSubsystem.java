package org.usfirst.frc.team649.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmPrideSubsystem extends Subsystem {

	
	TalonSRX armMotor;
	
	public ArmPride() {
		armMotor = new TalonSRX();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public double setSpeed(double dub) { 
		armMotor.set(dub);
	}
	
	public void goUp( double d) {
		setSpeed(d);
	}
	
	public void goDown (double d) {
		setSpeed(-d);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

