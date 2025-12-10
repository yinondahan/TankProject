package frc.robot.subsystems.tank;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.FunctionalCommand;
import frc.robot.RobotContainer;

public class TankCommands {
    public static Command getArcadeDriveCommand(double targetDriveSpeed, double targetRotationSpeed) {
        return new FunctionalCommand(
                () -> {
                },
                () -> RobotContainer.TANK.arcadeDrive(targetDriveSpeed, targetRotationSpeed),
                (interrupted) -> RobotContainer.TANK.stop(),
                () -> false,
                RobotContainer.TANK
        );
    }
}