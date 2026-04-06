package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;

@Metadata
public final class SavedStateConfig_androidKt {
    public static final SerializersModule b() {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.d(Reflection.b(Size.class), SizeSerializer.f22919a);
        serializersModuleBuilder.d(Reflection.b(SizeF.class), SizeFSerializer.f22917a);
        serializersModuleBuilder.e(Reflection.b(SparseArray.class), new a());
        return serializersModuleBuilder.f();
    }

    public static final KSerializer c(List list) {
        Intrinsics.i(list, "argSerializers");
        return new SparseArraySerializer((KSerializer) CollectionsKt.e0(list));
    }
}
