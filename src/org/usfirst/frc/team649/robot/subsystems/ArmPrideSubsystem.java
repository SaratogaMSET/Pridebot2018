package org.usfirst.frc.team649.robot.subsystems;

import org.usfirst.frc.team649.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmPrideSubsystem extends Subsystem {
	
	TalonSRX armMotor;
	
	public ArmPrideSubsystem() {
		armMotor = new TalonSRX(RobotMap.ARM_MOTOR);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void setSpeed(double dub) { 
		armMotor.set(ControlMode.PercentOutput, dub);
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

