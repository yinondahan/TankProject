package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.tank.Tank;
import frc.robot.subsystems.tank.TankCommands;

public class RobotContainer {
    public static final Tank TANK = new Tank();

    private final CommandXboxController driverController = new CommandXboxController(0);

    public RobotContainer() {
        configureBindings();
        TANK.setDefaultCommand(
                TankCommands.getArcadeDriveCommand(driverController.getLeftY(), driverController.getRightX())
        );
    }



    private void configureBindings() {
    }

    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}