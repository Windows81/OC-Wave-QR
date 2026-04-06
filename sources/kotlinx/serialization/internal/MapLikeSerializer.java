package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
@InternalSerializationApi
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42151a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f42152b;

    public /* synthetic */ MapLikeSerializer(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    public abstract SerialDescriptor a();

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        int j2 = j(obj);
        SerialDescriptor a2 = a();
        CompositeEncoder u2 = encoder.u(a2, j2);
        Iterator i2 = i(obj);
        int i3 = 0;
        while (i2.hasNext()) {
            Map.Entry entry = (Map.Entry) i2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i4 = i3 + 1;
            u2.A(a(), i3, r(), key);
            i3 += 2;
            u2.A(a(), i4, s(), value);
        }
        u2.b(a2);
    }

    public final KSerializer r() {
        return this.f42151a;
    }

    public final KSerializer s() {
        return this.f42152b;
    }

    /* renamed from: t */
    public final void l(CompositeDecoder compositeDecoder, Map map, int i2, int i3) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(map, "builder");
        if (i3 >= 0) {
            IntProgression u2 = RangesKt.u(RangesKt.v(0, i3 * 2), 2);
            int n2 = u2.n();
            int o2 = u2.o();
            int p2 = u2.p();
            if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
                while (true) {
                    m(compositeDecoder, i2 + n2, map, false);
                    if (n2 != o2) {
                        n2 += p2;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
    }

    /* renamed from: u */
    public final void m(CompositeDecoder compositeDecoder, int i2, Map map, boolean z2) {
        int i3;
        Object obj;
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(map, "builder");
        Object c2 = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), i2, this.f42151a, (Object) null, 8, (Object) null);
        if (z2) {
            i3 = compositeDecoder.x(a());
            if (i3 != i2 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i2 + ", returned index for value: " + i3).toString());
            }
        } else {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (!map.containsKey(c2) || (this.f42152b.a().e() instanceof PrimitiveKind)) {
            obj = CompositeDecoder.DefaultImpls.c(compositeDecoder, a(), i4, this.f42152b, (Object) null, 8, (Object) null);
        } else {
            obj = compositeDecoder.m(a(), i4, this.f42152b, MapsKt.i(map, c2));
        }
        map.put(c2, obj);
    }

    public MapLikeSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super((DefaultConstructorMarker) null);
        this.f42151a = kSerializer;
        this.f42152b = kSerializer2;
    }
}
