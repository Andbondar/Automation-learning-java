package Lection3.TaskAdditional_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Student on 4/1/2015.
 */
public class RetrieveStudentInfo {
    public static void main(String[] args) {
        final ArrayList<Student> studentArrayList = new ArrayList<Student>();
        for (int i = 0; i< 5; i++){
            studentArrayList.add(Student.generateStudent());
            System.out.println(studentArrayList.get(i).toString());
        }
        studentArrayList.add(Student.createStudent("John", 4, "A-2"));
        System.out.println(studentArrayList.get(5).toString());

        System.out.println();

        System.out.println(studentArrayList.stream().filter(x -> x.getName().equals("John")).collect(Collectors.toList()).get(0).toString());
    }
}
