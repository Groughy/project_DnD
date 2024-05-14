package exceptions;

public class CantEquipItException extends Exception{
    public CantEquipItException() {
        super("Tu ne peux pas équiper cet objet.");
    }
}
