package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class ShortArraySerializer extends PrimitiveArraySerializer<Short, short[], ShortArrayBuilder> implements KSerializer<short[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final ShortArraySerializer f42194c = new ShortArraySerializer();

    public ShortArraySerializer() {
        super(BuiltinSerializersKt.H(ShortCompanionObject.f40912a));
    }

    /* renamed from: A */
    public int j(short[] sArr) {
        Intrinsics.i(sArr, "<this>");
        return sArr.length;
    }

    /* renamed from: B */
    public short[] w() {
        return new short[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, ShortArrayBuilder shortArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(shortArrayBuilder, "builder");
        shortArrayBuilder.e(compositeDecoder.w(a(), i2));
    }

    /* renamed from: D */
    public ShortArrayBuilder p(short[] sArr) {
        Intrinsics.i(sArr, "<this>");
        return new ShortArrayBuilder(sArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, short[] sArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(sArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.B(a(), i3, sArr[i3]);
        }
    }
}
