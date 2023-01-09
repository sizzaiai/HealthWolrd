package Thread;

public class Mbti {
    private String Mbti;
    private String description;


    Mbti(String Mbti, String description){
        this.Mbti = Mbti;
        this.description = description;
    }

    public void Mbti_display(){
        System.out.println(description);
    }

    public String getMbti() {

        return Mbti;
    }

    public String getDescription() {
        return description;
    }


}
