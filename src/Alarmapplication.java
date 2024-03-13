public class IndustrialAlarm {

        package industrial;

import industrial.EquipmentFailureAlarm;
import industrial.FireAlarm;
import industrial.SafetyAlarm;

        public class AlarmApplication {
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
