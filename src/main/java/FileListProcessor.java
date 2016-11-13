import java.io.File;
import java.util.List;

/**
 * Created by jjzzz on 11/13/2016.
 */
public class FileListProcessor {
    private List<File> files;

    public FileListProcessor(List<File> files) {
        this.files = files;
    }
    public void delete(){
        files.forEach((file -> {
            boolean result=file.delete();
            if(result)
                System.out.println("FileListProcessor.delete : file deleted:"+file.getName());
            else
                System.out.println("FileListProcessor.delete : fail to delete:"+file.getAbsolutePath());
        }));
    }
}
