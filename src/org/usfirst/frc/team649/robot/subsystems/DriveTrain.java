package org.usfirst.frc.team649.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	TalonSRX talon1;
	TalonSRX talon2;
	TalonSRX talon3;
	TalonSRX talon4;
	
	public DriveTrain() {
		talon1 = new TalonSRX(12);
		talon2 = new TalonSRX(13);
		talon3 = new TalonSRX(19);
		talon4 = new TalonSRX(20);
	}
	
	public void arcadeDrive(double power, double rotation) {
		talon1.set(ControlMode.PercentOutput, power+rotation);
	    talon2.set(ControlMode.Follower, 12);
	    talon3.set(ControlMode.PercentOutput, power-rotation);
	    talon4.set(ControlMode.Follower, 19);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
