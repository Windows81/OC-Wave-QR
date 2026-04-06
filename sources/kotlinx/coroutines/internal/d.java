package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Constructor f41891z;

    public /* synthetic */ d(Constructor constructor) {
        this.f41891z = constructor;
    }

    public final Object invoke(Object obj) {
        return ExceptionsConstructorKt.k(this.f41891z, (Throwable) obj);
    }
}
