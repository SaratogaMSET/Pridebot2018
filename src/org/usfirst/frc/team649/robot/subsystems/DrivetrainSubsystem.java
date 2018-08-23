package org.usfirst.frc.team649.robot.subsystems;

import org.usfirst.frc.team649.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DrivetrainSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	TalonSRX leftDriveA;
	TalonSRX leftDriveB;
	TalonSRX rightDriveA;
	TalonSRX rightDriveB;
	
	public DrivetrainSubsystem() {
		leftDriveA = new TalonSRX(RobotMap.LEFT_DRIVE_A);
		leftDriveA.setInverted(true);
		leftDriveB = new TalonSRX(RobotMap.LEFT_DRIVE_B);
		leftDriveB.setInverted(true);
		rightDriveA = new TalonSRX(RobotMap.RIGHT_DRIVE_A);
		rightDriveB = new TalonSRX(RobotMap.RIGHT_DRIVE_B);
	}
	public void rawDrive(double left, double right) {
		leftDriveA.set(ControlMode.PercentOutput, left);
	    leftDriveB.set(ControlMode.Follower, RobotMap.LEFT_DRIVE_A);
//	    rightDriveA.set(ControlMode.PercentOutput, right);
//	    rightDriveB.set(ControlMode.PercentOutput, right);
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
