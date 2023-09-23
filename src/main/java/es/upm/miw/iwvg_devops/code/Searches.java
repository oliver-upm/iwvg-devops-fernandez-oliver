package es.upm.miw.iwvg_devops.code;

import java.util.Objects;

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

}
