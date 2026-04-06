package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f41892z;

    public /* synthetic */ e(Function1 function1) {
        this.f41892z = function1;
    }

    public final Object invoke(Object obj) {
        return ExceptionsConstructorKt.p(this.f41892z, (Throwable) obj);
    }
}
