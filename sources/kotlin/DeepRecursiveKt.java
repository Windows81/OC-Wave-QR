package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeepRecursiveKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f40495a = Result.b(IntrinsicsKt.f());

    static {
        Result.Companion companion = Result.f40519A;
    }

    public static final Object b(DeepRecursiveFunction deepRecursiveFunction, Object obj) {
        Intrinsics.i(deepRecursiveFunction, "<this>");
        return new DeepRecursiveScopeImpl(deepRecursiveFunction.a(), obj).g();
    }
}
