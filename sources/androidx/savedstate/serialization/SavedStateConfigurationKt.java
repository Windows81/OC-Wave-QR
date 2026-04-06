package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.serialization.serializers.SavedStateSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata
public final class SavedStateConfigurationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerializersModule f22880a;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.d(Reflection.b(Bundle.class), SavedStateSerializer.f22915a);
        f22880a = SerializersModuleKt.b(serializersModuleBuilder.f(), SavedStateConfig_androidKt.b());
    }
}
