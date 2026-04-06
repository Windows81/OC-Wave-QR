package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class SetsKt__SetsJVMKt {
    public static Set a(Set set) {
        Intrinsics.i(set, "builder");
        return ((SetBuilder) set).g();
    }

    public static Set b(int i2) {
        return new SetBuilder(i2);
    }

    public static Set c(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.h(singleton, "singleton(...)");
        return singleton;
    }
}
