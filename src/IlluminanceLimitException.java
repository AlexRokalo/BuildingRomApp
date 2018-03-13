public class IlluminanceLimitException extends Throwable {
    IlluminanceLimitException() {
        System.out.println("Превышен лимит света 4000 лк.");
    }
}