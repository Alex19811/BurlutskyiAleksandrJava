package intertest;

import intertest.entity.User;
import intertest.handler.IDataHandler;

public class UserService {

    IDataHandler handler;

    public UserService(IDataHandler dataHandler) {
        this.handler = dataHandler;
    }

    public void updateUser(Long id, String name, int age) {
        User user = handler.get(id);
        user.setAge(age);
        user.setName(name);
        handler.update(user);
    }

}
