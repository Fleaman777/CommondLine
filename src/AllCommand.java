import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AllCommand {

    private String enterCommand = null;
    private String enterName = null;


    AllCommand() throws IOException {
        scannerLine();
        chooseCommand();
    }

    void scannerLine(){
        Scanner scan = new Scanner(System.in);
        setEnterCommand(scan.nextLine());
        setEnterName(scan.nextLine());
    }



    void chooseCommand() throws IOException {
        switch (enterCommand) {
            case ("createFile"):
                createFile(enterName);
                break;
            case ("createDirectory"):
                createDirectory(enterName);
                break;
            case ("writeInFile"):
                writeInFile();
            case ("deleteFile"):
                deleteFile(enterName);
                break;
            case ("renameFile"):
                renameFile();
            case ("removeFile"):
                removeFile();
            case ("archivingFiles"):
                archivingFiles();
            case ("functionOfCollections"):
                functionOfCollections();
                default:
                    System.out.println("Command name is't correct.");
                    //chooseCommand();
        }
    }



    void createFile(String nameFile) throws IOException {
        File file = new File(nameFile);
        boolean result = file.createNewFile();
        if(result){
            System.out.println("New File " + nameFile + " create.");
        }

    }

    void createDirectory(String nameDir){
        File dir = new File(nameDir);
        boolean result = dir.mkdir();
        if(result){
            System.out.println("New directory " + nameDir + " create.");
        }
    }

    void writeInFile(){

    }

    void deleteFile(String nameFile) throws IOException {

        Path newPath = Paths.get(nameFile);
        //Files.createFile(newPath);
        System.out.println(newPath.getFileName());
        Files.delete(newPath);
//        File file = new File(nameFile);
//        File dir = new File(nameFile);
//        boolean result = false;
//
//        if(file.isFile()){
//            result = file.delete();
//        }
//        if(dir.isDirectory()){
//            result = dir.delete();
//        }
//        if(result){
//            System.out.println("File " + nameFile + " delete");
//        }
//        else System.out.println("File or directory not found");
    }

    void renameFile(){

    }

    void removeFile(){

    }

    void archivingFiles(){

    }

    void functionOfCollections(){

    }





    public void setEnterName(String enterName) {
        this.enterName = enterName;
    }

    public void setEnterCommand(String enterCommand) {
        this.enterCommand = enterCommand;
    }

    public String getEnterCommand() {
        return enterCommand;
    }

    public String getEnterName() {
        return enterName;
    }
}
