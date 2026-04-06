package kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.implementations.immutableList.UtilsKt;

@Metadata
public final class ExtensionsKt {
    public static final PersistentList a() {
        return UtilsKt.b();
    }

    public static final PersistentList b(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return UtilsKt.b().addAll(ArraysKt.d(objArr));
    }

    public static final PersistentList c(PersistentList persistentList, Iterable iterable) {
        Intrinsics.i(persistentList, "<this>");
        Intrinsics.i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection) iterable);
        }
        PersistentList.Builder l2 = persistentList.l();
        CollectionsKt.B(l2, iterable);
        return l2.d();
    }

    public static final ImmutableList d(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        ImmutableList immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? e(iterable) : immutableList;
    }

    public static final PersistentList e(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        PersistentList persistentList = null;
        PersistentList persistentList2 = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList2 != null) {
            return persistentList2;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        if (builder != null) {
            persistentList = builder.d();
        }
        return persistentList == null ? c(a(), iterable) : persistentList;
    }
}
