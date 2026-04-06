package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata
public final class ClassValueCache$get$$inlined$getOrSet$1 implements Function0<T> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KClass f42089A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClassValueCache f42090z;

    public ClassValueCache$get$$inlined$getOrSet$1(ClassValueCache classValueCache, KClass kClass) {
        this.f42090z = classValueCache;
        this.f42089A = kClass;
    }

    public final Object invoke() {
        return new CacheEntry((KSerializer) this.f42090z.b().invoke(this.f42089A));
    }
}
