package androidx.savedstate.serialization.serializers;

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
public final class CharSequenceSerializer implements KSerializer<CharSequence> {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequenceSerializer f22901a = new CharSequenceSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22902b = SerialDescriptorsKt.e("kotlin.CharSequence", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22902b;
    }

    /* renamed from: f */
    public CharSequence c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.i(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22901a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, CharSequence charSequence) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(charSequence, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.j(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), charSequence);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22901a.a().a(), encoder).toString());
    }
}
