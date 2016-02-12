// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4909.Bionics2016.subsystems;

import org.usfirst.frc4909.Bionics2016.RobotMap;
import org.usfirst.frc4909.Bionics2016.commands.*;


import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController shooterLeftWheel = RobotMap.shootershooterLeftWheel;
    private final SpeedController shooterRightWheel = RobotMap.shootershooterRightWheel;
    private final Encoder leftShootEncoder = RobotMap.shooterleftShootEncoder;
    private final Encoder rightShootEncoder = RobotMap.shooterrightShootEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final int ENCODER_RES=1024*4;
    private final int MAX_RPM=2500;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public double getLeftRPM()
    {
    	//return 60*leftShootEncoder.getRate();
    	return Math.abs(60/(ENCODER_RES*leftShootEncoder.getPeriod()));
    	//return leftShootEncoder.getRaw();
    }
    
    public double getRightRPM()
    {
    	return Math.abs(60/(ENCODER_RES*rightShootEncoder.getPeriod()));
    	//return 60*rightShootEncoder.getRate();
    	//return rightShootEncoder.getRaw();
    }
    
    public void setShooterWheels(double setpoint)
    {
    	shooterLeftWheel.set(setpoint);
    	shooterRightWheel.set(setpoint);
    }
    
    public void setShooterWheelsSameRPM(){
    	
    	while(Math.abs(getLeftRPM())>Math.abs(getRightRPM()))
    	{
    		if(shooterLeftWheel.get()>0)
    		{
    			shooterLeftWheel.set(shooterLeftWheel.get()-0.001);
    		}
    		
    		else
    		{
    			shooterLeftWheel.set(shooterLeftWheel.get()+0.001);
    		}
    	}
 
    	while(Math.abs(getLeftRPM())<Math.abs(getRightRPM()))
    	{
    		if(shooterRightWheel.get()>0)
    		{
    			shooterRightWheel.set(shooterRightWheel.get()-0.001);
    		}
    		
    		else
    		{
    			shooterRightWheel.set(shooterRightWheel.get()+0.001);
    		}    	    	
    	}
    
    	
    }
    public void setShooterRPM(double targetRPM){
    	//if (getLeftRPM() > targetRPM) shooterLeftWheel.set(0);
    	//else shooterLeftWheel.set(1);
    	if (getRightRPM() > targetRPM) shooterRightWheel.set(0);
    	else shooterRightWheel.set(1);
    }
    public double getLeftRate() {
		// TODO Auto-generated method stub
		return leftShootEncoder.getRate();
	}
    public double getRightRate() {
		// TODO Auto-generated method stub
		return leftShootEncoder.getRate();
	}
    
	public void useLeftRate(double output) {
		// TODO Auto-generated method stub
		
		shooterLeftWheel.pidWrite(output);
	}
	
	public void useRightRate(double output) {
		// TODO Auto-generated method stub
		
		shooterRightWheel.pidWrite(output);
	}
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

