package folder_size;

import java.io.File;

public class SizeThread extends Thread{
    public static long foldersize;

    @Override
    public void run() {
        System.out.println(FolderService.getFolderSize(new File("C:\\Windows")));
    }
}
