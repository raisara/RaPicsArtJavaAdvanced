package folder_size;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderService {
    //public static long size = 0;

    public static long getFolderSize(File file) {
        long size = 0;

        File[] files = file.listFiles();

        if(files != null){
            for(File x : files) {
                if (x.isFile()){
                    size += x.length();
                    Demo.size += x.length();
                }
                else
                    size += getFolderSize(x);

            }
        }
        //System.out.println(size);
        return size;

    }

    public File getFileType(String dir) {
        java.io.File file = new java.io.File(dir);
        return file;
    }

}
