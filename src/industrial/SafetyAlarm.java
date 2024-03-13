package industrial;

public class safetyalarm {

        private String message;

        public SafetyAlarm(String message) {
            this.message = message;
        }

        public void trigger() {
            System.out.println(message);
        }

        // Other common safety-related methods
        public void initiateEvacuation() {
            System.out.println("Initiating evacuation procedures");
        }
    }
}
