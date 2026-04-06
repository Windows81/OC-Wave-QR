package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class B implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f14535z;

    public /* synthetic */ B(Function1 function1) {
        this.f14535z = function1;
    }

    public final Object m(Object obj, Object obj2) {
        return Updater.f(this.f14535z, obj, (Unit) obj2);
    }
}
