package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
@ExperimentalSerializationApi
public final class UByteArraySerializer extends PrimitiveArraySerializer<UByte, UByteArray, UByteArrayBuilder> implements KSerializer<UByteArray> {

    /* renamed from: c  reason: collision with root package name */
    public static final UByteArraySerializer f42209c = new UByteArraySerializer();

    public UByteArraySerializer() {
        super(BuiltinSerializersKt.v(UByte.f40531A));
    }

    public int A(byte[] bArr) {
        Intrinsics.i(bArr, "$this$collectionSize");
        return UByteArray.s(bArr);
    }

    public byte[] B() {
        return UByteArray.g(0);
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, UByteArrayBuilder uByteArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(uByteArrayBuilder, "builder");
        uByteArrayBuilder.e(UByte.f(compositeDecoder.B(a(), i2).D()));
    }

    public UByteArrayBuilder D(byte[] bArr) {
        Intrinsics.i(bArr, "$this$toBuilder");
        return new UByteArrayBuilder(bArr, (DefaultConstructorMarker) null);
    }

    public void E(CompositeEncoder compositeEncoder, byte[] bArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(bArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.h(a(), i3).k(UByteArray.p(bArr, i3));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((UByteArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((UByteArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return UByteArray.e(B());
    }

    public /* bridge */ /* synthetic */ void z(CompositeEncoder compositeEncoder, Object obj, int i2) {
        E(compositeEncoder, ((UByteArray) obj).B(), i2);
    }
}
