package es.upm.miw.iwvg_devops.code;

public class UserOperations {
    private UserDatabase userDatabase = new UserDatabase();

    public String findUserIdBySomeProperFraction(Fraction fraction) {
        assert fraction.isProper();
        return userDatabase.findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fr -> fr.equals(fraction)))
                .map(User::getId)
                .findFirst()
                .orElse(null);
    }
}
