package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Constructor f41888z;

    public /* synthetic */ a(Constructor constructor) {
        this.f41888z = constructor;
    }

    public final Object invoke(Object obj) {
        return ExceptionsConstructorKt.h(this.f41888z, (Throwable) obj);
    }
}
