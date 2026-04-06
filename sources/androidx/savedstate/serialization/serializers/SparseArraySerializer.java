package androidx.savedstate.serialization.serializers;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
public final class SparseArraySerializer<T> implements KSerializer<SparseArray<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22921a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f22922b;

    @Metadata
    @Serializable
    public static final class SparseArraySurrogate<T> {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final Lazy[] f22924c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a()), null};

        /* renamed from: d  reason: collision with root package name */
        public static final SerialDescriptor f22925d;

        /* renamed from: a  reason: collision with root package name */
        public final List f22926a;

        /* renamed from: b  reason: collision with root package name */
        public final List f22927b;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final <T> KSerializer<SparseArraySurrogate<T>> serializer(KSerializer<T> kSerializer) {
                Intrinsics.i(kSerializer, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(kSerializer);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", (GeneratedSerializer) null, 2);
            pluginGeneratedSerialDescriptor.q("keys", false);
            pluginGeneratedSerialDescriptor.q("values", false);
            f22925d = pluginGeneratedSerialDescriptor;
        }

        public /* synthetic */ SparseArraySurrogate(int i2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.a(i2, 3, f22925d);
            }
            this.f22926a = list;
            this.f22927b = list2;
        }

        public static final /* synthetic */ KSerializer b() {
            return new ArrayListSerializer(IntSerializer.f42129a);
        }

        public static final /* synthetic */ void f(SparseArraySurrogate sparseArraySurrogate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
            compositeEncoder.A(serialDescriptor, 0, (SerializationStrategy) f22924c[0].getValue(), sparseArraySurrogate.f22926a);
            compositeEncoder.A(serialDescriptor, 1, new ArrayListSerializer(kSerializer), sparseArraySurrogate.f22927b);
        }

        public final List d() {
            return this.f22926a;
        }

        public final List e() {
            return this.f22927b;
        }

        public SparseArraySurrogate(List list, List list2) {
            Intrinsics.i(list, "keys");
            Intrinsics.i(list2, "values");
            this.f22926a = list;
            this.f22927b = list2;
        }
    }

    public SparseArraySerializer(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "elementSerializer");
        KSerializer serializer = SparseArraySurrogate.Companion.serializer(kSerializer);
        this.f22921a = serializer;
        this.f22922b = serializer.a();
    }

    public SerialDescriptor a() {
        return this.f22922b;
    }

    /* renamed from: f */
    public SparseArray c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.C(this.f22921a);
        if (sparseArraySurrogate.d().size() == sparseArraySurrogate.e().size()) {
            SparseArray sparseArray = new SparseArray(sparseArraySurrogate.d().size());
            int size = sparseArraySurrogate.d().size();
            for (int i2 = 0; i2 < size; i2++) {
                sparseArray.append(((Number) sparseArraySurrogate.d().get(i2)).intValue(), sparseArraySurrogate.e().get(i2));
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: g */
    public void d(Encoder encoder, SparseArray sparseArray) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(sparseArray, "value");
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
        }
        int size2 = sparseArray.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(sparseArray.valueAt(i3));
        }
        encoder.e(this.f22921a, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
