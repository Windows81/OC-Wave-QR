package androidx.savedstate.serialization.serializers;

import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements GeneratedSerializer<SparseArraySerializer.SparseArraySurrogate<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KSerializer f22923a;
    private final SerialDescriptor descriptor;

    public SparseArraySerializer$SparseArraySurrogate$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        pluginGeneratedSerialDescriptor.q("keys", false);
        pluginGeneratedSerialDescriptor.q("values", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return this.descriptor;
    }

    public final KSerializer[] b() {
        return new KSerializer[]{this.f22923a};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.serialization.KSerializer[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.KSerializer[] e() {
        /*
            r3 = this;
            kotlin.Lazy[] r0 = androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.f22924c
            r1 = 2
            kotlinx.serialization.KSerializer[] r1 = new kotlinx.serialization.KSerializer[r1]
            r2 = 0
            r0 = r0[r2]
            java.lang.Object r0 = r0.getValue()
            r1[r2] = r0
            kotlinx.serialization.internal.ArrayListSerializer r0 = new kotlinx.serialization.internal.ArrayListSerializer
            kotlinx.serialization.KSerializer r2 = r3.f22923a
            r0.<init>(r2)
            r2 = 1
            r1[r2] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$serializer.e():kotlinx.serialization.KSerializer[]");
    }

    /* renamed from: f */
    public final SparseArraySerializer.SparseArraySurrogate c(Decoder decoder) {
        int i2;
        List list;
        List list2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        Lazy[] c3 = SparseArraySerializer.SparseArraySurrogate.f22924c;
        if (c2.y()) {
            list2 = (List) c2.m(serialDescriptor, 0, (DeserializationStrategy) c3[0].getValue(), (Object) null);
            list = (List) c2.m(serialDescriptor, 1, new ArrayListSerializer(this.f22923a), (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            List list3 = null;
            List list4 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    list3 = (List) c2.m(serialDescriptor, 0, (DeserializationStrategy) c3[0].getValue(), list3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    list4 = (List) c2.m(serialDescriptor, 1, new ArrayListSerializer(this.f22923a), list4);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            list2 = list3;
            list = list4;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new SparseArraySerializer.SparseArraySurrogate(i2, list2, list, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, SparseArraySerializer.SparseArraySurrogate sparseArraySurrogate) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(sparseArraySurrogate, "value");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        SparseArraySerializer.SparseArraySurrogate.f(sparseArraySurrogate, c2, serialDescriptor, this.f22923a);
        c2.b(serialDescriptor);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(KSerializer kSerializer) {
        this();
        Intrinsics.i(kSerializer, "typeSerial0");
        this.f22923a = kSerializer;
    }
}
