package folder_size;

import java.io.File;

public class SizeThread extends Thread {
    public File file;
    public SizeThread(File file) {
        this.file=file;
    }

    @Override
    public void run() {
        FolderService.getFolderSize(file);
    }
}
