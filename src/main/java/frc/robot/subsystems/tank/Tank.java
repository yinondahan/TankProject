package frc.robot.subsystems.tank;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Tank extends SubsystemBase {
    private final DifferentialDrive differentialDrive = TankConstants.DIFFERENTIAL_DRIVE;

    public Tank() {
    }

    void arcadeDrive(double targetDriveSpeed, double targetRotationSpeed) {
        double limitedDriveSpeed = targetDriveSpeed * TankConstants.MAX_DRIVE_SPEED;
        double limitedRotationSpeed = targetRotationSpeed * TankConstants.MAX_ROTATION_SPEED;

        final double deadbandedDriveSpeed = MathUtil.applyDeadband(limitedDriveSpeed, TankConstants.DRIVE_DEADBAND);
        final double deadbandedRotationSpeed = MathUtil.applyDeadband(limitedRotationSpeed, TankConstants.ROTATION_DEADBAND);

        differentialDrive.arcadeDrive(deadbandedDriveSpeed, deadbandedRotationSpeed, true);
    }

    void stop() {
        differentialDrive.stopMotor();
    }
}