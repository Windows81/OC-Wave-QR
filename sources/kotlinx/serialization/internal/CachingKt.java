package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CachingKt {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f42081a;

    static {
        boolean z2;
        try {
            Class.forName("java.lang.ClassValue");
            z2 = true;
        } catch (Throwable unused) {
            z2 = false;
        }
        f42081a = z2;
    }

    public static final SerializerCache a(Function1 function1) {
        Intrinsics.i(function1, "factory");
        return f42081a ? new ClassValueCache(function1) : new ConcurrentHashMapCache(function1);
    }

    public static final ParametrizedSerializerCache b(Function2 function2) {
        Intrinsics.i(function2, "factory");
        return f42081a ? new ClassValueParametrizedCache(function2) : new ConcurrentHashMapParametrizedCache(function2);
    }
}
