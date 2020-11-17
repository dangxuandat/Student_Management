package se150699;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student_list_se150699 extends ArrayList<Student_Se150699> {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student_Se150699> list = new ArrayList<>();
    public int find(String acode){
        for(int i = 0; i < list.size();i++){
            if(list.get(i).getCode().equals(acode)) return i;
        }
        return -1;
    }
    public void addStudent(){
        String code;
        String name;
        String class_id;
        float mark_pro192 = 0;
        float mark_Pro201 = 0;
        float mark_dbi202 = 0;
        int flag = 0;
        System.out.print("Enter the code of student: ");
        code =sc.nextLine();
        System.out.print("Enter the name of student: ");
        name =sc.nextLine();
        System.out.print("Enter the class_id of student: ");
        class_id = sc.nextLine();
        do{
            try {
                System.out.print("Enter the mark_pro192 of student: ");
                mark_pro192 = Float.parseFloat(sc.nextLine());
                System.out.print("Enter the mark_Pro201 of student: ");
                mark_Pro201 = Float.parseFloat(sc.nextLine());
                System.out.print("Enter the mark_dbi202 of student: ");
                mark_dbi202 = Float.parseFloat(sc.nextLine());
                flag = 1;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
                System.out.println("Enter the float number!!");
            }
        }while(flag == 0);
        list.add(new Student_Se150699(code, name, class_id, mark_pro192, mark_Pro201, mark_dbi202));
    }
    public void remove_Student(){
        String code;
        int pos;
        if(list.size() < 0){
            System.out.println("Empty list!!");
            return;
        }
        else{
            System.out.print("Enter the code of student: ");
            code = sc.nextLine();
            pos = find(code);
            if(pos < 0){
                System.out.println("The student doesn't exist!!!");
                return;
            }
            else{
                list.remove(pos);
                System.out.println("Student has been removed!!!");
            }
        }
    }
    public void print_highest_GPA(){
        float max = list.get(0).getGPA();
        ArrayList<Student_Se150699> highest_GPA_student = new ArrayList<>();
        for(int i = 0; i < list.size();i++){
            if(list.get(i).getGPA() >= max){
                max = list.get(i).getGPA();
                highest_GPA_student.add(list.get(i));
            }
        }
        for(int i = 0; i< highest_GPA_student.size();i++){
            if(highest_GPA_student.get(i).getGPA() < max) highest_GPA_student.remove(i);
        }
        for (Student_Se150699 student_Se150699 : highest_GPA_student) {
            System.out.println("List students have highest GPA");
            student_Se150699.print();
        }
    }
    public void print(){
        Collections.sort(list, new Comparator<Student_Se150699>(){

            @Override
            public int compare(Student_Se150699 o1, Student_Se150699 o2) {
                // TODO Auto-generated method stub
                return o1.getGPA() > o2.getGPA() ? -1:1;
            }
            
        });
        for (Student_Se150699 student_Se150699 : list) {
            System.out.println("List of students");
            student_Se150699.print();
        }
    }
}
