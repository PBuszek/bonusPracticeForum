import java.util.Random;

public abstract class Entry{
    public int id;
    public LocalDate createLocalDate;
    public String message;

    public String toString(){
        return"";
    }

    public Entry(String message){
        this.message = message;
        this.id = generateId();
        this.createLocalDate = LocalDate.now();
    }

    public int generateId(){
        Random random = new Random();
        int randomId = random.nextInt(100000);

        return randomId;
    }

    

}
