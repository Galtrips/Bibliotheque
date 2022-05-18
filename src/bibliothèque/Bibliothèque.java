package bibliothèque;

public class Bibliothèque {

    public static void main(String[] args) throws AgeException {
        ListeAdherents index = new ListeAdherents();
        index.add("test", "test", 2010);
        index.add("test", "test", 2010);
        index.add("test", "test", 2010);
        index.add("test", "test", 2010);
        
        System.out.println(index.adherentBornInYear(2010));
    }
}
