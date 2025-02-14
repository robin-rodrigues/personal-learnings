import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    List<FileSystem> fileSystemList = new ArrayList<>();

    void add(FileSystem fs) {
        fileSystemList.add(fs);
    }

    @Override
    public void ls() {
        System.out.println("[Directory] Going to loop through all Files and Directories in the list: " + fileSystemList.toString());
        for(FileSystem fs : fileSystemList) {
            System.out.println("[Directory] Inside FileSystem loop: " + fs.toString());
            fs.ls();
        }
    }
}
