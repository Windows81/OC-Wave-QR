package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RuntimeHelpersKt {
    public static final void a(String str) {
        Intrinsics.i(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        Intrinsics.i(str, "message");
        throw new IllegalStateException(str);
    }

    public static final void c(String str) {
        Intrinsics.i(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void d(String str) {
        Intrinsics.i(str, "message");
        throw new NoSuchElementException(str);
    }
}
