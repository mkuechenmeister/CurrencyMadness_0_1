package at.km.currencyMadness.dao.DaoDemoOhneDDB;

import java.util.List;
import java.util.Optional;

public class DemoDaoApp {

    private static Dao userDao;

    public static void main(String[] args) {
        userDao = new UserDao();

        DaoUser user1 = getUser(0);
       // System.out.println(user1);
        userDao.update(user1, new String[]{"Jake", "jake@domain.com"});

        DaoUser user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new DaoUser("Julie", "julie@domain.com"));
        userDao.save(new DaoUser("Julie", "julie@domain.com"));
        userDao.save(new DaoUser("Julie", "julie@domain.com"));
        userDao.save(new DaoUser("Julie", "julie@domain.com"));

      //userDao.getAll().forEach(user -> System.out.println(user.getName()));


      List<DaoUser> ulist = userDao.getAll();
        for (DaoUser user:ulist
             ) {
            System.out.println(user.getName());

        }
        System.out.println(ulist.size());
    }

    private static DaoUser getUser(int id) {
        Optional<DaoUser> user = userDao.get(id);

        return user.orElseGet(
                () -> new DaoUser("non-existing user", "no-email"));
    }
}
