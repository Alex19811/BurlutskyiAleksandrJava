package intertest.handler;

import intertest.entity.User;

public interface IDataHandler {
    void delete(User user);
    User update(User user);
    void save(User user);
    User get(long id);
}
