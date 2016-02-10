package org.usfirst.frc4909.Bionics2016.commands;

import org.usfirst.frc4909.Bionics2016.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class CrossDefence extends Command {
	private double Kp = 0.03;
	private double time=1; //SET TO REAL TIME!!!!!
	
	public CrossDefence() {
		// TODO Auto-generated constructor stub
        requires(Robot.drivetrain);
	}


	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//Robot.drivetrain.resetGyro();
        while (Timer.getMatchTime()<time) {
            double angle = 0;//Robot.drivetrain.getGyroAngle(); // get current heading
            Robot.drivetrain.autoDrive(-1.0, angle*Kp); // drive towards heading 0
            Timer.delay(0.004);
        }
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
        Robot.drivetrain.autoDrive(0, 0); // drive towards heading 0

		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
