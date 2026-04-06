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
public final class CharSequenceArraySerializer implements KSerializer<CharSequence[]> {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequenceArraySerializer f22897a = new CharSequenceArraySerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22898b = SerialDescriptorsKt.e("kotlin.Array<kotlin.CharSequence>", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22898b;
    }

    /* renamed from: f */
    public CharSequence[] c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.j(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22897a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, CharSequence[] charSequenceArr) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(charSequenceArr, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.k(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), charSequenceArr);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22897a.a().a(), encoder).toString());
    }
}
