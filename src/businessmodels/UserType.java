package businessmodels;

import java.util.ArrayList;
import java.util.List;

public abstract class UserType {
    protected List<String> types;
    public UserType(){
        types = new ArrayList<>();
    }
    public abstract List<String> getTypes();
    public abstract String selectType(int index);
}
