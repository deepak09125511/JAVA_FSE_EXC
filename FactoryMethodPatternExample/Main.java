interface Document{
    void open();
}

class wordDocument implements Document{
    void open(){
        System.out.println("Opening the word document");
    }
}
class pdfDocument implements Document{
    void open(){
        System.out.println("Opening the pdf document");
    }
}
class excelDocument implements Document{
    void open(){
        System.out.println("Opening the excel document");
    }
}
abstract class documentFactory{
    public abstract Document createDocument();
}

public class wordFactory extends documentFactory{
    public Document createDocument(){
        return new wordDocument();
    }
}
public class pdfFactory extends documentFactory{
    public Document createDocument(){
        return new pdfDocument();
    }
}
public class excelFactory extends documentFactory{
    public Document createDocument(){
        return new excelDocument();
    }
}

public class Main{
    public static void main(String[]args){
        Document wordFactory = new wordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        Document pdfFactory = new pdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        Document excelFactory = new pdfFactory();
        Document exel = excelFactory.createDocument();
        excel.open();

        //here we can see client is not directly creating the objects here subclasses factory
        //create objects for the required type for that we create object for the required factory
        //then this factory returns the new object for the required type and we use methods
        //in client side we create objects only for the factory only not for the those classes
        //the factory of respective classes like pdf,excel and word will create objects for those 
        //required document types
    }
}