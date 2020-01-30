import java.util.ArrayList;

public class Forum{
    public ArrayList<Topic> topics;


    public Forum(){
        this.topics = new ArrayList<>();
        
    }
    public Forum(ArrayList<Topic> topics) {
        this.topics = topics;

    }
    public void addTopic(String message, String title){
        Topics.add(new Topic(message, title));

    }

}