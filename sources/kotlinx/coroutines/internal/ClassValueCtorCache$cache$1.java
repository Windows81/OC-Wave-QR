package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClassValueCtorCache$cache$1 extends ClassValue<Function1<? super Throwable, ? extends Throwable>> {
    /* renamed from: a */
    public Function1 computeValue(Class cls) {
        Intrinsics.g(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        return ExceptionsConstructorKt.g(cls);
    }
}
