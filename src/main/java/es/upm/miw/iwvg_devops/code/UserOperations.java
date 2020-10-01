package es.upm.miw.iwvg_devops.code;

public class UserOperations {
    private UserDatabase userDatabase = new UserDatabase();

    public String findUserIdBySomeProperFraction(Fraction fraction) {
        if(fraction.isImproper()) return null;
        return userDatabase.findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fr -> fr.isEquivalent(fraction)))
                .map(User::getId)
                .findFirst()
                .orElse(null);
    }
}
