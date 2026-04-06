package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ScatterSetKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableScatterSet f1971a = new MutableScatterSet(0);

    public static final MutableScatterSet a() {
        return new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableScatterSet b(Object obj, Object obj2) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(2);
        mutableScatterSet.x(obj);
        mutableScatterSet.x(obj2);
        return mutableScatterSet;
    }
}
