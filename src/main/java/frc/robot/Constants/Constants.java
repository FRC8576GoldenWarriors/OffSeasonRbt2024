package frc.robot.Constants;

public class Constants {
    
    public class IntakeConstants{
        public static final int intakeSparkMaxID = 20; // Change this later
        public static final double intakeOutSpeed = 0.5;
        public static final double intakeInSpeed = -0.5;
    }

    public class ControllerConstants{
        public static final int driverControllerPort = 0;
        public static final int operatorControllerPort = 1;
    }

    public class ElevatorConstants{
        public static final int leftElevatorSparkMaxID = 12;
        public static final int rightElevatorSparkMaxID = 11;
        public static final double elevatorUpSpeed = 0.2;
        public static final double elevatorDownSpeed = -0.2;
        public static final int laserCanId = 30;
        public static final double kPUp = 0.0;
        public static final double kIUp = 0.0;
        public static final double kDUp = 0.0;

        
        public static final double kPDown = 0.0;   
        public static final double kIDown = 0.0;
        public static final double kDDown = 0.0;

        public static final double kExampleSetpoint = 10;
    }

}
