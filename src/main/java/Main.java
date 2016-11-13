import javax.swing.*;
import java.io.File;
import java.util.List;

/**
 * Created by jjzzz on 11/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        if(args.length!=2){
            JOptionPane.showMessageDialog(null,"Invalid arguments","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String root=args[0];
        boolean allowRecursive=false;
        if(args[1].equals("1"))
            allowRecursive=true;


        new FileListFilter(new FileListSearcher(root,true).start()).startWith("._").delete();
    }
}
