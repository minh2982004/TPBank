
package repository;

import dataAccess.LoginBankDao;
import java.util.Locale;


public class LoginRepository implements ILoginRepository {

    @Override
    public void login(Locale language) {
        LoginBankDao.Instance().login(language);
    }  
}