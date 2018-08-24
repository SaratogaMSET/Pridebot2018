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
	
    public ShooterCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter_subsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shooter_subsystem.shoot(true);
    	shootingTimer = new Timer();
    	shootingTimer.reset();
    	shootingTimer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	timeElapsed = shootingTimer.get();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (timeElapsed >= 0.5) {
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
