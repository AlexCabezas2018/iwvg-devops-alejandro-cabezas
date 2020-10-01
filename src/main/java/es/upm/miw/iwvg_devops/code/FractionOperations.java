package es.upm.miw.iwvg_devops.code;

public class FractionOperations {
    public Fraction findFirstProperFractionByUserId(String id) {
        return new UserDatabase().findById(id)
                .flatMap(user -> user.getFractions().stream().filter(Fraction::isProper).findFirst())
                .orElse(null);
    }

}
