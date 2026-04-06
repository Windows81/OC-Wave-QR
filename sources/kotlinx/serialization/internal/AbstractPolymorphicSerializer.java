package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    public final Object c(Decoder decoder) {
        Object obj;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (c2.y()) {
            obj = g(c2);
        } else {
            obj = null;
            while (true) {
                int x2 = c2.x(a());
                if (x2 != -1) {
                    if (x2 == 0) {
                        objectRef.f40908z = c2.t(a(), x2);
                    } else if (x2 != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.f40908z;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(x2);
                        throw new SerializationException(sb.toString());
                    } else {
                        Object obj2 = objectRef.f40908z;
                        if (obj2 != null) {
                            objectRef.f40908z = obj2;
                            DeserializationStrategy a3 = PolymorphicSerializerKt.a(this, c2, (String) obj2);
                            obj = CompositeDecoder.DefaultImpls.c(c2, a(), x2, a3, (Object) null, 8, (Object) null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                    }
                } else if (obj != null) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.f40908z)).toString());
                }
            }
        }
        c2.b(a2);
        return obj;
    }

    public final void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        SerializationStrategy b2 = PolymorphicSerializerKt.b(this, encoder, obj);
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        c2.t(a(), 0, b2.a().a());
        SerialDescriptor a3 = a();
        Intrinsics.g(b2, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        c2.A(a3, 1, b2, obj);
        c2.b(a2);
    }

    public final Object g(CompositeDecoder compositeDecoder) {
        return CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 1, PolymorphicSerializerKt.a(this, compositeDecoder, compositeDecoder.t(a(), 0)), (Object) null, 8, (Object) null);
    }

    public DeserializationStrategy h(CompositeDecoder compositeDecoder, String str) {
        Intrinsics.i(compositeDecoder, "decoder");
        return compositeDecoder.a().e(j(), str);
    }

    public SerializationStrategy i(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        return encoder.a().f(j(), obj);
    }

    public abstract KClass j();
}
