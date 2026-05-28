package Eksamen5;

public class Message {
    private String text;
    private long timeStamp;

    public Message(String text){
        this.text = text;
        this.timeStamp = System.currentTimeMillis();
    }

    public String getText(){
        return text;
    }

    public long getTimeStamp(){
        return timeStamp;
    }
    
    @Override
    public String toString(){
        return text + ", " + timeStamp;
    }
}
