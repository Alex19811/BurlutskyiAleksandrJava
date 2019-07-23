package intertest.handler.impl;

import intertest.entity.User;
import intertest.handler.IDataHandler;

public class FileHandlerImpl implements IDataHandler {
    @Override
    public void delete(User user) {
        System.out.println("User was deleted from file");
    }

    @Override
    public User update(User user) {
        System.out.println("User was updated in file");
        return null;
    }

    @Override
    public void save(User user) {
        System.out.println("User was saved to file");
    }

    @Override
    public User get(long id) {
        System.out.println("We got needed user from file");
        return new User(32, "John");
    }
}
