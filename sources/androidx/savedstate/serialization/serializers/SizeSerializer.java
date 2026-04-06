package androidx.savedstate.serialization.serializers;

import android.util.Size;
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
public final class SizeSerializer implements KSerializer<Size> {

    /* renamed from: a  reason: collision with root package name */
    public static final SizeSerializer f22919a = new SizeSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22920b = SerialDescriptorsKt.e("android.util.Size", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22920b;
    }

    /* renamed from: f */
    public Size c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.B(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22919a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, Size size) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(size, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.B(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), size);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22919a.a().a(), encoder).toString());
    }
}
