public class IndustrialAlarm {

        package industrial;

import industrial.alarm.EquipmentFailureAlarm;
import industrial.alarm.FireAlarm;
import industrial.alarm.SafetyAlarm;

        public class Alarmapplication {
            public static void main(String[] args) {
                // Creating instances of industrial alarms
                EquipmentFailureAlarm equipmentFailureAlarm = new EquipmentFailureAlarm("Machine-001");
                SafetyAlarm safetyAlarm = new SafetyAlarm("Gas leak detected!");
                FireAlarm fireAlarm = new FireAlarm();

                // Triggering alarms
                equipmentFailureAlarm.trigger();
                equipmentFailureAlarm.notifyMaintenance();

                safetyAlarm.trigger();
                safetyAlarm.initiateEvacuation();

                fireAlarm.trigger();
                fireAlarm.activateSprinklers();
            }
        }
    }


}