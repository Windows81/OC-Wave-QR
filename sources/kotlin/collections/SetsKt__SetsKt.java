package kotlin.collections;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    public static Set d() {
        return EmptySet.f40617z;
    }

    public static final Set e(Set set) {
        Intrinsics.i(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : SetsKt.c(set.iterator().next()) : SetsKt.d();
    }

    public static Set f(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return ArraysKt___ArraysKt.i1(objArr);
    }
}
