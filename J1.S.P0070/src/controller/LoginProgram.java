
package controller;

import java.util.Locale;
import repository.ILoginRepository;
import repository.LoginRepository;
import view.Menu;


public class LoginProgram extends Menu<String> {
    static String[] options = {"Vietnamese", "English", "Exit"};
    private ILoginRepository loginRepository;
    Locale vietnamese = new Locale("vi");
    Locale english = new Locale("en");
    public LoginProgram() {
        super("===== LOGIN PROGRAM =====", options);
        loginRepository = new LoginRepository();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: loginRepository.login(vietnamese);
            break;
            case 2: loginRepository.login(english);
            break;
            case 3: System.exit(0);
            break;
        }
    }

}