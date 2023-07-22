
import java.util.UUID;

public class Group {
    private final UUID id;
    private final Integer number;

    public Group(Integer number) {
        this.id = UUID.randomUUID();
        this.number = number;
    }

    public UUID getUUID() {
        return this.id;
    }

    public Integer getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "[" + id + "] - " + number;
    }
}
