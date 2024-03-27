public class Main {
    public static void main(String[] args) {
        
        LCD lcd = new LCD();
        lcd.turnOn();
        lcd.setVolume(10);
        lcd.setBrightness(5);
        lcd.setCable(2);
        lcd.displayMessage();

        LCD lcd2 = new LCD();
        lcd2.freeze();
        for (int i = 0; i < 70; i++) {
            lcd2.volumeUp();
        }
        lcd2.setBrightness(55);
        lcd2.setCable(100);
        lcd2.displayMessage();
    }
}
