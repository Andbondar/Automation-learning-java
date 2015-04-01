package Lection3.TaskAdditional_lambda;

import Lection2.Additional_regexp_extractor.CharNameGenerator;

import java.util.Random;

/**
 * Created by Student on 4/1/2015.
 */
public class Student {
    public static void main(String[] args) {

    }

    private String name;
    private int course;
    private String group;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getCourse(){
        return this.course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup(){
        return this.group;
    }

    public static int generateRandomCourse(){//courses vary in range [1,6]
        Random rand = new Random();
        return (rand.nextInt(6) + 1);
    }

    public static String generateRandomGroup(){
        Random rand = new Random();
        String groupLetter = "ABCDEF";
        int groupNumber = rand.nextInt(4) + 1;//4 numbers
        return (groupLetter.charAt(rand.nextInt(groupLetter.length())) + "-" + groupNumber);
    }

    public static Student generateRandomStudent(){
        Student newStudent = new Student();
        newStudent.name = CharNameGenerator.GenerateOneName();
        newStudent.course = generateRandomCourse();
        newStudent.group = generateRandomGroup();
        return newStudent;
    }

    public String toString(){
        return ("Name: " + this.getName() +", Course: " + this.getCourse() +", Group: " + this.getGroup());
    }

    public static Student createStudent(String name, int course, String group){
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setGroup(group);
        newStudent.setCourse(course);
        return newStudent;
    }
}
