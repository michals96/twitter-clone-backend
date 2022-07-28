package twitter.core.message;

public class EvenOddService {
    public String isEvenOrOdd(Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
