package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SaverKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Saver f15215a = e(new m(), new n());

    public static final Object c(SaverScope saverScope, Object obj) {
        return obj;
    }

    public static final Object d(Object obj) {
        return obj;
    }

    public static final Saver e(Function2 function2, Function1 function1) {
        return new SaverKt$Saver$1(function2, function1);
    }

    public static final Saver f() {
        Saver saver = f15215a;
        Intrinsics.g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
