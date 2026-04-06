package androidx.savedstate.serialization.serializers;

import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public abstract class JavaSerializableSerializer<T extends Serializable> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f22907a = SerialDescriptorsKt.e("java.io.Serializable", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public final SerialDescriptor a() {
        return this.f22907a;
    }

    /* renamed from: f */
    public final Serializable c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            Serializable s2 = SavedStateReader.s(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W(), Reflection.b(Serializable.class));
            Intrinsics.g(s2, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.JavaSerializableSerializer");
            return s2;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(this.f22907a.a(), decoder).toString());
    }

    /* renamed from: g */
    public final void d(Encoder encoder, Serializable serializable) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(serializable, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.t(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), serializable);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(this.f22907a.a(), encoder).toString());
    }
}
