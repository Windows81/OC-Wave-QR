package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata
public final class DefaultExecutorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f41392a = SystemPropsKt.f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b  reason: collision with root package name */
    public static final Delay f41393b = b();

    public static final Delay a() {
        return f41393b;
    }

    public static final Delay b() {
        if (!f41392a) {
            return DefaultExecutor.H;
        }
        MainCoroutineDispatcher c2 = Dispatchers.c();
        return (MainDispatchersKt.c(c2) || !(c2 instanceof Delay)) ? DefaultExecutor.H : (Delay) c2;
    }
}
