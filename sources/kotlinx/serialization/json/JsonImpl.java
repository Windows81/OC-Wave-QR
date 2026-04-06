package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.PolymorphismValidator;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
final class JsonImpl extends Json {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonImpl(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        super(jsonConfiguration, serializersModule, (DefaultConstructorMarker) null);
        Intrinsics.i(jsonConfiguration, "configuration");
        Intrinsics.i(serializersModule, "module");
        i();
    }

    public final void i() {
        if (!Intrinsics.d(a(), SerializersModuleBuildersKt.a())) {
            a().a(new PolymorphismValidator(g().p(), g().e()));
        }
    }
}
