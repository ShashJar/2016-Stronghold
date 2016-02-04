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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


/**
 *
 */
public class Pivot extends PIDSubsystem {

    public Pivot(String name, double p, double i, double d) {
		super(name, p, i, d);
		setAbsoluteTolerance(10);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("Pivot", "PIDSubsystem Controller", getPIDController());
		// TODO Auto-generated constructor stub
	}
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController pivotControl = RobotMap.pivotpivotControl;
    private final Encoder pivotEncoder = RobotMap.pivotpivotEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    private final DigitalInput pivotTopSwitch = RobotMap.pivotTopSwitch;
    private final DigitalInput pivotBottomSwitch = RobotMap.pivotBottomSwitch;


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
  

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void setAngle(double angle)
    {
    	setSetpoint(angle);
    }
    public void pivotDown()
    {
    	pivotControl.set(-0.25);
    }
    public void pivotUp()
    {
    	pivotControl.set(0.25);
    }
    public boolean getTopSwitch()
    {
    	return pivotTopSwitch.get();
    }
    public boolean getBottomSwitch()
    {
    	return pivotBottomSwitch.get();
    }
    public void movePivot(double speed)
    {
    	if(speed > 0 && getBottomSwitch())
    		return;
    	if(speed < 0 && getTopSwitch())
    		return;
    	pivotControl.set(speed);
    }
	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return pivotEncoder.getDistance();
	}
	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		if(output > 0 && getBottomSwitch())
    		return;
    	if(output < 0 && getTopSwitch())
    		return;
		pivotControl.pidWrite(output);
	}
}

