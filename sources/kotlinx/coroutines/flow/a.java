package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f41777z;

    public /* synthetic */ a(Function1 function1) {
        this.f41777z = function1;
    }

    public final Object invoke(Object obj) {
        return Long.valueOf(FlowKt__DelayKt.b(this.f41777z, obj));
    }
}
