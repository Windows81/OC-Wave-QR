package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
@ExperimentalSerializationApi
public final class UIntArraySerializer extends PrimitiveArraySerializer<UInt, UIntArray, UIntArrayBuilder> implements KSerializer<UIntArray> {

    /* renamed from: c  reason: collision with root package name */
    public static final UIntArraySerializer f42214c = new UIntArraySerializer();

    public UIntArraySerializer() {
        super(BuiltinSerializersKt.w(UInt.f40536A));
    }

    public int A(int[] iArr) {
        Intrinsics.i(iArr, "$this$collectionSize");
        return UIntArray.s(iArr);
    }

    public int[] B() {
        return UIntArray.g(0);
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, UIntArrayBuilder uIntArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(uIntArrayBuilder, "builder");
        uIntArrayBuilder.e(UInt.f(compositeDecoder.B(a(), i2).j()));
    }

    public UIntArrayBuilder D(int[] iArr) {
        Intrinsics.i(iArr, "$this$toBuilder");
        return new UIntArrayBuilder(iArr, (DefaultConstructorMarker) null);
    }

    public void E(CompositeEncoder compositeEncoder, int[] iArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(iArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.h(a(), i3).y(UIntArray.p(iArr, i3));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((UIntArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((UIntArray) obj).B());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return UIntArray.e(B());
    }

    public /* bridge */ /* synthetic */ void z(CompositeEncoder compositeEncoder, Object obj, int i2) {
        E(compositeEncoder, ((UIntArray) obj).B(), i2);
    }
}
