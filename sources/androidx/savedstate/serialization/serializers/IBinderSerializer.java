package androidx.savedstate.serialization.serializers;

import android.os.IBinder;
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
public final class IBinderSerializer implements KSerializer<IBinder> {

    /* renamed from: a  reason: collision with root package name */
    public static final IBinderSerializer f22905a = new IBinderSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22906b = SerialDescriptorsKt.e("android.os.IBinder", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    public SerialDescriptor a() {
        return f22906b;
    }

    /* renamed from: f */
    public IBinder c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        if (decoder instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
            return SavedStateReader.d(SavedStateReader.a(savedStateDecoder.X()), savedStateDecoder.W());
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.a(f22905a.a().a(), decoder).toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, IBinder iBinder) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(iBinder, "value");
        if (encoder instanceof SavedStateEncoder) {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
            SavedStateWriter.e(SavedStateWriter.a(savedStateEncoder.W()), savedStateEncoder.V(), iBinder);
            return;
        }
        throw new IllegalArgumentException(BuiltInSerializerKt.b(f22905a.a().a(), encoder).toString());
    }
}
