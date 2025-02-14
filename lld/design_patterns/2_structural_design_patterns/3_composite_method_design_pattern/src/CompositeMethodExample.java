public class CompositeMethodExample {
    public static void main(String[] args) {
        Directory parentDir = new Directory();
        FileSystem file1 = new File();
        parentDir.add(file1);

        Directory childDir = new Directory();
        FileSystem file2 = new File();
        childDir.add(file2);

        parentDir.add(childDir);

        parentDir.ls();
    }
}