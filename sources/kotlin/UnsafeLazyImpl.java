package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public Object f40553A = UNINITIALIZED_VALUE.f40546a;

    /* renamed from: z  reason: collision with root package name */
    public Function0 f40554z;

    public UnsafeLazyImpl(Function0 function0) {
        Intrinsics.i(function0, "initializer");
        this.f40554z = function0;
    }

    public boolean b() {
        return this.f40553A != UNINITIALIZED_VALUE.f40546a;
    }

    public Object getValue() {
        if (this.f40553A == UNINITIALIZED_VALUE.f40546a) {
            Function0 function0 = this.f40554z;
            Intrinsics.f(function0);
            this.f40553A = function0.invoke();
            this.f40554z = null;
        }
        return this.f40553A;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
