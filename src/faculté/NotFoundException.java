package faculté;

public class NotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "Not found element";
    }
}
