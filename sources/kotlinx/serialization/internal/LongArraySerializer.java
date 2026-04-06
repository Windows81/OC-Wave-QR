package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class LongArraySerializer extends PrimitiveArraySerializer<Long, long[], LongArrayBuilder> implements KSerializer<long[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final LongArraySerializer f42141c = new LongArraySerializer();

    public LongArraySerializer() {
        super(BuiltinSerializersKt.G(LongCompanionObject.f40898a));
    }

    /* renamed from: A */
    public int j(long[] jArr) {
        Intrinsics.i(jArr, "<this>");
        return jArr.length;
    }

    /* renamed from: B */
    public long[] w() {
        return new long[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, LongArrayBuilder longArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(longArrayBuilder, "builder");
        longArrayBuilder.e(compositeDecoder.h(a(), i2));
    }

    /* renamed from: D */
    public LongArrayBuilder p(long[] jArr) {
        Intrinsics.i(jArr, "<this>");
        return new LongArrayBuilder(jArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, long[] jArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(jArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.E(a(), i3, jArr[i3]);
        }
    }
}
