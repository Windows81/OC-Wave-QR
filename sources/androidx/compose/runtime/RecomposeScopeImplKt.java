package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class RecomposeScopeImplKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f14787a = new Object();

    public static final int a(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & -920350135) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }
}
