package org.usfirst.frc.team4911.robot;

import org.usfirst.frc.team4911.helpers.Motor;

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author Luke Caughell
 * 
 */
public class RobotMap {
//	public static CANTalon RightShooterTalon;
//	public static CANTalon LeftShooterTalon;
//
//	public static Solenoid PneumaticCanRight;
//	public static Solenoid PneumaticCanLeft;
	
	
	//DRIVE
	public static CANTalon DriveFrontRightTalon;
	public static CANTalon DriveMidRightTalon;
	public static CANTalon DriveRearRightTalon;
	public static CANTalon DriveFrontLeftTalon;
	public static CANTalon DriveMidLeftTalon;
	public static CANTalon DriveRearLeftTalon;
	
	public static Motor DriveFrontRightMotor;
	public static Motor DriveFrontMidMotor;
	public static Motor DriveFrontLeftMotor;
	public static Motor DriveRearRightMotor;
	public static Motor DriveRearMidMotor;
	public static Motor DriveRearLeftMotor;
	
	public static Encoder DriveRightEncoder;
	public static Encoder DriveLeftEncoder;
	
	//ROLLER
	public static CANTalon RollerBar;
	public static CANTalon RollerRoller;
	
	public static Solenoid RollerBarSolenoid;
	
	public static AnalogPotentiometer RollerPotentiometer;

	public static Motor RollerBarMotor;
	public static Motor RollerRollerMotor;
	
	//SCALE
	public static CANTalon ScaleRightTalon;
	public static CANTalon ScaleLeftTalon;
	
	public static Encoder ScaleRightEncoder;
	public static Encoder ScaleLeftEncoder;
	
	public static Solenoid ScaleSolenoid;
	
	public static Motor ScaleRightMotor;
	public static Motor ScaleLeftMotor;
	
	//SHOOTER
	public static CANTalon ShooterLeftTalon;
	public static CANTalon ShooterRightTalon;
	public static CANTalon ShooterLiftTalon;
	
	public static Solenoid ShooterLeftSolenoid;
	public static Solenoid ShooterRightSolenoid;

	public static Encoder ShooterEncoder;
	
	public static Motor ShooterLeftMotor;
	public static Motor ShooterRightMotor;
	public static Motor ShooterLiftMotor;
	
	//EXTENDER
	public static CANTalon Extender;
	public static AnalogPotentiometer ExtenderPotentiometer;
	public static Solenoid ExtenderSolenoid;
	
	public static Motor ExtenderMotor;
	
	//JOYSTICS
	public static Joystick LeftJoy;
	public static Joystick RightJoy;
	


	/**
	 * Initializes sensors and controllers 
	 */
	public static void init(){
//		RightShooterTalon = new CANTalon(6);
//		LeftShooterTalon = new CANTalon(7);
		
//      PneumaticCanRight = new Solenoid(0);
//      PneumaticCanLeft = new Solenoid(1);
		
		DriveFrontRightTalon = new CANTalon(RobotConstants.frontRightMotorPort);
		DriveRearRightTalon = new CANTalon(RobotConstants.rearRightMotorPort);
		DriveFrontLeftTalon = new CANTalon(RobotConstants.frontLeftMotorPort);
        DriveRearLeftTalon = new CANTalon(RobotConstants.rearLeftMotorPort);
        
        DriveRightEncoder = new Encoder(RobotConstants.frontRightEncoderPortA, RobotConstants.frontRightEncoderPortB);
        DriveRightEncoder.setDistancePerPulse(RobotConstants.encoderDistancePerPulse);
        
    	DriveFrontRightMotor = new Motor (DriveFrontRightTalon, DriveRightEncoder, null, 0.0001, 0.0, 0.0);
    	DriveFrontLeftMotor = new Motor (DriveFrontLeftTalon, null, null, 0, 0, 0);
    	DriveRearRightMotor = new Motor (DriveRearRightTalon, null, null, 0, 0, 0);
    	DriveRearLeftMotor = new Motor (DriveRearLeftTalon, null, null, 0, 0, 0);

		LeftJoy = new Joystick(RobotConstants.rightJoyPort);
		RightJoy = new Joystick(RobotConstants.leftJoyPort);
		
		ShooterLeftMotor = new Motor (ShooterLeftTalon, null, null, 0, 0, 0);
		ShooterRightMotor = new Motor (ShooterLeftTalon, null, null, 0, 0, 0);
    	
    	ScaleRightMotor = new Motor (ScaleRightTalon, ScaleRightEncoder, null, 0, 0, 0);
    	ScaleLeftMotor = new Motor(ScaleRightTalon, ScaleRightEncoder, null, 0, 0, 0);
    	
	}
	
}
