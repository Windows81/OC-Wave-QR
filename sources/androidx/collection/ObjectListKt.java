package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ObjectListKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f1940a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final ObjectList f1941b = new MutableObjectList(0);

    public static final void d(List list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            RuntimeHelpersKt.c("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void e(List list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            RuntimeHelpersKt.a("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            RuntimeHelpersKt.c("fromIndex (" + i2 + ") is less than 0.");
        }
        if (i3 > size) {
            RuntimeHelpersKt.c("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final ObjectList f() {
        ObjectList objectList = f1941b;
        Intrinsics.g(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final MutableObjectList g(Object obj) {
        MutableObjectList mutableObjectList = new MutableObjectList(1);
        mutableObjectList.n(obj);
        return mutableObjectList;
    }

    public static final MutableObjectList h(Object obj, Object obj2) {
        MutableObjectList mutableObjectList = new MutableObjectList(2);
        mutableObjectList.n(obj);
        mutableObjectList.n(obj2);
        return mutableObjectList;
    }

    public static final ObjectList i(Object obj) {
        return g(obj);
    }
}
