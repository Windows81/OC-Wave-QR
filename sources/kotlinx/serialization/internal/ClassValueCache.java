package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata
final class ClassValueCache<T> implements SerializerCache<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f42087a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassValueReferences f42088b = new ClassValueReferences();

    public ClassValueCache(Function1 function1) {
        Intrinsics.i(function1, "compute");
        this.f42087a = function1;
    }

    public KSerializer a(KClass kClass) {
        Intrinsics.i(kClass, "key");
        Object a2 = this.f42088b.get(JvmClassMappingKt.a(kClass));
        Intrinsics.h(a2, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) a2;
        Object obj = mutableSoftReference.f42153a.get();
        if (obj == null) {
            obj = mutableSoftReference.a(new ClassValueCache$get$$inlined$getOrSet$1(this, kClass));
        }
        return ((CacheEntry) obj).f42080a;
    }

    public final Function1 b() {
        return this.f42087a;
    }
}
