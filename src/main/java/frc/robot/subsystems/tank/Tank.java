package frc.robot.subsystems.tank;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class Tank extends SubsystemBase {
    private final DifferentialDrive differentialDrive = TankConstants.DIFFERENTIAL_DRIVE;
    private final CommandXboxController driverController = TankConstants.DRIVER_CONTROLLER;

    public Tank() {
    }

    void arcadeDriveCalculation() {
        double drive = -driverController.getLeftY() * TankConstants.MAX_DRIVE_SPEED;
        double rotation = driverController.getRightX() * TankConstants.MAX_ROTATION_SPEED;

        drive = MathUtil.applyDeadband(drive, 0.02);
        rotation = MathUtil.applyDeadband(rotation, 0.02);

        differentialDrive.arcadeDrive(drive, rotation, true);
    }

    void stop() {
        differentialDrive.stopMotor();
    }
}