package org.usfirst.frc.team649.robot.subsystems;

import org.usfirst.frc.team649.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	TalonSRX leftDriveA;
	TalonSRX leftDriveB;
	TalonSRX rightDriveA;
	TalonSRX rightDriveB;
	
	public DriveTrainSubsystem() {
		leftDriveA = new TalonSRX(RobotMap.LEFT_DRIVE_A);
		leftDriveB = new TalonSRX(RobotMap.LEFT_DRIVE_B);
		rightDriveA = new TalonSRX(RobotMap.RIGHT_DRIVE_A);
		rightDriveB = new TalonSRX(RobotMap.RIGHT_DRIVE_B);
	}
	
	public void arcadeDrive(double power, double rotation) {
		leftDriveA.set(ControlMode.PercentOutput, power+rotation);
	    leftDriveB.set(ControlMode.Follower, RobotMap.LEFT_DRIVE_A);
	    rightDriveA.set(ControlMode.PercentOutput, power-rotation);
	    rightDriveB.set(ControlMode.Follower, RobotMap.RIGHT_DRIVE_A);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
