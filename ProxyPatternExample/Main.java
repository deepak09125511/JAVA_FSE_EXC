interface image{
    void display();
}

class realImage implements image {
    private String fileName;

    public realImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("loading image: " + fileName);
    }

    public void display() {
        System.out.println("displaying image: " + fileName);
    }
}
class proxyImage implements image {

    private String fileName;
    private realImage realImage;

    public proxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {

        if (realImage == null) {
            realImage = new realImage(fileName);
        }

        realImage.display();
    }
}
public class Main {
    public static void main(String[] args) {

        image img1 = new proxyImage("photo1");
        System.out.println("first: ");
        img1.display();

        System.out.println("second:");
        img1.display();
    }
}