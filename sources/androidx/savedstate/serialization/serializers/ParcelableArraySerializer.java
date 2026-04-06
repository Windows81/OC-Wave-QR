package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
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
public final class ParcelableArraySerializer implements KSerializer<Parcelable[]> {

    /* renamed from: a  reason: collision with root package name */
    public static final ParcelableArraySerializer f22910a = new ParcelableArraySerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22911b = SerialDescriptorsKt.e("kotlin.Array<android.os.Parcelable>", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22911b;
    }

    /* renamed from: f */
    public Parcelable[] c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.w(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W(), Reflection.b(Parcelable.class));
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22910a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, Parcelable[] parcelableArr) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(parcelableArr, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.y(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), parcelableArr);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22910a.a().a(), encoder).toString());
    }
}
