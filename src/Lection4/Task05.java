package Lection4;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by bondar on 4/6/2015.
 *
 * Создать классы public static классы Fruits, Vegetables;
 Реализовать метод getFruits, который должен возвращать множество с 4
 фруктами - fruits.
 Реализовать метод getVegetables, который должен возвращать множество с 3
 овощами - vegetables.
 Реализовать метод join, который должен возвращать объединенное множество
 plants из овощей и фруктов.
 Реализовать методы removeFruit, removeVegetable который должен удалять из
 множества plants элементы, которые есть в fruits or vegetables.
 Реализовать метод printPlants.
 */
public class Task05{
    public static void main(String[] args) {
        Fruits myFruits = new Fruits();
        myFruits.addFruit("Apple");
        myFruits.addFruit("Banana");
        myFruits.addFruit("Pineapple");
        myFruits.addFruit("Cherry");

        Vegetables myVegetables = new Vegetables();
        myVegetables.addVegetable("Dandelion");
        myVegetables.addVegetable("Corn salad");
        myVegetables.addVegetable("Amaranth");
        myVegetables.addVegetable("Arugula");

        System.out.println("getFruits(4):");
        System.out.println(Arrays.toString(myFruits.getFruits(4)));
        System.out.println("getVegetables(3):");
        System.out.println(Arrays.toString(myVegetables.getVegetables(3)));


        System.out.println();
        System.out.println("join random arrays:");
        System.out.println(Arrays.toString(join(myFruits.getFruits(4), myVegetables.getVegetables(3))));

        Plants myPlants = new Plants();
        ArrayList<String> plantArray = new ArrayList<String>();
        //move elements of myFruits and myVegetables to myPlants
        for (int i = 0; i < myFruits.getFruitsArray().size(); i++){
            plantArray.add(myFruits.getFruitsArray().get(i));
        }
        for (int i = 0; i < myVegetables.getVegetablesArray().size(); i++){
            plantArray.add(myVegetables.getVegetablesArray().get(i));
        }
        myPlants.setPlantsArray(plantArray);
        System.out.println();
        System.out.println("printPlants():");
        myPlants.printPlants();//print the Plants array

        System.out.println();
        //remove Fruit "Apple"
        System.out.println(">remove Fruit \"Apple\"");
        myPlants.removeFruit("Apple", myFruits);
        myPlants.printPlants();

        //remove fruit "Tea"
        System.out.println(">remove fruit \"Tea\"");
        myPlants.removeFruit("Tea", myFruits);

        //remove vegetable "Dandelion"
        System.out.println(">remove vegetable \"Dandelion\"");
        myPlants.removeVegetable("Dandelion", myVegetables);
        myPlants.printPlants();

        //remove vegetable "Tea"
        System.out.println(">remove vegetable \"Tea\"");
        myPlants.removeVegetable("Tea", myVegetables);
    }

    public static String[] join(String[] inputFruits, String[] inputVegetables) {
        return (String[]) ArrayUtils.addAll(inputFruits, inputVegetables);
    }

    public static class Fruits implements Fruitable {
        private ArrayList<String> fruitsArray = new ArrayList<String>();

        public void setFruitsArray(ArrayList<String> fruitsArray) {
            this.fruitsArray = fruitsArray;
        }
        public ArrayList<String> getFruitsArray(){
            return this.fruitsArray;
        }

        @Override
        public void addFruit(String addedFruit){
            fruitsArray.add(addedFruit);
        }

        @Override
        public String[] getFruits(int requestedNumber){
            String[] outputArray = new String[requestedNumber];
            Random randomGenerator = new Random();
            for (int i = 0; i < requestedNumber; i++){
                int index = randomGenerator.nextInt(fruitsArray.size());
                outputArray[i] = fruitsArray.get(index);
            }
            return outputArray;
        }
    }

    public static class Vegetables implements Vegetable {
        private ArrayList<String> vegetablesArray = new ArrayList<String>();

        public void setVegetablesArray(ArrayList<String> vegetablesArray) {
            this.vegetablesArray = vegetablesArray;
        }
        public ArrayList<String> getVegetablesArray(){
            return vegetablesArray;
        }

        @Override
        public void addVegetable(String addedVagetable){
            vegetablesArray.add(addedVagetable);
        }

        @Override
        public String[] getVegetables(int requestedNumber){
            String[] outputArray = new String[requestedNumber];
            Random randomGenerator = new Random();
            for (int i = 0; i < requestedNumber; i++){
                int index = randomGenerator.nextInt(vegetablesArray.size());
                outputArray[i] = vegetablesArray.get(index);
            }
            return outputArray;
        }
    }

    public static class Plants implements Plantable{
        ArrayList<String> plantsArray = new ArrayList<String>();

        public void setPlantsArray(ArrayList<String> plantsArray) {
            this.plantsArray = plantsArray;
        }
        public ArrayList<String> getPlantsArray(){
            return this.plantsArray;
        }

        public void removeFruit(String fruitName, Fruits fruits){
            if (fruits.getFruitsArray().contains(fruitName)){
                this.getPlantsArray().remove(fruitName);
            }
            else System.out.println("Such entity cannot be removed");
        }

        public void removeVegetable(String vegetableName, Vegetables vegetables){
            if (vegetables.getVegetablesArray().contains(vegetableName)){
                this.getPlantsArray().remove(vegetableName);
            }
            else System.out.println("Such entity cannot be removed");
        }

        public void printPlants() {
            System.out.println(Arrays.toString(this.plantsArray.toArray()));
        }
    }
}
