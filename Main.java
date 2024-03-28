public class Main {
    public static void main(String[] args) {
        
        LCD lcd = new LCD();
        lcd.turnOn();
        lcd.setVolume(50);
        lcd.volumeUp();
        lcd.setBrightness(90);
        lcd.brightnessDown();
        lcd.setCable(1);
        lcd.showStatus();

    }
}
