package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public volatile Object f40525A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f40526B;

    /* renamed from: z  reason: collision with root package name */
    public Function0 f40527z;

    public SynchronizedLazyImpl(Function0 function0, Object obj) {
        Intrinsics.i(function0, "initializer");
        this.f40527z = function0;
        this.f40525A = UNINITIALIZED_VALUE.f40546a;
        this.f40526B = obj == null ? this : obj;
    }

    public boolean b() {
        return this.f40525A != UNINITIALIZED_VALUE.f40546a;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f40525A;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f40546a;
        if (obj2 != uninitialized_value) {
            return obj2;
        }
        synchronized (this.f40526B) {
            obj = this.f40525A;
            if (obj == uninitialized_value) {
                Function0 function0 = this.f40527z;
                Intrinsics.f(function0);
                obj = function0.invoke();
                this.f40525A = obj;
                this.f40527z = null;
            }
        }
        return obj;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SynchronizedLazyImpl(Function0 function0, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i2 & 2) != 0 ? null : obj);
    }
}
