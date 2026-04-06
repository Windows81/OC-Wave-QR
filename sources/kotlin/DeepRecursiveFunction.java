package kotlin;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeepRecursiveFunction<T, R> {

    /* renamed from: a  reason: collision with root package name */
    public final Function3 f40494a;

    public DeepRecursiveFunction(Function3 function3) {
        Intrinsics.i(function3, "block");
        this.f40494a = function3;
    }

    public final Function3 a() {
        return this.f40494a;
    }
}
