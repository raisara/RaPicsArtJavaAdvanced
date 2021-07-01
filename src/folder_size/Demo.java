package folder_size;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String dir = "C:\\Windows";
        FolderService a = new FolderService();
        File file = a.getFileType(dir);
        long size = a.getFolderSize(file);



        System.out.println(size+" bytes");
    }
}
