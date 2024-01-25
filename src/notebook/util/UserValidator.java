package notebook.util;

public class UserValidator {
    public String isNameValid (String name){
        if (name.isEmpty()){
            throw new RuntimeException("you didn't enter data");
        }
        return name.trim().replaceAll(" ", "");
    }
}
