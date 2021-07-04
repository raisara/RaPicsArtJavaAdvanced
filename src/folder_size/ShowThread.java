package folder_size;

import java.io.File;

public class ShowThread extends Thread{
    public File file;

    public ShowThread(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println(FolderService.getFolderSize(file) + " bytes");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
