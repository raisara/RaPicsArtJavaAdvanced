package folder_size;

import java.io.File;

public class Demo {

    public static long size;

    public static void main(String[] args) {

        String dir = "C:\\Windows";
        FolderService a = new FolderService();
        File file = a.getFileType(dir);

        Thread measure = new SizeThread(file);

        Thread show = new Thread(()->{
            while(measure.isAlive()){
                System.out.println(size + " bytes");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        show.start();
        measure.start();

    }
}