
package com.mycompany.patrondiseno1;

import java.util.HashMap;
import java.util.Map;

public class ClonadorHeroe {
    private Map<Class<? extends PrototipoHeroe>, PrototipoHeroe> prototipos;

    public ClonadorHeroe() {
        prototipos = new HashMap<>();
    }

    public void registroPrototipo(Class<? extends PrototipoHeroe> heroClass, PrototipoHeroe prototype) {
        prototipos.put(heroClass, prototype);
    }

    public PrototipoHeroe cloneHero(Class<? extends PrototipoHeroe> heroClass) {
        PrototipoHeroe prototype = prototipos.get(heroClass);
        return prototype.clone();
    }
}
