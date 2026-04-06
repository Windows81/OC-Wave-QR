package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ObjectIntMapKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableObjectIntMap f1936a = new MutableObjectIntMap(0);

    public static final ObjectIntMap a() {
        MutableObjectIntMap mutableObjectIntMap = f1936a;
        Intrinsics.g(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }

    public static final MutableObjectIntMap b() {
        return new MutableObjectIntMap(0, 1, (DefaultConstructorMarker) null);
    }
}
