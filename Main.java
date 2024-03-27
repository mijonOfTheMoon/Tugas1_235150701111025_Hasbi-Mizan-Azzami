public class Main {
    public static void main(String[] args) {
        
        LCD lcd = new LCD();
        lcd.setBrightness(100);
        lcd.brightnessUp();
        lcd.brightnessUp();
        lcd.brightnessUp();
        lcd.brightnessUp();
        lcd.brightnessUp();
        lcd.displayMessage();

    }
}
