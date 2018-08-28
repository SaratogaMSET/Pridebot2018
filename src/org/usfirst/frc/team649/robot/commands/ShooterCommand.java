package org.usfirst.frc.team649.robot.commands;

import org.usfirst.frc.team649.robot.Robot;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterCommand extends Command {

	private Timer shootingTimer;
	private double timeElapsed = 0;
	private double shortShotTime = 0.2;
	private double longShotTime = 0.5;
	private double shotTime;
	private boolean isLongShot;
	
    public ShooterCommand(boolean longShot) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter_subsystem);
    	this.isLongShot = longShot;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shooter_subsystem.shoot(true);
    	shootingTimer = new Timer();
    	shootingTimer.reset();
    	shootingTimer.start();
    	if (isLongShot) {
    		shotTime = longShotTime;
    	} else {
    		shotTime = shortShotTime;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	timeElapsed = shootingTimer.get();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (timeElapsed >= shotTime) {
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter_subsystem.shoot(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
