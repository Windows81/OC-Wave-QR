package androidx.compose.ui.internal;

import kotlin.Metadata;

@Metadata
public final class InlineClassHelperKt {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void d(String str) {
        throw new IllegalStateException(str);
    }

    public static final void e(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void f(String str) {
        throw new UnsupportedOperationException(str);
    }
}
