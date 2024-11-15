// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
          // new TurnDegrees(1, 0, drivetrain),
          new DriveDistance(2, 35, drivetrain),//drive forward to the ramp (35-38 in)
          new DriveDistance(-1.5, 11, drivetrain),
          new TurnDegrees(-0.8, 70, drivetrain),
          new DriveDistance(2, 15, drivetrain),
          new TurnDegrees(-1, 70, drivetrain),
          new DriveDistance(2, 5, drivetrain));
        // new DriveDistance(100, 10, drivetrain), //
        // new TurnDegrees(100, 180, drivetrain),
        // new DriveDistance(100, 10, drivetrain),
        // new TurnDegrees(100, 180, drivetrain));
  }
}
