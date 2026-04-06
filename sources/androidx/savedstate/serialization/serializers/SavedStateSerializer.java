package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class SavedStateSerializer implements KSerializer<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public static final SavedStateSerializer f22915a = new SavedStateSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22916b = SerialDescriptorsKt.e("androidx.savedstate.SavedState", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22916b;
    }

    /* renamed from: f */
    public Bundle c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return Intrinsics.d(savedStateDecoder.W(), "") ? savedStateDecoder.X() : SavedStateReader.z(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22915a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, Bundle bundle) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(bundle, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            if (Intrinsics.d(savedStateEncoder.V(), "")) {
                SavedStateWriter.d(SavedStateWriter.a(savedStateEncoder.W()), bundle);
            } else {
                SavedStateWriter.A(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), bundle);
            }
        } else {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(f22915a.a().a(), encoder).toString());
        }
    }
}
