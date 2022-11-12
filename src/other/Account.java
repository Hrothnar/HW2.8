package other;

import java.util.Arrays;

public class Account {

    public static boolean account(String login, String password, String confirmPassword) {
        try {
            return isLoginRight(login) && isPasswordRight(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static boolean isLoginRight(String login) throws WrongLoginException {
        if (login != null && !login.isBlank() && login.length() < 20) {
            boolean b = true;
            int j = 0;
            for (int i = 0; i < sign().length && j < login.length(); i++) {
                if (login.toLowerCase().charAt(j) == sign()[i]) {
                    i = -1;
                    j++;
                }
            }
            if (login.length() != j)
                b = false;
            if (!b)
                throw new WrongLoginException("Неправильный логин");
        }
        return true;
    }

    private static boolean isPasswordRight(String password, String confirmPassword) throws WrongPasswordException {
        if (password != null && !password.isBlank() && password.length() < 20) {
            boolean b = true;
            int j = 0;
            for (int i = 0; i < sign().length && j < password.length(); i++) {
                if (password.toLowerCase().charAt(j) == sign()[i]) {
                    i = -1;
                    j++;
                }
            }
            if (password.length() != j)
                b = false;
            if (!b)
                throw new WrongPasswordException("Неправильный пароль");
            if (!password.equals(confirmPassword))
                throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }


    private static char[] sign() {
        char[] sign = new char[1];
        int h = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            sign[h] = i;
            h++;
            sign = Arrays.copyOf(sign, sign.length + 1);
            if (i == 'z')
                for (char j = '0'; j <= '9'; j++) {
                    sign[h] = j;
                    h++;
                    sign = Arrays.copyOf(sign, sign.length + 1);
                    if (j == '9')
                        sign[sign.length - 1] = '_';
                }
        }
        return sign;
    }
}
