package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Constructor f41890z;

    public /* synthetic */ c(Constructor constructor) {
        this.f41890z = constructor;
    }

    public final Object invoke(Object obj) {
        return ExceptionsConstructorKt.j(this.f41890z, (Throwable) obj);
    }
}
