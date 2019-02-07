package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Hardware;
import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.robot.Robot;

@Autonomous(name="Auton for Next to Crater", group="Linear Opmode")

public class nextToCraterAuton extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    RobotHardware robot = new RobotHardware();

    @Override
    public void runOpMode() {
        
        robot.init(hardwareMap);
        
        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
            
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

           

            // Choose to drive using either Tank Mode, or POV Mode
            // Comment out the method that's not used.  The default below is POV.

            // POV Mode uses left stick to go forward, and right stick to turn.
            // - This uses basic math to combine motions and is easier to drive straight.
            robot.frontLeftMotor.setPower(0.5);
            robot.frontRightMotor.setPower(-0.5);
            robot.backLeftMotor.setPower(0.5);
            robot.backRightMotor.setPower(-0.5);

            if (getRuntime() > 2){
                runtime.reset();
                robot.frontLeftMotor.setPower(0);
                robot.frontRightMotor.setPower(0);
                robot.backLeftMotor.setPower(0);
                robot.backRightMotor.setPower(0);
        }
    }
    }
}