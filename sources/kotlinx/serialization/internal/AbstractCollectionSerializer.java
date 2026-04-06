package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

@Metadata
@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void n(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i2, Object obj, boolean z2, int i3, Object obj2) {
        if (obj2 == null) {
            if ((i3 & 8) != 0) {
                z2 = true;
            }
            abstractCollectionSerializer.m(compositeDecoder, i2, obj, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    public Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return k(decoder, (Object) null);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract void h(Object obj, int i2);

    public abstract Iterator i(Object obj);

    public abstract int j(Object obj);

    public final Object k(Decoder decoder, Object obj) {
        Object obj2;
        Intrinsics.i(decoder, "decoder");
        if (obj == null || (obj2 = p(obj)) == null) {
            obj2 = f();
        }
        int g2 = g(obj2);
        CompositeDecoder c2 = decoder.c(a());
        if (!c2.y()) {
            while (true) {
                int x2 = c2.x(a());
                if (x2 == -1) {
                    break;
                }
                n(this, c2, g2 + x2, obj2, false, 8, (Object) null);
            }
        } else {
            l(c2, obj2, g2, o(c2, obj2));
        }
        c2.b(a());
        return q(obj2);
    }

    public abstract void l(CompositeDecoder compositeDecoder, Object obj, int i2, int i3);

    public abstract void m(CompositeDecoder compositeDecoder, int i2, Object obj, boolean z2);

    public final int o(CompositeDecoder compositeDecoder, Object obj) {
        int o2 = compositeDecoder.o(a());
        h(obj, o2);
        return o2;
    }

    public abstract Object p(Object obj);

    public abstract Object q(Object obj);

    public AbstractCollectionSerializer() {
    }
}
