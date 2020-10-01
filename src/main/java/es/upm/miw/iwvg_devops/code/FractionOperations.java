package es.upm.miw.iwvg_devops.code;

import java.util.Optional;

public class FractionOperations {
    public Fraction findFirstProperFractionByUserId(String id) {
        return new UserDatabase().findById(id)
                .flatMap(user -> user.getFractions().stream().filter(Fraction::isProper).findFirst())
                .orElse(null);
    }

    public double findFractionAdditionByUserId(String id) {
        Optional<User> user = new UserDatabase().findById(id);
        return user.map(value -> value.getFractions().stream()
                .map(Fraction::decimal)
                .reduce(Double::sum)
                .orElse(0.0))
                .orElse(0.0);
    }
}
