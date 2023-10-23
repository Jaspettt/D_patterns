package Adapter;

public class AndroidHeadphones implements IHeadphone{

    @Override
    public void playMusic() {
        System.out.println("Playing music through android headphones");
    }

}
