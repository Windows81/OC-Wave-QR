package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class PrimitivesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f42186a = PlatformKt.i();

    public static final SerialDescriptor a(String str, PrimitiveKind primitiveKind) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(primitiveKind, "kind");
        c(str);
        return new PrimitiveSerialDescriptor(str, primitiveKind);
    }

    public static final KSerializer b(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        return (KSerializer) f42186a.get(kClass);
    }

    public static final void c(String str) {
        for (KSerializer kSerializer : f42186a.values()) {
            if (Intrinsics.d(str, kSerializer.a().a())) {
                throw new IllegalArgumentException(StringsKt.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + Reflection.b(kSerializer.getClass()).e() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
