// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4909.Bionics2016;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainfrontLeft;
    public static SpeedController drivetrainbackLeft;
    public static SpeedController drivetrainfrontRight;
    public static SpeedController drivetrainbackRight;
    public static RobotDrive drivetraindriveControl;
    public static Encoder drivetrainleftDriveEncoder;
    public static Encoder drivetrainrightDriveEncoder;
    public static AnalogGyro drivetraingyro;
    public static SpeedController shootershooterLeftWheel;
    public static SpeedController shootershooterRightWheel;
    public static Encoder shooterleftShootEncoder;
    public static Encoder shooterrightShootEncoder;
    public static SpeedController feederfeedAxle;
    public static DigitalInput feederfeedSwitch;
    public static SpeedController pivotpivotControl;
    public static Encoder pivotpivotEncoder;
    public static SpeedController climberclimbMotor;
    public static Encoder climberclimbEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DigitalInput pivotTopSwitch;
    public static DigitalInput pivotBottomSwitch;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainfrontLeft = new VictorSP(0);
        LiveWindow.addActuator("Drivetrain", "frontLeft", (VictorSP) drivetrainfrontLeft);
        
        drivetrainbackLeft = new VictorSP(1);
        LiveWindow.addActuator("Drivetrain", "backLeft", (VictorSP) drivetrainbackLeft);
        
        drivetrainfrontRight = new VictorSP(2);
        LiveWindow.addActuator("Drivetrain", "frontRight", (VictorSP) drivetrainfrontRight);
        
        drivetrainbackRight = new VictorSP(3);
        LiveWindow.addActuator("Drivetrain", "backRight", (VictorSP) drivetrainbackRight);
        
        drivetraindriveControl = new RobotDrive(drivetrainfrontLeft, drivetrainbackLeft,
              drivetrainfrontRight, drivetrainbackRight);
        
        drivetraindriveControl.setSafetyEnabled(true);
        drivetraindriveControl.setExpiration(0.1);
        drivetraindriveControl.setSensitivity(0.5);
        drivetraindriveControl.setMaxOutput(1.0);

        drivetrainleftDriveEncoder = new Encoder(3, 4, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "leftDriveEncoder", drivetrainleftDriveEncoder);
        drivetrainleftDriveEncoder.setDistancePerPulse(1.0);
        drivetrainleftDriveEncoder.setPIDSourceType(PIDSourceType.kRate);
        drivetrainrightDriveEncoder = new Encoder(5, 6, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "rightDriveEncoder", drivetrainrightDriveEncoder);
        drivetrainrightDriveEncoder.setDistancePerPulse(1.0);
        drivetrainrightDriveEncoder.setPIDSourceType(PIDSourceType.kRate);
        drivetraingyro = new AnalogGyro(0);
        LiveWindow.addSensor("Drivetrain", "gyro", drivetraingyro);
        drivetraingyro.setSensitivity(0.007);
        shootershooterLeftWheel = new Spark(6);//should be 4
        LiveWindow.addActuator("Shooter", "shooterLeftWheel", (Spark) shootershooterLeftWheel);
        
        shootershooterRightWheel = new Spark(8);
        LiveWindow.addActuator("Shooter", "shooterRightWheel", (Spark) shootershooterRightWheel);
        
        shooterleftShootEncoder = new Encoder(7, 8, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "leftShootEncoder", shooterleftShootEncoder);
        shooterleftShootEncoder.setDistancePerPulse(1.0);
        shooterleftShootEncoder.setPIDSourceType(PIDSourceType.kRate);
        shooterrightShootEncoder = new Encoder(9, 10, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "rightShootEncoder", shooterrightShootEncoder);
        shooterrightShootEncoder.setDistancePerPulse(1.0);
        shooterrightShootEncoder.setPIDSourceType(PIDSourceType.kRate);
        feederfeedAxle = new Spark(5);//should be 5
        LiveWindow.addActuator("Feeder", "feedAxle", (Spark) feederfeedAxle);
        
        feederfeedSwitch = new DigitalInput(13);
        LiveWindow.addSensor("Feeder", "feedSwitch", feederfeedSwitch);
        
        
        pivotTopSwitch= new DigitalInput(0);
        //LiveWindow.addSensor("Feeder", "feedSwitch", feederfeedSwitch);
        
        pivotBottomSwitch = new DigitalInput(14);
        //LiveWindow.addSensor("Feeder", "feedSwitch", feederfeedSwitch);
        
        
        pivotpivotControl = new Spark(4);
        LiveWindow.addActuator("Pivot", "pivotControl", (Spark) pivotpivotControl);
        
        
        pivotpivotEncoder = new Encoder(1, 2, false, EncodingType.k4X);
        LiveWindow.addSensor("Pivot", "pivotEncoder", pivotpivotEncoder);
        pivotpivotEncoder.setDistancePerPulse(360.0/8192);
        pivotpivotEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        climberclimbMotor = new Talon(9);
        LiveWindow.addActuator("Climber", "climbMotor", (Talon) climberclimbMotor);
        
        climberclimbEncoder = new Encoder(11, 12, false, EncodingType.k4X);
        LiveWindow.addSensor("Climber", "climbEncoder", climberclimbEncoder);
        climberclimbEncoder.setDistancePerPulse(1.0);
        climberclimbEncoder.setPIDSourceType(PIDSourceType.kRate);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
