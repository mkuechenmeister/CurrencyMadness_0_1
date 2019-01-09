package at.km.currencyMadness.dao.DaoDemoOhneDDB;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements Dao<DaoUser> {

        private List<DaoUser> users = new ArrayList<>();

        public UserDao() {
            users.add(new DaoUser("John", "john@domain.com"));
            users.add(new DaoUser("Susan", "susan@domain.com"));
        }

        @Override
        public Optional<DaoUser> get(int id) {
            return Optional.ofNullable(users.get(id));
        }


    @Override
        public List<DaoUser> getAll() {
            return users;
        }

        @Override
        public void save(DaoUser user) {
            users.add(user);
        }

        @Override
        public void update(DaoUser user, String[] params) {
            user.setName(Objects.requireNonNull(
                    params[0], "Name cannot be null"));
            user.setEmail(Objects.requireNonNull(
                    params[1], "Email cannot be null"));

            users.add(user);
        }

        @Override
        public void delete(DaoUser user) {
            users.remove(user);
        }
    }

