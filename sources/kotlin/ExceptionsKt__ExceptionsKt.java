package kotlin;

import java.util.List;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ExceptionsKt__ExceptionsKt {
    public static void a(Throwable th, Throwable th2) {
        Intrinsics.i(th, "<this>");
        Intrinsics.i(th2, "exception");
        if (th != th2) {
            PlatformImplementationsKt.f40751a.a(th, th2);
        }
    }

    public static List b(Throwable th) {
        Intrinsics.i(th, "<this>");
        return PlatformImplementationsKt.f40751a.c(th);
    }
}
