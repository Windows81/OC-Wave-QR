package androidx.savedstate.serialization.serializers;

import android.util.SizeF;
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
public final class SizeFSerializer implements KSerializer<SizeF> {

    /* renamed from: a  reason: collision with root package name */
    public static final SizeFSerializer f22917a = new SizeFSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22918b = SerialDescriptorsKt.e("android.util.SizeF", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22918b;
    }

    /* renamed from: f */
    public SizeF c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.C(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22917a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, SizeF sizeF) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(sizeF, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.C(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), sizeF);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22917a.a().a(), encoder).toString());
    }
}
