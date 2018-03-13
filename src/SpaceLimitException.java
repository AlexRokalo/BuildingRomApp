public class SpaceLimitException extends Exception {
    SpaceLimitException() {
        System.out.println("Превышен лимит в площади!");
    }
}