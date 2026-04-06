package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class ByteArraySerializer extends PrimitiveArraySerializer<Byte, byte[], ByteArrayBuilder> implements KSerializer<byte[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final ByteArraySerializer f42077c = new ByteArraySerializer();

    public ByteArraySerializer() {
        super(BuiltinSerializersKt.B(ByteCompanionObject.f40884a));
    }

    /* renamed from: A */
    public int j(byte[] bArr) {
        Intrinsics.i(bArr, "<this>");
        return bArr.length;
    }

    /* renamed from: B */
    public byte[] w() {
        return new byte[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, ByteArrayBuilder byteArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(byteArrayBuilder, "builder");
        byteArrayBuilder.e(compositeDecoder.q(a(), i2));
    }

    /* renamed from: D */
    public ByteArrayBuilder p(byte[] bArr) {
        Intrinsics.i(bArr, "<this>");
        return new ByteArrayBuilder(bArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, byte[] bArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(bArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.g(a(), i3, bArr[i3]);
        }
    }
}
