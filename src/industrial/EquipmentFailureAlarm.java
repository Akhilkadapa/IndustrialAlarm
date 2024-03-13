package industrial;

public class EquipmentFailureAlarm extends SafetyAlarm {
        private String equipmentId;

        public EquipmentFailureAlarm(String equipmentId) {
            super("Equipment failure detected!");
            this.equipmentId = equipmentId;
        }

        // Additional methods specific to equipment failure alarms
        public void notifyMaintenance() {
            System.out.println("Notifying maintenance about equipment " + equipmentId);
        }
    }
}
