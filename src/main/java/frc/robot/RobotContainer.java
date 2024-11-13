// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commands.ElevatorDownCommand;
import frc.robot.Commands.ElevatorUpCommand;
import frc.robot.Commands.IntakeInCommand;
import frc.robot.Commands.IntakeOutCommand;
import frc.robot.Constants.Constants;
import frc.robot.Subsystems.Elevator;
import frc.robot.Subsystems.Intake;

public class RobotContainer {
  Intake m_intake = new Intake();
  Elevator m_elevator = new Elevator();
  CommandXboxController operatorController = new CommandXboxController(Constants.ControllerConstants.operatorControllerPort);

  private final Command example = Commands.runOnce(m_elevator::enable, m_elevator);
  private final Command exampleStop = Commands.runOnce(m_elevator::disable, m_elevator);



  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    //operatorController.x().whileTrue(new IntakeInCommand(m_intake));
    
    //operatorController.b().whileTrue(new IntakeOutCommand(m_intake));


    operatorController.x().onTrue(example);
    operatorController.b().onTrue(exampleStop);
    operatorController.y().whileTrue(new ElevatorUpCommand(m_elevator));
    operatorController.a().whileTrue(new ElevatorDownCommand(m_elevator));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
