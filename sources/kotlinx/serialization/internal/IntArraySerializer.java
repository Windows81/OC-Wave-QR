package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class IntArraySerializer extends PrimitiveArraySerializer<Integer, int[], IntArrayBuilder> implements KSerializer<int[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final IntArraySerializer f42128c = new IntArraySerializer();

    public IntArraySerializer() {
        super(BuiltinSerializersKt.F(IntCompanionObject.f40897a));
    }

    /* renamed from: A */
    public int j(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        return iArr.length;
    }

    /* renamed from: B */
    public int[] w() {
        return new int[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, IntArrayBuilder intArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(intArrayBuilder, "builder");
        intArrayBuilder.e(compositeDecoder.k(a(), i2));
    }

    /* renamed from: D */
    public IntArrayBuilder p(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        return new IntArrayBuilder(iArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, int[] iArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(iArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.r(a(), i3, iArr[i3]);
        }
    }
}
