package model;
import java.util.Scanner;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class Interface {
    Scanner scanner = new Scanner(System.in);
    private Boolean status = false;
    private String menuItems[] = {"Order Tour",
                                  "Add new Worker",
                                  "Find Client",
                                  "Options",
                                  "Setup all by one",
                                  "Exit"};

    // Display the menu
    public void showMenu(){
        for(int i=1; i<= menuItems.length-1; i++){
            System.out.println(i+") " + menuItems[i]);
        }
    }

    public void onExit(){
        this.status = false;
    }

    public void runDialog(){
        this.status = true;
        showMenu();

        while(status){
            reader();
        }
    }

    // Read line
    public void reader(){
        System.out.print(">>>\t");
        unParseLine(scanner.next());
    }

    //unparse line from reader
    private void unParseLine(String arg){
        if(arg.){}
        else if(arg.equals("5") || arg.equalsIgnoreCase("exit")){
            this.onExit();
        }

    }

    public static void main(String args[]) {
        Interface main = new Interface();
        main.runDialog();
    }
}
