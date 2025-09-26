package Chapter10;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ExploreFiles {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("");
    }
}
