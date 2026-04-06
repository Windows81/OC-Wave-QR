package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SerializersModuleKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerializersModule f42482a = new SerialModuleImpl(MapsKt.h(), MapsKt.h(), MapsKt.h(), MapsKt.h(), MapsKt.h(), false);

    public static final SerializersModule a() {
        return f42482a;
    }

    public static final SerializersModule b(SerializersModule serializersModule, SerializersModule serializersModule2) {
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(serializersModule2, "other");
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.g(serializersModule);
        serializersModuleBuilder.g(serializersModule2);
        return serializersModuleBuilder.f();
    }
}
