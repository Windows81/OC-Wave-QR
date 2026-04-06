package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
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
public final class SparseParcelableArraySerializer implements KSerializer<SparseArray<Parcelable>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseParcelableArraySerializer f22928a = new SparseParcelableArraySerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22929b = SerialDescriptorsKt.e("android.util.SparseArray<android.os.Parcelable>", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22929b;
    }

    /* renamed from: f */
    public SparseArray c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.D(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W(), Reflection.b(Parcelable.class));
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22928a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, SparseArray sparseArray) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(sparseArray, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.D(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), sparseArray);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22928a.a().a(), encoder).toString());
    }
}
