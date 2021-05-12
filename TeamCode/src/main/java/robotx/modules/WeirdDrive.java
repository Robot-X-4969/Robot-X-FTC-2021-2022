package robotx.modules;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import robotx.libraries.XModule;
import robotx.opmodes.RobotXOpMode2021;


public class WeirdDrive extends XModule {

        public DcMotor frontLeft;
        public DcMotor frontRight;
        public DcMotor backLeft;
        public DcMotor backRight;


        public WeirdDrive(RobotXOpMode2021 robotXOpMode2021){
            super();

        }

        public void init(){
            //front left motor
            frontLeft = opMode.hardwareMap.dcMotor.get("frontLeft");
            // frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                      //reverse this; want "forward direction for robot" to be "positive values" /or/ "up on the y-stick"
            //when moving forward, the two front wheels spin in opposite directions (left is counter-clockwise, right is clockwise)
            //front right motor
            frontRight = opMode.hardwareMap.dcMotor.get("frontRight");
            // frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            //back left motor
            backLeft = opMode.hardwareMap.dcMotor.get("backLeft");
            // backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                         //reverse for same reason as above

            //back right motor
            backRight = opMode.hardwareMap.dcMotor.get("backRight");
            //backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

        public void loop() {

            if (xGamepad1().dpad_down.isDown()){
                frontLeft.setPower(-0.6);
                frontRight.setPower(-0.6);
                backLeft.setPower(-0.6);
                backRight.setPower(-0.6);
            }
            if (xGamepad1().dpad_up.isDown()){
                frontLeft.setPower(0.6);
                frontRight.setPower(0.6);
                backLeft.setPower(0.6);
                backRight.setPower(0.6);

            }if (xGamepad1().dpad_left.isDown()){
                frontLeft.setPower(-0.6);
                frontRight.setPower(0.6);
                backLeft.setPower(-0.6);
                backRight.setPower(0.6);

            }if (xGamepad1().dpad_right.isDown()){
                frontLeft.setPower(0.6);
                frontRight.setPower(-0.6);
                backLeft.setPower(0.6);
                backRight.setPower(-0.6);

            }


        }

    }

