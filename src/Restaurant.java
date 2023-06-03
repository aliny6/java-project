import com.sun.tools.javac.Main;

import java.util.*;
import java.util.ArrayList;
public class Restaurant {
    public static Restaurant open;
    public static int shuffle=1;
    public static List<Integer> list = new ArrayList<>();
    public ArrayList<Integer> deactive= new ArrayList<>();
    public String ID;
    public String loc;
    public ArrayList<String> typ;
    public ArrayList<Integer> foodID;
    public ArrayList<String> foodname;
    public ArrayList<Integer> foodprice;
    public ArrayList<Integer> fooddis;
    public static ArrayList<Restaurant> restaurant=new ArrayList<>();
    private Restaurant(String ID,String loc,ArrayList<String> typ,ArrayList<String> foodname,ArrayList<Integer> foodprice,ArrayList<Integer> fooddis,ArrayList<Integer> foodID,ArrayList<Integer> deactive){
        this.ID=ID;
        this.loc=loc;
        this.typ=typ;
        this.foodname=foodname;
        this.fooddis=fooddis;
        this.foodprice=foodprice;
        this.foodID=foodID;
        this.deactive=deactive;
    }
    static void openRestaurant(String ID){
        for (int i=0;i<restaurant.size();i++){
            if(restaurant.get(i).ID.equals(ID)){
                open=restaurant.get(i);
                return;
            }
        }
    }
    static void showloc(Restaurant open){
        System.out.print(open.ID);
    }
    static void editloc(Restaurant open,String loc){
        open.loc=loc;
    }
    static void showtyp(Restaurant open){
        for(int i=0;i<open.typ.size();i++){
            System.out.println(open.typ.get(i));
        }
    }
    static void showmenu(Restaurant open){
        for(int i=0;i<open.foodname.size();i++){
            System.out.println(open.foodID.get(i)+":"+open.foodname.get(i)+"  price:"+open.foodprice.get(i)+"  current discount for this food is:"+open.fooddis.get(i));
        }
    }
    static void editname(int ID,String name,Restaurant open){
        for(int i=0;i<open.foodname.size();i++){
            if(open.foodID.get(i)==(ID)){
                open.foodname.get(i)=name;
            }
        }
    }
    static void editprice(int ID,int price,Restaurant open){
        for(int i=0;i<open.foodname.size();i++){
            if(open.foodID.get(i)==(ID)){
                open.foodprice.get(i)=price;
            }
        }
    }
    static void addfood(String name,int price,Restaurant open){
        open.foodprice.add(price);
        open.foodname.add(name);
        open.foodID.add(list.get(shuffle));
        open.fooddis.add(0);
    }
    static void deletefood(Restaurant open,int ID){
        int s=0;
        for(int i=0;i<open.foodID.size();i++){
            if(open.foodID.get(i)==ID){
                s=i;
                break;
            }
        }
        open.foodID.remove(s);
        open.foodname.remove(s);
        open.fooddis.remove(s);
        open.foodprice.remove(s);
    }
    static void activatefood(int ID,Restaurant open){
        for(int i=0;i<open.deactive.size();i++){
            if(open.deactive.get(i)==ID){
                open.deactive.remove(i);
                return;
            }
        }
    }
    static void deactivatefood(int ID,Restaurant open){
        for(int i=0;i<open.foodID.size();i++){
            if(open.foodID.get(i)==ID){
                open.deactive.add(ID);
                return;
            }
        }
    }
    static void discount(int ID,Restaurant open,int dis){
        for (int i=0;i<open.foodID.size();i++){
            if(open.foodID.get(i)==ID&&dis<51&&open.fooddis.get(i)==0){
                open.fooddis.get(i)=dis;
                return;
            }
        }
    }

}