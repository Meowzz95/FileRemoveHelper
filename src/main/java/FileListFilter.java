import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjzzz on 11/13/2016.
 */
public class FileListFilter {
    private List<File> files;

    public FileListFilter(List<File> files) {
        this.files = files;
    }
    public FileListProcessor startWith(String str){
        List<File> filteredList=new ArrayList<>();
        files.forEach((file -> {
            if (file.getName().startsWith(str)) {
                filteredList.add(file);
                System.out.println("FileListFilter.startWith : match found :" + file.getName());
            }
        }));
        return new FileListProcessor(filteredList);

    }
}
