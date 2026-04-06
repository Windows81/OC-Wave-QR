package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ScatterMapKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f1964a = {-9187201950435737345L, -1};

    /* renamed from: b  reason: collision with root package name */
    public static final MutableScatterMap f1965b = new MutableScatterMap(0);

    public static final ScatterMap a() {
        MutableScatterMap mutableScatterMap = f1965b;
        Intrinsics.g(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int b(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final MutableScatterMap c() {
        return new MutableScatterMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final int d(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return (i2 * 2) + 1;
    }

    public static final int e(int i2) {
        if (i2 > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final int f(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return i2 + ((i2 - 1) / 7);
    }
}
