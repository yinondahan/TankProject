package frc.robot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.tank.Tank;
import frc.robot.subsystems.tank.TankCommands;

public class RobotContainer {
    private static final Tank tank = new Tank();

    public RobotContainer() {
        configureBindings();
        tank.setDefaultCommand(
                TankCommands.getSetArcadeDriveCommand(tank)
        );
    }

    private void configureBindings() {
    }

    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}