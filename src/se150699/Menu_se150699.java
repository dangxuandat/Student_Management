package se150699;

import java.util.Scanner;
import java.util.Vector;

public class Menu_se150699 extends Vector<String> {
    public Menu_se150699(){
        super();
    }
    public int getChoice(){
        int result = 0;
        for(int i = 0; i < this.size();i++){
            System.out.println(this.get(i));
        }
        System.out.print("Please select an operation: ");
        Scanner sc = new Scanner(System.in);
        result = Integer.parseInt(sc.nextLine());
        return result;
    }
}
