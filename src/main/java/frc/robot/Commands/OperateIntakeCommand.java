package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Intake;

public class OperateIntakeCommand extends Command{
    public Intake intake;

    public OperateIntakeCommand(Intake intake){
        this.intake = intake;
        addRequirements(intake);
    }
}
