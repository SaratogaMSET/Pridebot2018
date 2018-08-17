package org.usfirst.frc.team649.robot.commands;

import org.usfirst.frc.team649.robot.Robot;
import org.usfirst.frc.team649.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ArmPresetCommand extends Command {
	private int targetPos;
	private int currPos;
    public ArmPresetCommand(int position) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm_subsystem);
    	targetPos = position;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm_subsystem.moveToPosition(targetPos);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currPos = Robot.arm_subsystem.getPosition();
    	SmartDashboard.putString("Arm", "Position: " + Robot.arm_subsystem.getPosition() + ", Velocity: " + Robot.arm_subsystem.getVelocity());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(currPos>=targetPos-ArmSubsystem.PRESET_THRESHOLD || currPos<=targetPos+ArmSubsystem.PRESET_THRESHOLD) {
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	SmartDashboard.putString("Arm", "Finished moveToPosition");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
