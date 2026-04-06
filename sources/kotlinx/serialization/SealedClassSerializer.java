package kotlinx.serialization;

import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

@Metadata
@InternalSerializationApi
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KClass f42004a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f42005b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f42006c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f42007d;

    public SerialDescriptor a() {
        return (SerialDescriptor) this.f42005b.getValue();
    }

    public DeserializationStrategy h(CompositeDecoder compositeDecoder, String str) {
        Intrinsics.i(compositeDecoder, "decoder");
        KSerializer kSerializer = (KSerializer) this.f42007d.get(str);
        return kSerializer != null ? kSerializer : super.h(compositeDecoder, str);
    }

    public SerializationStrategy i(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        KSerializer kSerializer = (KSerializer) this.f42006c.get(Reflection.b(obj.getClass()));
        SerializationStrategy i2 = kSerializer != null ? kSerializer : super.i(encoder, obj);
        if (i2 != null) {
            return i2;
        }
        return null;
    }

    public KClass j() {
        return this.f42004a;
    }
}
