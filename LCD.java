public class LCD {
    
    private String status = "Mati";
    private int volume;
    private int brightness;
    private String cable = "Unplugged";

    public void turnOn() {
        this.status = "Menyala";
    }

    public void turnOff() {
        this.status = "Mati";
    }

    public void freeze() {
        this.status = "Freeze";
    }

    public void volumeUp() {
        if (this.volume == 100) {}
        else {this.volume++;}
    }

    public void volumeDown() {
        if (this.volume == 0) {}
        else {this.volume--;}
    }

    public void setVolume(int volume) {
        if (volume < 0) {}
        else if (volume > 100) {this.volume = 100;}
        else {this.volume = volume;}
    }

    public void brightnessUp() {
        if (this.brightness == 100) {}
        else {this.brightness++;}
    }

    public void brightnessDown() {
        if (this.brightness == 0) {}
        else {this.brightness--;}
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {}
        else if (brightness > 100) {this.brightness = 100;}
        else {this.brightness = brightness;}
    }

    public void setCable(int cable) {
        switch (cable) {
            case 0:
                this.cable = "VGA";
                break;
            case 1:
                this.cable = "HDMI";
                break;
            case 2:
                this.cable = "DVI";
                break;
            case 3:
                this.cable = "DisplayPort";
                break;
            case 4:
                this.cable = "USB-C";
                break;
            case 5:
                this.cable = "Wireless";
                break;
            default:
                setCable(cable % 6);
                break;
        }
    }

    public void displayMessage() {
        System.out.println("LCD Status  : " + this.status);
        System.out.println("Volume      : " + this.volume);
        System.out.println("Brightness  : " + this.brightness);
        System.out.println("Cable       : " + this.cable);
    }
}