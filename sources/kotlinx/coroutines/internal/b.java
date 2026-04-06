package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Constructor f41889z;

    public /* synthetic */ b(Constructor constructor) {
        this.f41889z = constructor;
    }

    public final Object invoke(Object obj) {
        return ExceptionsConstructorKt.i(this.f41889z, (Throwable) obj);
    }
}
