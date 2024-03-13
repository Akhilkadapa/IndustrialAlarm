package industrial;

public class FireAlarm {
    public class FireAlarm extends SafetyAlarm {
        public FireAlarm() {
            super("Fire detected!");
        }

        // Additional methods specific to fire alarms
        public void activateSprinklers() {
            System.out.println("Activating sprinkler system");
        }
    }
}
