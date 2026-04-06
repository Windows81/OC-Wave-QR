package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext.Element f40714A;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f40715z;

    @Metadata
    public static final class Serialized implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public static final Companion f40716z = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }
    }

    public CombinedContext(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        Intrinsics.i(coroutineContext, "left");
        Intrinsics.i(element, "element");
        this.f40715z = coroutineContext;
        this.f40714A = element;
    }

    private final int i() {
        int i2 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f40715z;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i2;
            }
            i2++;
        }
    }

    public static final String n(String str, CoroutineContext.Element element) {
        Intrinsics.i(str, "acc");
        Intrinsics.i(element, "element");
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        Intrinsics.i(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext.Element d2 = combinedContext.f40714A.d(key);
            if (d2 != null) {
                return d2;
            }
            CoroutineContext coroutineContext = combinedContext.f40715z;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.d(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.i() != i() || !combinedContext.h(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(CoroutineContext.Element element) {
        return Intrinsics.d(d(element.getKey()), element);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        Intrinsics.i(key, "key");
        if (this.f40714A.d(key) != null) {
            return this.f40715z;
        }
        CoroutineContext g2 = this.f40715z.g(key);
        return g2 == this.f40715z ? this : g2 == EmptyCoroutineContext.f40721z ? this.f40714A : new CombinedContext(g2, this.f40714A);
    }

    public final boolean h(CombinedContext combinedContext) {
        while (f(combinedContext.f40714A)) {
            CoroutineContext coroutineContext = combinedContext.f40715z;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                Intrinsics.g(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return f((CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f40715z.hashCode() + this.f40714A.hashCode();
    }

    public Object k(Object obj, Function2 function2) {
        Intrinsics.i(function2, "operation");
        return function2.m(this.f40715z.k(obj, function2), this.f40714A);
    }

    public String toString() {
        return '[' + ((String) k("", new a())) + ']';
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.b(this, coroutineContext);
    }
}
