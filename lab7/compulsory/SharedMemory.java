package lab7.compulsory;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SharedMemory {
    private List<Token> tokens;

    public SharedMemory(int n) {
        tokens = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            tokens.add(new Token(i));
        }
        Collections.shuffle(tokens);
    }

    public boolean isEmpty() {
        return tokens.isEmpty();
    }

    public synchronized Token remove(int index) {
        return tokens.remove(index);
    }
}
