package generator.runtime;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private final Map<String,Object> values = new LinkedHashMap<>();
    private final Scope parent;

     public Scope() {
        this(null);
    }

    public Scope(Scope parent) {
        this.parent = parent;
    }
    
    /** Opens a nested scope {% for %} */
    public Scope child() {
        return new Scope(this);
    }

    public void set(String name, Object value) {
        values.put(name, value);
    }

    /** Looks here first, then walks outwards. Undefined names are null */
    public Object get(String name) {
        for (Scope s = this; s != null; s = s.parent) {
            if (s.values.containsKey(name)) {
                return s.values.get(name);
            }
        }
        return null;
    }

    /** Distinguishes "defined as null" from "never defined" */
    public boolean isDefined(String name) {
        for (Scope s = this; s != null; s = s.parent) {
            if (s.values.containsKey(name)) {
                return true;
            }
        }
        return false;
    }
}
