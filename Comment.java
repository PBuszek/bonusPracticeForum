import java.time.LocalDate;



public class Comment extends Entry{

    public boolean isModerated = false;
    
    public Comment(String message){
       super(message);


    }
    public void moderatedComment(int index){
        comments.get(index).isModerated = true;
        
    }
}
