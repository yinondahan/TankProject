package frc.robot.subsystems.tank;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.FunctionalCommand;

public class TankCommands {
    public static Command getSetArcadeDriveCommand(Tank tank) {
        return new FunctionalCommand(
                () -> {
                },
                () -> tank.arcadeDriveCalculation(),
                (interrupted) -> tank.stop(),
                () -> false,
                tank
        );
    }
}