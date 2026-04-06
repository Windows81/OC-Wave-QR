package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public abstract class SuspendLambda extends ContinuationImpl implements FunctionBase<Object>, SuspendFunction {
    public final int C;

    public SuspendLambda(int i2, Continuation continuation) {
        super(continuation);
        this.C = i2;
    }

    public int getArity() {
        return this.C;
    }

    public String toString() {
        if (v() != null) {
            return super.toString();
        }
        String k2 = Reflection.k(this);
        Intrinsics.h(k2, "renderLambdaToString(...)");
        return k2;
    }
}
