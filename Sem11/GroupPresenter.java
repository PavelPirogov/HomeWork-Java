
import java.util.List;
import java.util.UUID;

public class GroupPresenter {
    private final GroupModel model;

    public GroupPresenter(GroupModel model) {
        this.model = model;
    }

    public void create(Integer number) {
        model.create(number);
    }

    public List<Group> getAll() {
        return model.getAll();
    }

    public Group getByNumber(Integer number) {
        return model.getByNumber(number);
    }

    public UUID getId(Integer number) {
        return model.getByNumber(number).getUUID();
    }
}

