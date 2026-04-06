package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class DoubleArraySerializer extends PrimitiveArraySerializer<Double, double[], DoubleArrayBuilder> implements KSerializer<double[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final DoubleArraySerializer f42101c = new DoubleArraySerializer();

    public DoubleArraySerializer() {
        super(BuiltinSerializersKt.D(DoubleCompanionObject.f40894a));
    }

    /* renamed from: A */
    public int j(double[] dArr) {
        Intrinsics.i(dArr, "<this>");
        return dArr.length;
    }

    /* renamed from: B */
    public double[] w() {
        return new double[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, DoubleArrayBuilder doubleArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(doubleArrayBuilder, "builder");
        doubleArrayBuilder.e(compositeDecoder.A(a(), i2));
    }

    /* renamed from: D */
    public DoubleArrayBuilder p(double[] dArr) {
        Intrinsics.i(dArr, "<this>");
        return new DoubleArrayBuilder(dArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, double[] dArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(dArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.C(a(), i3, dArr[i3]);
        }
    }
}
