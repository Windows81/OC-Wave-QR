package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LongObjectMapKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableLongObjectMap f1834a = new MutableLongObjectMap(0);

    public static final LongObjectMap a() {
        MutableLongObjectMap mutableLongObjectMap = f1834a;
        Intrinsics.g(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return mutableLongObjectMap;
    }

    public static final LongObjectMap b(long j2, Object obj) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, (DefaultConstructorMarker) null);
        mutableLongObjectMap.r(j2, obj);
        return mutableLongObjectMap;
    }

    public static final MutableLongObjectMap c() {
        return new MutableLongObjectMap(0, 1, (DefaultConstructorMarker) null);
    }
}
