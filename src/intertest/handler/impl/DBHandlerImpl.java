package intertest.handler.impl;

import intertest.handler.IDataHandler;
import intertest.entity.User;

public class DBHandlerImpl implements IDataHandler {
    @Override
    public void delete(User user) {
        System.out.println("User was deleted from DB");
    }

    @Override
    public User update(User user) {
        System.out.println("User was updated in DB");
        return null;
    }

    @Override
    public void save(User user) {
        System.out.println("User was saved to DB");

    }

    @Override
    public User get(long id) {
        System.out.println("We got needed user from DB");
        return new User(23, "Gregory");
    }
}
