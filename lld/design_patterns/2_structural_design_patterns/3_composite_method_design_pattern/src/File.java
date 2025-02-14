public class File implements FileSystem {
    @Override
    public void ls() {
        System.out.println("[File] Printing file name");
    }
}
