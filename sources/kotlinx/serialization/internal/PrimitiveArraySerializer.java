package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;

@Metadata
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42183b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(KSerializer kSerializer) {
        super(kSerializer, (DefaultConstructorMarker) null);
        Intrinsics.i(kSerializer, "primitiveSerializer");
        this.f42183b = new PrimitiveArrayDescriptor(kSerializer.a());
    }

    public final SerialDescriptor a() {
        return this.f42183b;
    }

    public final Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return k(decoder, (Object) null);
    }

    public final void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        int j2 = j(obj);
        SerialDescriptor serialDescriptor = this.f42183b;
        CompositeEncoder u2 = encoder.u(serialDescriptor, j2);
        z(u2, obj, j2);
        u2.b(serialDescriptor);
    }

    public final Iterator i(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* renamed from: t */
    public final PrimitiveArrayBuilder f() {
        return (PrimitiveArrayBuilder) p(w());
    }

    /* renamed from: u */
    public final int g(PrimitiveArrayBuilder primitiveArrayBuilder) {
        Intrinsics.i(primitiveArrayBuilder, "<this>");
        return primitiveArrayBuilder.d();
    }

    /* renamed from: v */
    public final void h(PrimitiveArrayBuilder primitiveArrayBuilder, int i2) {
        Intrinsics.i(primitiveArrayBuilder, "<this>");
        primitiveArrayBuilder.b(i2);
    }

    public abstract Object w();

    /* renamed from: x */
    public final void s(PrimitiveArrayBuilder primitiveArrayBuilder, int i2, Object obj) {
        Intrinsics.i(primitiveArrayBuilder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* renamed from: y */
    public final Object q(PrimitiveArrayBuilder primitiveArrayBuilder) {
        Intrinsics.i(primitiveArrayBuilder, "<this>");
        return primitiveArrayBuilder.a();
    }

    public abstract void z(CompositeEncoder compositeEncoder, Object obj, int i2);
}
