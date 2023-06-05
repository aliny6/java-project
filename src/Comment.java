import java.util.ArrayList;

public class Comment {
    public static ArrayList<Comment> comment=new ArrayList<>();
    public int foodIDD;
    public int commentID;
    public int ID;
    public String message;
    public boolean rescom;
    private Comment(int foodIDD,int ID,String message,boolean rescom,int commentID){
        this.ID=ID;
        this.foodIDD=foodIDD;
        this.message=message;
        this.rescom=rescom;
        this.commentID=commentID;
    }
    static void addresponse(int commentID,String message){
        comment.add(new Comment(Restaurant.openfoodID,Restaurant.list.get(Restaurant.shuffle),message,true,commentID));
        Restaurant.shuffle++;
    }
    static void addcomment(){}
    static void editresponse(int commentID,String message){
        for(int i=0;i<comment.size();i++){
            if(comment.get(i).commentID==commentID){
                comment.get(i).message=message;
                return;
            }
        }
        System.out.println("there is no response with given ID");
    }

}
