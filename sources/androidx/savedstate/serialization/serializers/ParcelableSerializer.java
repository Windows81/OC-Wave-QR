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
public abstract class ParcelableSerializer<T extends Parcelable> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f22914a = SerialDescriptorsKt.e("android.os.Parcelable", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public final SerialDescriptor a() {
        return this.f22914a;
    }

    /* renamed from: f */
    public final Parcelable c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            Parcelable v2 = SavedStateReader.v(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W(), Reflection.b(Parcelable.class));
            Intrinsics.g(v2, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.ParcelableSerializer");
            return v2;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(this.f22914a.a(), decoder).toString());
    }

    /* renamed from: g */
    public final void d(Encoder encoder, Parcelable parcelable) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(parcelable, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.x(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), parcelable);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(this.f22914a.a(), encoder).toString());
    }
}
