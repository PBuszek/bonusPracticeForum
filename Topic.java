import java.util.ArrayList;
import java.util.LokalDate;

import javax.xml.stream.events.Comment;


public class Topic extends Entry{
    public String title;
    public ArrayList<Comment> comments;


    public Topic(String message, String title){
        super(message);
        this.title = title;

        this.comments = new ArrayList<>();


    }

    public void addComment(String commentContent){
        comments.add(new Comment(commentContent));
    }
    public ArrayList<Comment> getModeratedComments(){
        ArrayList<Comment> moderatedComments;
        moderatedComments = new ArrayList<Comment>();
        for (int i=0; i < comments.size(); i++){
            if(comments.get(i).isModerated == true){
                moderatedComments.add(comments.get(i));
            }
        }
        return moderatedComments;
    
    }
}