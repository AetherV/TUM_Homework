package blatt11.exception;

public class NotEnoughLower extends NotEnoughLetter {
    public NotEnoughLower(int should, int is) {
        //TODO
        super(-1, -1);
    }

    @Override
    public String toString() {
        //TODO
        return this.getClass().getSimpleName();
    }
}
