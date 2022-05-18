package bibliothèque;

public class AgeException extends Exception{
    public AgeException() {
        super("L'utilisateur doit être né après 2010 !");
    }
}
