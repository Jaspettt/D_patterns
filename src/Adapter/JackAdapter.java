package Adapter;

public class JackAdapter implements IHeadphone{
    private IHeadphone headphone;
    public JackAdapter(IHeadphone headphone) {
        this.headphone = headphone;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing compatible music");
        headphone.playMusic();
    }
}
