package iphone;

public class iPhone implements IMusicPlayer, Phone, IWebBrowser  {
    
    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selected music: " + music);
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answer() {
        System.out.println("Call answered");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Voicemail started");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("New tab added");
    }

    @Override
    public void refreshPage() {
        System.out.println("Page refreshed");
    }
}

