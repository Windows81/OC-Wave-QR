package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
public final class SerializersCacheKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerializerCache f42008a = CachingKt.a(new d());

    /* renamed from: b  reason: collision with root package name */
    public static final SerializerCache f42009b = CachingKt.a(new e());

    /* renamed from: c  reason: collision with root package name */
    public static final ParametrizedSerializerCache f42010c = CachingKt.b(new f());

    /* renamed from: d  reason: collision with root package name */
    public static final ParametrizedSerializerCache f42011d = CachingKt.b(new g());

    public static final KSerializer g(KClass kClass, List list) {
        Intrinsics.i(kClass, "clazz");
        Intrinsics.i(list, "types");
        List i2 = SerializersKt.i(SerializersModuleBuildersKt.a(), list, true);
        Intrinsics.f(i2);
        return SerializersKt.a(kClass, i2, new h(list));
    }

    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).g();
    }

    public static final KSerializer i(KClass kClass, List list) {
        KSerializer u2;
        Intrinsics.i(kClass, "clazz");
        Intrinsics.i(list, "types");
        List i2 = SerializersKt.i(SerializersModuleBuildersKt.a(), list, true);
        Intrinsics.f(i2);
        KSerializer a2 = SerializersKt.a(kClass, i2, new i(list));
        if (a2 == null || (u2 = BuiltinSerializersKt.u(a2)) == null) {
            return null;
        }
        return u2;
    }

    public static final KClassifier j(List list) {
        return ((KType) list.get(0)).g();
    }

    public static final KSerializer k(KClass kClass) {
        Intrinsics.i(kClass, "it");
        KSerializer e2 = SerializersKt.e(kClass);
        if (e2 != null) {
            return e2;
        }
        if (PlatformKt.l(kClass)) {
            return new PolymorphicSerializer(kClass);
        }
        return null;
    }

    public static final KSerializer l(KClass kClass) {
        KSerializer u2;
        Intrinsics.i(kClass, "it");
        KSerializer e2 = SerializersKt.e(kClass);
        if (e2 == null) {
            e2 = PlatformKt.l(kClass) ? new PolymorphicSerializer(kClass) : null;
        }
        if (e2 == null || (u2 = BuiltinSerializersKt.u(e2)) == null) {
            return null;
        }
        return u2;
    }

    public static final KSerializer m(KClass kClass, boolean z2) {
        Intrinsics.i(kClass, "clazz");
        if (z2) {
            return f42009b.a(kClass);
        }
        KSerializer a2 = f42008a.a(kClass);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public static final Object n(KClass kClass, List list, boolean z2) {
        Intrinsics.i(kClass, "clazz");
        Intrinsics.i(list, "types");
        return !z2 ? f42010c.a(kClass, list) : f42011d.a(kClass, list);
    }
}
