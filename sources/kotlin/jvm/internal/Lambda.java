package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata
public abstract class Lambda<R> implements FunctionBase<R>, Serializable {
    private final int arity;

    public Lambda(int i2) {
        this.arity = i2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String l2 = Reflection.l(this);
        Intrinsics.h(l2, "renderLambdaToString(...)");
        return l2;
    }
}
