package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class ListSaverKt {
    public static final Saver b(Function2 function2, Function1 function1) {
        a aVar = new a(function2);
        Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.e(aVar, (Function1) TypeIntrinsics.e(function1, 1));
    }

    public static final Object c(Function2 function2, SaverScope saverScope, Object obj) {
        List list = (List) function2.m(saverScope, obj);
        Collection collection = list;
        int size = collection.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = list.get(i2);
            if (obj2 == null || saverScope.b(obj2)) {
                i2++;
            } else {
                throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj2).toString());
            }
        }
        if (!collection.isEmpty()) {
            return new ArrayList(collection);
        }
        return null;
    }
}
