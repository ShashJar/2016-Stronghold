 // RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4909.Bionics2016.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.io.FileWriter;
import java.io.IOException;

import org.usfirst.frc4909.Bionics2016.Robot;

/**
 *
 */
public class Drive extends Command {
//	FileWriter fw;
//	double pulseTime;
//	boolean lastState=false;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public Drive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	/*
    	try {
			fw = new FileWriter("/home/lvuser/AccelXYZAndGyro.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
    	//pulseTime=Timer.getFPGATimestamp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Robot.drivetrain.setUltrasonics(lastState);
    	/*
    	String out = Timer.getFPGATimestamp()+","+Double.toString(Robot.drivetrain.getAccelX())+","+Double.toString(Robot.drivetrain.getAccelY())+","+Double.toString(Robot.drivetrain.getAccelZ())+ "," + Double.toString(Robot.drivetrain.getGyroAngle());
    	try {
			fw.write(out);
			fw.write("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    `*/ 
    	//SmartDashboard.putNumber("Left Distance", Robot.drivetrain.getLeftDistanceFromTarget());
    	//SmartDashboard.putNumber("Right Distance", Robot.drivetrain.getRightDistanceFromTarget());
    	//SmartDashboard.putNumber("Loop Time", Timer.getFPGATimestamp()-pulseTime);
    	/*if(lastState)
    		Robot.drivetrain.pulseUltrasonics(2);
    	/*if(Timer.getFPGATimestamp()-pulseTime>=.250){
    		Robot.drivetrain.pulseUltrasonics();
    		pulseTime=Timer.getFPGATimestamp();
    		
    }*/
    	//pulseTime=Timer.getFPGATimestamp();
    	
    	double scaleFactor = 1;//((1 - Robot.oi.getDriveSlide()) * .25) + 0.5;
    	double spinFactor = 0.75;
    	
    	//Tank Drive
    	Robot.drivetrain.moveRobot(
    			Robot.oi.getLeft() * scaleFactor, 
    			Robot.oi.getRight() * spinFactor
    	);
    	
    	//Arcade Drive
    	//Robot.drivetrain.moveRobot(Robot.oi.getLeft()*(((-Robot.oi.getDriveSlide()+1)/4)+.5), Robot.oi.getLeftX()*(((-Robot.oi.getDriveSlide()+1)/4)+.5));
    	//lastState=!lastState;

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	/*
    	try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	/*
    	try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

    }
}
