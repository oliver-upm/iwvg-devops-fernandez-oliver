package es.upm.miw.iwvg_devops.code;

import java.util.Objects;
import java.util.stream.Stream;

public class Searches {

    public Fraction findFirstProperFractionByUserId(String id) {
        return new UserDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .filter(Fraction::isProper)
                .findFirst()
                .orElse(null);
    }

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UserDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isProper))
                .map(User::getFamilyName)
                .map(name -> name.substring(0, 1));
    }

    public Stream<Double> findDecimalFractionByUserName(String name) {
        return new UserDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .map(Fraction::decimal);
    }

    public Fraction findFractionDivisionByUserId(String id) {
        return new UserDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .reduce(Fraction::divide)
                .orElse(null);
    }

}
