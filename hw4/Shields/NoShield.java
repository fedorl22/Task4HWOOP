package Shields;

public class NoShield extends Shield {

    private static NoShield instance;

    public NoShield(){
        super(0);
    }

    public static NoShield getInstance(){
        if (instance == null){
            synchronized (NoShield.class){
                if (instance == null){
                    instance = new NoShield();
                }
            }
        }
        return instance;
    }

}
