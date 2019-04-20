package chapter8;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(java.io.File.separator);

//        File file0 = new File("zoo.txt");
//        System.out.println(file0.exists());

        File file = new File("zoo.txt");
//        File file = new File("C:\\MY_DATA\\Info\\Practice\\ocp\\");
        System.out.println("File Exists: "+file.exists());
        if (file.exists()) {
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directory: "+file.isDirectory());
            System.out.println("Parent Path: "+file.getParent());
            if (file.isFile()) {
                System.out.println("File size: "+file.length());
                System.out.println("File LastModified: "+file.lastModified());
            } else {
                for (File subfile: file.listFiles()) {
                    System.out.println("\t"+subfile.getName());
                }
            }
        }
    }
}
