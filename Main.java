public class Main {
    public static void main(String[] args) {
        
        LCD lcd = new LCD();
        lcd.turnOn();
        lcd.setBrightness(66);
        lcd.setVolume(33);
        lcd.setCable(2);
        lcd.showStatus();

    }
}
