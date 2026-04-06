package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.util.List;
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
public final class ParcelableListSerializer implements KSerializer<List<? extends Parcelable>> {

    /* renamed from: a  reason: collision with root package name */
    public static final ParcelableListSerializer f22912a = new ParcelableListSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22913b = SerialDescriptorsKt.e("kotlin.collections.List<android.os.Parcelable>", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22913b;
    }

    /* renamed from: f */
    public List c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.y(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W(), Reflection.b(Parcelable.class));
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22912a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, List list) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(list, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.z(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), list);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22912a.a().a(), encoder).toString());
    }
}
