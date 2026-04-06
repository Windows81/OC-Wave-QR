package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ExtensionsKt {
    public static final boolean a(ObjectList objectList, Function1 function1) {
        if (objectList.e() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) function1.invoke(objectList.d(0));
        if (comparable == null) {
            return false;
        }
        int e2 = objectList.e();
        int i2 = 1;
        while (i2 < e2) {
            Comparable comparable2 = (Comparable) function1.invoke(objectList.d(i2));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i2++;
            comparable = comparable2;
        }
        return true;
    }

    public static final Object b(MutableObjectList mutableObjectList) {
        if (!mutableObjectList.g()) {
            int e2 = mutableObjectList.e() - 1;
            Object d2 = mutableObjectList.d(e2);
            mutableObjectList.A(e2);
            return d2;
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void c(MutableObjectList mutableObjectList, Function1 function1) {
        List s2 = mutableObjectList.s();
        if (s2.size() > 1) {
            CollectionsKt.A(s2, new ExtensionsKt$sortBy$$inlined$sortBy$1(function1));
        }
    }

    public static final ObjectList d(ObjectList objectList, Function1 function1) {
        if (a(objectList, function1)) {
            return objectList;
        }
        MutableObjectList e2 = e(objectList);
        c(e2, function1);
        return e2;
    }

    public static final MutableObjectList e(ObjectList objectList) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.e());
        Object[] objArr = objectList.f1937a;
        int i2 = objectList.f1938b;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableObjectList.n(objArr[i3]);
        }
        return mutableObjectList;
    }
}
