package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
@ExperimentalSerializationApi
public final class UShortArraySerializer extends PrimitiveArraySerializer<UShort, UShortArray, UShortArrayBuilder> implements KSerializer<UShortArray> {

    /* renamed from: c  reason: collision with root package name */
    public static final UShortArraySerializer f42224c = new UShortArraySerializer();

    public UShortArraySerializer() {
        super(BuiltinSerializersKt.y(UShort.f40547A));
    }

    public int A(short[] sArr) {
        Intrinsics.i(sArr, "$this$collectionSize");
        return UShortArray.s(sArr);
    }

    public short[] B() {
        return UShortArray.g(0);
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, UShortArrayBuilder uShortArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(uShortArrayBuilder, "builder");
        uShortArrayBuilder.e(UShort.f(compositeDecoder.B(a(), i2).E()));
    }

    public UShortArrayBuilder D(short[] sArr) {
        Intrinsics.i(sArr, "$this$toBuilder");
        return new UShortArrayBuilder(sArr, (DefaultConstructorMarker) null);
    }

    public void E(CompositeEncoder compositeEncoder, short[] sArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(sArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.h(a(), i3).j(UShortArray.p(sArr, i3));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((UShortArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((UShortArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return UShortArray.e(B());
    }

    public /* bridge */ /* synthetic */ void z(CompositeEncoder compositeEncoder, Object obj, int i2) {
        E(compositeEncoder, ((UShortArray) obj).B(), i2);
    }
}
