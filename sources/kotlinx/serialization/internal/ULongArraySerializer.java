package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
@ExperimentalSerializationApi
public final class ULongArraySerializer extends PrimitiveArraySerializer<ULong, ULongArray, ULongArrayBuilder> implements KSerializer<ULongArray> {

    /* renamed from: c  reason: collision with root package name */
    public static final ULongArraySerializer f42219c = new ULongArraySerializer();

    public ULongArraySerializer() {
        super(BuiltinSerializersKt.x(ULong.f40541A));
    }

    public int A(long[] jArr) {
        Intrinsics.i(jArr, "$this$collectionSize");
        return ULongArray.s(jArr);
    }

    public long[] B() {
        return ULongArray.g(0);
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, ULongArrayBuilder uLongArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(uLongArrayBuilder, "builder");
        uLongArrayBuilder.e(ULong.f(compositeDecoder.B(a(), i2).r()));
    }

    public ULongArrayBuilder D(long[] jArr) {
        Intrinsics.i(jArr, "$this$toBuilder");
        return new ULongArrayBuilder(jArr, (DefaultConstructorMarker) null);
    }

    public void E(CompositeEncoder compositeEncoder, long[] jArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(jArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.h(a(), i3).D(ULongArray.p(jArr, i3));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((ULongArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((ULongArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return ULongArray.e(B());
    }

    public /* bridge */ /* synthetic */ void z(CompositeEncoder compositeEncoder, Object obj, int i2) {
        E(compositeEncoder, ((ULongArray) obj).B(), i2);
    }
}
