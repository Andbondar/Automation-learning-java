package Lection4.PhilogeneticTree;

/**
 * Created by Student on 4/3/2015.
 */
public class Bird extends Animals implements Flyable{
    @Override
    public String getinfo() {
        return "Birds info";
    }

    public static long totalCount = 800;
    public long currentPosition = 0;
    public long speed = 0;
    public String name;
    public int age;
    public void fly(){
        this.currentPosition += this.speed;
    }

    public Bird(String name){
        this.name = name;
    }

    public Bird(String name, int age, long speed, long currentPosition){
        this.name = name;
        this.speed = speed;
        this.currentPosition = currentPosition;
        this.age = age;
    }

}
