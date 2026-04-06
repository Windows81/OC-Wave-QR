package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase<Object>, SuspendFunction {

    /* renamed from: A  reason: collision with root package name */
    public final int f40744A;

    public RestrictedSuspendLambda(int i2, Continuation continuation) {
        super(continuation);
        this.f40744A = i2;
    }

    public int getArity() {
        return this.f40744A;
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
