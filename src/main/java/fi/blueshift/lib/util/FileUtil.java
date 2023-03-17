package fi.blueshift.lib.util;

import java.io.InputStream;

@SuppressWarnings("unused")
public class FileUtil {
    /**
     * The resource URL is not working in the JAR
     * If we try to access a file that is inside a JAR,
     * It throws NoSuchFileException (linux), InvalidPathException (Windows)
     * <p>
     * Resource URL Sample: file:java-io.jar!/json/file1.json
     */
    public static InputStream getFileFromResourceAsStream(Class<?> aClass, String fileName) {
        // The class loader that loaded the class
        ClassLoader classLoader = aClass.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        }
        return inputStream;
    }
}
