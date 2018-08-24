package org.usfirst.frc.team649.robot.subsystems;

import org.usfirst.frc.team649.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSubsystem extends Subsystem {
	
	public Relay shooter;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ShooterSubsystem() {
		shooter = new Relay(RobotMap.SHOOTER_CHANNEL);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shoot(boolean direction) {
    	if (direction) {
    		shooter.set(Relay.Value.kForward);
    	}
    	else {
    		shooter.set(Relay.Value.kOff);
    	}
    }
}

