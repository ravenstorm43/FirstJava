package week04.sample01;

public class OurClass {
    private final boolean just = true;

    // throws : 예외를 던지다(발생시키다)
    public void thisMethodIsDangerous () throws OurBadException {
        if (just) {
            throw new OurBadException();
        }
    }
}
