package kotlin.jvm.internal;

import java.io.Serializable;

public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {
    public final Class I;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunInterfaceConstructorReference)) {
            return false;
        }
        return this.I.equals(((FunInterfaceConstructorReference) obj).I);
    }

    public int hashCode() {
        return this.I.hashCode();
    }

    public String toString() {
        return "fun interface " + this.I.getName();
    }
}
