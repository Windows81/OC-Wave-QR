package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class TripleSerializer<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42202a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f42203b;

    /* renamed from: c  reason: collision with root package name */
    public final KSerializer f42204c;

    /* renamed from: d  reason: collision with root package name */
    public final SerialDescriptor f42205d = SerialDescriptorsKt.d("kotlin.Triple", new SerialDescriptor[0], new n(this));

    public TripleSerializer(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        Intrinsics.i(kSerializer, "aSerializer");
        Intrinsics.i(kSerializer2, "bSerializer");
        Intrinsics.i(kSerializer3, "cSerializer");
        this.f42202a = kSerializer;
        this.f42203b = kSerializer2;
        this.f42204c = kSerializer3;
    }

    public static final Unit i(TripleSerializer tripleSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(classSerialDescriptorBuilder, "$this$buildClassSerialDescriptor");
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = classSerialDescriptorBuilder;
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "first", tripleSerializer.f42202a.a(), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "second", tripleSerializer.f42203b.a(), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder, "third", tripleSerializer.f42204c.a(), (List) null, false, 12, (Object) null);
        return Unit.f40552a;
    }

    public SerialDescriptor a() {
        return this.f42205d;
    }

    public final Triple g(CompositeDecoder compositeDecoder) {
        Object c2 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 0, this.f42202a, (Object) null, 8, (Object) null);
        Object c3 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 1, this.f42203b, (Object) null, 8, (Object) null);
        Object c4 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 2, this.f42204c, (Object) null, 8, (Object) null);
        compositeDecoder.b(a());
        return new Triple(c2, c3, c4);
    }

    public final Triple h(CompositeDecoder compositeDecoder) {
        Object a2 = TuplesKt.f42206a;
        Object a3 = TuplesKt.f42206a;
        Object a4 = TuplesKt.f42206a;
        while (true) {
            int x2 = compositeDecoder.x(a());
            if (x2 == -1) {
                compositeDecoder.b(a());
                if (a2 == TuplesKt.f42206a) {
                    throw new SerializationException("Element 'first' is missing");
                } else if (a3 == TuplesKt.f42206a) {
                    throw new SerializationException("Element 'second' is missing");
                } else if (a4 != TuplesKt.f42206a) {
                    return new Triple(a2, a3, a4);
                } else {
                    throw new SerializationException("Element 'third' is missing");
                }
            } else if (x2 == 0) {
                a2 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 0, this.f42202a, (Object) null, 8, (Object) null);
            } else if (x2 == 1) {
                a3 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 1, this.f42203b, (Object) null, 8, (Object) null);
            } else if (x2 == 2) {
                a4 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), 2, this.f42204c, (Object) null, 8, (Object) null);
            } else {
                throw new SerializationException("Unexpected index " + x2);
            }
        }
    }

    /* renamed from: j */
    public Triple c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        CompositeDecoder c2 = decoder.c(a());
        return c2.y() ? g(c2) : h(c2);
    }

    /* renamed from: k */
    public void d(Encoder encoder, Triple triple) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(triple, "value");
        CompositeEncoder c2 = encoder.c(a());
        c2.A(a(), 0, this.f42202a, triple.d());
        c2.A(a(), 1, this.f42203b, triple.e());
        c2.A(a(), 2, this.f42204c, triple.f());
        c2.b(a());
    }
}
