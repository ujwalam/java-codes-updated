import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class SearchWorker extends Thread {

    String fileName;
    Queue<File> filesQueue;
    List<File> results;
    public SearchWorker(String fileName, Queue<File> filesQueue, List<File> results) {
        super();
        this.fileName = fileName;
        this.filesQueue = filesQueue;
        this.results = results;
    }
    
    @Override
    public void run() {
        while(true) {
            File aFileOrFolder = filesQueue.poll();
            if(aFileOrFolder == null) {
                break;
            }
            if(aFileOrFolder.isFile() && aFileOrFolder.getName().equalsIgnoreCase(fileName)) {
                results.add(aFileOrFolder);
            }else if(aFileOrFolder.isDirectory() && aFileOrFolder.canRead()) {
                File[] contents = aFileOrFolder.listFiles();
                filesQueue.addAll(Arrays.asList(contents));
            }
        }
    }
}

