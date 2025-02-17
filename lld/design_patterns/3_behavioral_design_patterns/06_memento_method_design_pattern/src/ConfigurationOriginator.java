public class ConfigurationOriginator {

    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento mementoToBeRestored) {
        this.height = mementoToBeRestored.getHeight();
        this.width = mementoToBeRestored.getWidth();
    }

    @Override
    public String toString() {
        return "ConfigurationOriginator{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}