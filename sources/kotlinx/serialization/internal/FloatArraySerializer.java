package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class FloatArraySerializer extends PrimitiveArraySerializer<Float, float[], FloatArrayBuilder> implements KSerializer<float[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final FloatArraySerializer f42119c = new FloatArraySerializer();

    public FloatArraySerializer() {
        super(BuiltinSerializersKt.E(FloatCompanionObject.f40896a));
    }

    /* renamed from: A */
    public int j(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        return fArr.length;
    }

    /* renamed from: B */
    public float[] w() {
        return new float[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, FloatArrayBuilder floatArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(floatArrayBuilder, "builder");
        floatArrayBuilder.e(compositeDecoder.G(a(), i2));
    }

    /* renamed from: D */
    public FloatArrayBuilder p(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        return new FloatArrayBuilder(fArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, float[] fArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(fArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.n(a(), i3, fArr[i3]);
        }
    }
}
