package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public abstract class KeyValueSerializer<K, V, R> implements KSerializer<R> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42133a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f42134b;

    public /* synthetic */ KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    public Object c(Decoder decoder) {
        Object obj;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            obj = j(CompositeDecoder.DefaultImpls.c(c2, a(), 0, g(), (Object) null, 8, (Object) null), CompositeDecoder.DefaultImpls.c(c2, a(), 1, i(), (Object) null, 8, (Object) null));
        } else {
            Object a3 = TuplesKt.f42206a;
            Object a4 = TuplesKt.f42206a;
            while (true) {
                int x2 = c2.x(a());
                if (x2 != -1) {
                    if (x2 == 0) {
                        a3 = CompositeDecoder.DefaultImpls.c(c2, a(), 0, g(), (Object) null, 8, (Object) null);
                    } else if (x2 == 1) {
                        a4 = CompositeDecoder.DefaultImpls.c(c2, a(), 1, i(), (Object) null, 8, (Object) null);
                    } else {
                        throw new SerializationException("Invalid index: " + x2);
                    }
                } else if (a3 == TuplesKt.f42206a) {
                    throw new SerializationException("Element 'key' is missing");
                } else if (a4 != TuplesKt.f42206a) {
                    obj = j(a3, a4);
                } else {
                    throw new SerializationException("Element 'value' is missing");
                }
            }
        }
        c2.b(a2);
        return obj;
    }

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        CompositeEncoder c2 = encoder.c(a());
        c2.A(a(), 0, this.f42133a, f(obj));
        c2.A(a(), 1, this.f42134b, h(obj));
        c2.b(a());
    }

    public abstract Object f(Object obj);

    public final KSerializer g() {
        return this.f42133a;
    }

    public abstract Object h(Object obj);

    public final KSerializer i() {
        return this.f42134b;
    }

    public abstract Object j(Object obj, Object obj2);

    public KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f42133a = kSerializer;
        this.f42134b = kSerializer2;
    }
}
