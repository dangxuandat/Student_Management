package se150699;

public class Main_se150699 {
    public static void main(String[] args) {
        Menu_se150699 menu = new Menu_se150699();
        Student_list_se150699 list = new Student_list_se150699();
        menu.add("1 - Add student");
        menu.add("2 - Remove student");
        menu.add("3 - Print list of student with highest GPA");
        menu.add("4 - Print list in descending order base on GPA");
        menu.add("5 - Quit");
        int choice;
        do {
            choice = menu.getChoice();
            switch(choice){
                case 1: list.addStudent();
                        break;
                case 2: list.remove_Student();
                        break;
                case 3: list.print_highest_GPA();
                        break;
                case 4: list.print();
                        break;
            }
        } while (choice > 0 && choice <5);
    }
}
