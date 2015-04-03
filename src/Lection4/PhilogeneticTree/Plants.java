package Lection4.PhilogeneticTree;

/**
 * Created by Student on 4/3/2015.
 */
public class Plants extends AllAlive {
    @Override
    public String getinfo() {
        return null;
    }

    @Override
    public long getAge() {
        return 100000;
    }

    @Override
    public float getPartOfTotalCount() {
        return totalCount/AllAlive.totalCount;
    }

    public static long totalCount = 80000;
}
