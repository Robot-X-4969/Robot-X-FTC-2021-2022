package robotx.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import robotx.libraries.XOpMode;
import robotx.modules.MecanumDrive;
import robotx.modules.IntakeSystem;
import robotx.modules.ConveyorBelt;
import robotx.modules.LiftSystem;
import robotx.modules.Launcher;

@TeleOp(name = "RobotXOpMode2021", group = "Default")

public class RobotXOpMode2021 extends XOpMode {

    MecanumDrive mecanumDrive;
    IntakeSystem intakeSystem;
    ConveyorBelt conveyorBelt;
    LiftSystem liftSystem;
    Launcher launcher;


    public void initModules() {

        super.initModules();

        mecanumDrive = new MecanumDrive(this);
        activeModules.add(mecanumDrive);

        intakeSystem = new IntakeSystem(this);
        activeModules.add(intakeSystem);

        conveyorBelt = new ConveyorBelt(this);
        activeModules.add(conveyorBelt);

        liftSystem = new LiftSystem(this);
        activeModules.add(liftSystem);

        launcher = new Launcher(this);
        activeModules.add(launcher);


    }

    public void init() {
        super.init();
    }
}

/*
Controls
GamePad 1:
- Joysticks to drive
- left_bumper: 1/4 speed
- right_bumper: 1/2 speed

GamePad 2:
- a: Lift servo opens
- b: Lift servo closes
- x: Intake moves inward
- y: Intake moves outward
- dpad_up: Lift goes up
- dpad_down: Lift goes down
- left_bumper: Conveyor closes
- right_bumper: Conveyor opens
- dpad_right: Turns launcher on/off
- left_stick_button: Power shot
- right_stick_button: Turns on launcher servo
 */