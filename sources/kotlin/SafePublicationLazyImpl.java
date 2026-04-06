package kotlin;

import androidx.concurrent.futures.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "A");

    /* renamed from: A  reason: collision with root package name */
    public volatile Object f40522A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f40523B;

    /* renamed from: z  reason: collision with root package name */
    public volatile Function0 f40524z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SafePublicationLazyImpl(Function0 function0) {
        Intrinsics.i(function0, "initializer");
        this.f40524z = function0;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f40546a;
        this.f40522A = uninitialized_value;
        this.f40523B = uninitialized_value;
    }

    public boolean b() {
        return this.f40522A != UNINITIALIZED_VALUE.f40546a;
    }

    public Object getValue() {
        Object obj = this.f40522A;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f40546a;
        if (obj != uninitialized_value) {
            return obj;
        }
        Function0 function0 = this.f40524z;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (a.a(D, this, uninitialized_value, invoke)) {
                this.f40524z = null;
                return invoke;
            }
        }
        return this.f40522A;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
