package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class BooleanArraySerializer extends PrimitiveArraySerializer<Boolean, boolean[], BooleanArrayBuilder> implements KSerializer<boolean[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final BooleanArraySerializer f42072c = new BooleanArraySerializer();

    public BooleanArraySerializer() {
        super(BuiltinSerializersKt.A(BooleanCompanionObject.f40883a));
    }

    /* renamed from: A */
    public int j(boolean[] zArr) {
        Intrinsics.i(zArr, "<this>");
        return zArr.length;
    }

    /* renamed from: B */
    public boolean[] w() {
        return new boolean[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, BooleanArrayBuilder booleanArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(booleanArrayBuilder, "builder");
        booleanArrayBuilder.e(compositeDecoder.s(a(), i2));
    }

    /* renamed from: D */
    public BooleanArrayBuilder p(boolean[] zArr) {
        Intrinsics.i(zArr, "<this>");
        return new BooleanArrayBuilder(zArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, boolean[] zArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(zArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.s(a(), i3, zArr[i3]);
        }
    }
}
