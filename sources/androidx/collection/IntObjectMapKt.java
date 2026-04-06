package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IntObjectMapKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableIntObjectMap f1797a = new MutableIntObjectMap(0);

    public static final IntObjectMap a() {
        MutableIntObjectMap mutableIntObjectMap = f1797a;
        Intrinsics.g(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    public static final IntObjectMap b() {
        MutableIntObjectMap mutableIntObjectMap = f1797a;
        Intrinsics.g(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    public static final MutableIntObjectMap c() {
        return new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableIntObjectMap d(int i2, Object obj, int i3, Object obj2, int i4, Object obj3) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
        mutableIntObjectMap.r(i2, obj);
        mutableIntObjectMap.r(i3, obj2);
        mutableIntObjectMap.r(i4, obj3);
        return mutableIntObjectMap;
    }
}
