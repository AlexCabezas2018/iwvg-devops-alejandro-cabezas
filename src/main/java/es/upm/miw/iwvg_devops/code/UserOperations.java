package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class UserOperations {
    private UserDatabase userDatabase = new UserDatabase();

    public String findUserIdBySomeProperFraction(Fraction fraction) {
        if(fraction.isImproper()) throw new AssertionError();
        return findUsersWhichContainsFraction(fraction)
                .map(User::getId)
                .findFirst()
                .orElse(null);
    }

    public String findUserNameBySomeImproperFraction(Fraction fraction) {
        if(fraction.isProper()) throw new AssertionError();
        return findUsersWhichContainsFraction(fraction)
                .map(User::getName)
                .findFirst()
                .orElse(null);
    }

    private Stream<User> findUsersWhichContainsFraction(Fraction fraction) {
        return userDatabase.findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fr -> fr.equals(fraction)));
    }
}
