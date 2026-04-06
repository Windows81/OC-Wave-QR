package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f15218z;

    public /* synthetic */ a(Function2 function2) {
        this.f15218z = function2;
    }

    public final Object m(Object obj, Object obj2) {
        return ListSaverKt.c(this.f15218z, (SaverScope) obj, obj2);
    }
}
