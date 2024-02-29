package fileManagement;

import java.io.File;

public abstract class FileManager {
    public abstract void writeToFile(File file, String data);
    public abstract String readFromFile(File file);
    public abstract void deleteFile(File file);
}
