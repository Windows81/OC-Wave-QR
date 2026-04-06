package io.realm;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

class DictionaryManager<V> extends ManagedMapManager<String, V> {
    public MapChangeSet a(long j2) {
        return new StringMapChangeSet(j2);
    }

    public boolean b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed when calling 'containsKey'.");
        } else if (c(obj, String.class)) {
            return this.f39901z.b(obj);
        } else {
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
    }

    public void e(Map map) {
        for (Map.Entry key : map.entrySet()) {
            if (((String) key.getKey()) == null) {
                throw new NullPointerException("Null keys are not allowed.");
            }
        }
    }

    public Set entrySet() {
        return this.f39901z.e();
    }

    /* renamed from: f */
    public Object put(String str, Object obj) {
        if (str != null) {
            try {
                return this.f39901z.i(str, obj);
            } catch (IllegalStateException e2) {
                String message = e2.getMessage();
                Objects.requireNonNull(message);
                if (message.contains("Data type mismatch")) {
                    throw new NullPointerException("Cannot insert null values in a dictionary marked with '@Required'.");
                }
                throw e2;
            }
        } else {
            throw new NullPointerException("Null keys are not allowed.");
        }
    }

    public Object get(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed when calling 'get'.");
        } else if (c(obj, String.class)) {
            return this.f39901z.f((String) obj);
        } else {
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
    }
}
