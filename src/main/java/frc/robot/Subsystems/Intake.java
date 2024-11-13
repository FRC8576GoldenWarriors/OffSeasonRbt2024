package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Constants;

public class Intake extends SubsystemBase{
    
    CANSparkMax motor = new CANSparkMax(Constants.IntakeConstants.intakeSparkMaxID, MotorType.kBrushless);

    public Intake() {
        setBrake();
    }

    public void setSpeed(double speed) {
        motor.set(speed);
    }

    public void setCoast() {
        motor.setIdleMode(IdleMode.kCoast);
    }

    public void setBrake() {
        motor.setIdleMode(IdleMode.kBrake);
    }

}
