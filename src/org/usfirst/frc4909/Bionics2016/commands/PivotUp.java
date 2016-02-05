package org.usfirst.frc4909.Bionics2016.commands;

import org.usfirst.frc4909.Bionics2016.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class PivotUp extends Command {
	
	public PivotUp() {
		requires(Robot.pivot);
	}

	@Override
	protected void initialize() {
		Robot.pivot.movePivot(-0.5);

		//Robot.pivot.disable();
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return !Robot.oi.pivotUpButton.get();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.pivot.movePivot(0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.pivot.movePivot(0.0);

	}

}
