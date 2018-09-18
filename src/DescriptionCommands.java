
import java.util.Scanner;

public class DescriptionCommands {


    DescriptionCommands(){
        System.out.println(allInformation);
        scannerDesc();
        System.out.println(desribeFunctional());
    }


    String allInformation = " Informacion about programm and how it's work";

    String _1_ = "Create File";
    String _2_ = "Create Directiry";
    String _3_ = "Write information in file";
    String _4_ = "Delete file";
    String _5_ = "Rename file";
    String _6_ = "Remove file in other directiry";
    String _7_ = "Archiving";
    String _8_ = "Function of COllections";

    int numberCommand;


    void scannerDesc() {
        Scanner scanDescribe = new Scanner(System.in);
        numberCommand = scanDescribe.nextInt();
    }

    String desribeFunctional() {
        String information = "Command don't enter";
        switch (numberCommand) {
            case (1):
                information = _1_;
            case (2):
                information = _2_;
            case (3):
                information = _3_;
            case (4):
                information = _4_;
            case (5):
                information = _5_;
            case (6):
                information = _6_;
            case (7):
                information = _7_;
            case (8):
                information = _8_;


        }
        return "Information about this method: " + information;
    }

}