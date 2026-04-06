package androidx.savedstate.serialization.serializers;

import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class CharSequenceListSerializer implements KSerializer<List<? extends CharSequence>> {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequenceListSerializer f22899a = new CharSequenceListSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22900b = SerialDescriptorsKt.e("kotlin.collections.List<kotlin.CharSequence>", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22900b;
    }

    /* renamed from: f */
    public List c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.k(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22899a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, List list) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(list, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.l(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), list);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22899a.a().a(), encoder).toString());
    }
}
