import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjzzz on 11/13/2016.
 */
public class FileListSearcher {
    private String rootFolder;
    private boolean allowRecursive;
    private List<File> fileList;

    public FileListSearcher(String rootFolder, boolean allowRecursive) {
        this.rootFolder = rootFolder;
        this.allowRecursive = allowRecursive;
        fileList=new ArrayList<File>();
    }
    public List<File> start(){
        startListing(new File(rootFolder));
        System.out.println("FileListSearcher.startListing : Listing done, total files found:"+fileList.size());
        return fileList;
    }

    private void startListing(File root){
        File[] files=root.listFiles();
        for(File c:files){
            if(c.isDirectory()&&allowRecursive)
                startListing(c);
            else {
                fileList.add(c);
                System.out.println("FileListSearcher.startListing : File found >"+c.getAbsolutePath());
            }
        }

    }
}
