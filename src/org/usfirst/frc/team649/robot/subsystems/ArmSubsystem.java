package org.usfirst.frc.team649.robot.subsystems;

import org.usfirst.frc.team649.robot.Robot;
import org.usfirst.frc.team649.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {
	
	TalonSRX armMotor;
	public static int PRESET_THRESHOLD = 10;
	
	public ArmSubsystem() {
		armMotor = new TalonSRX(RobotMap.ARM_MOTOR);
		armMotor.configMotionCruiseVelocity(700, Robot.timeoutMs);
		armMotor.config_kP(0, 1.5, Robot.timeoutMs);
		armMotor.config_kI(0, 0.03, Robot.timeoutMs);
		armMotor.config_kD(0, 1.25, Robot.timeoutMs);
		armMotor.config_kF(0, 0.060176, Robot.timeoutMs);
		armMotor.setNeutralMode(NeutralMode.Brake);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void setSpeed(double dub) { 
		armMotor.set(ControlMode.PercentOutput, dub);
	}
	public void moveToPosition(int position) {
		armMotor.set(ControlMode.MotionMagic, position);
	}
	public int getVelocity() {
		return armMotor.getSelectedSensorVelocity();
	}
	public int getPosition() {
		return armMotor.getSelectedSensorPosition();
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

