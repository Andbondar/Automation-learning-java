package Lection4.PhilogeneticTree;

/**
 * Created by Student on 4/3/2015.
 */
public class Animals extends AllAlive {
    @Override
    public String getinfo() {
        return null;
    }

    public String getInfo(){
        return "Animals info";
    }
    public long getAge(){
        return 20000;
    }
    public float getPartOfTotalCount(){
        return totalCount/AllAlive.totalCount;
    }

    public static long totalCount = 15000;
    public int weight;

    public void feed(){};
    public void move(){};
    public String say(){
        return null;
    };
}
