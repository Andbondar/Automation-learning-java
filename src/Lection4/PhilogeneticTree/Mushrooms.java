package Lection4.PhilogeneticTree;

/**
 * Created by Student on 4/3/2015.
 */
public class Mushrooms extends AllAlive {

    @Override
    public String getinfo() {
        return null;
    }

    public String getInfo() {
        return "Mushrooms info";
    }

    @Override
    public long getAge() {
        return 500000;
    }

    @Override
    public float getPartOfTotalCount() {
        return totalCount/AllAlive.totalCount;
    }

    public static long totalCount = 200000;


}
