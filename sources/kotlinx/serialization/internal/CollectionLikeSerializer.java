package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42094a;

    public /* synthetic */ CollectionLikeSerializer(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    public abstract SerialDescriptor a();

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        int j2 = j(obj);
        SerialDescriptor a2 = a();
        CompositeEncoder u2 = encoder.u(a2, j2);
        Iterator i2 = i(obj);
        for (int i3 = 0; i3 < j2; i3++) {
            u2.A(a(), i3, this.f42094a, i2.next());
        }
        u2.b(a2);
    }

    public final void l(CompositeDecoder compositeDecoder, Object obj, int i2, int i3) {
        Intrinsics.i(compositeDecoder, "decoder");
        if (i3 >= 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                m(compositeDecoder, i2 + i4, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
    }

    public void m(CompositeDecoder compositeDecoder, int i2, Object obj, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        s(obj, i2, CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), i2, this.f42094a, (Object) null, 8, (Object) null));
    }

    public abstract void s(Object obj, int i2, Object obj2);

    public CollectionLikeSerializer(KSerializer kSerializer) {
        super((DefaultConstructorMarker) null);
        this.f42094a = kSerializer;
    }
}
