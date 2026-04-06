package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata
public final class CharArraySerializer extends PrimitiveArraySerializer<Character, char[], CharArrayBuilder> implements KSerializer<char[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final CharArraySerializer f42084c = new CharArraySerializer();

    public CharArraySerializer() {
        super(BuiltinSerializersKt.C(CharCompanionObject.f40889a));
    }

    /* renamed from: A */
    public int j(char[] cArr) {
        Intrinsics.i(cArr, "<this>");
        return cArr.length;
    }

    /* renamed from: B */
    public char[] w() {
        return new char[0];
    }

    /* renamed from: C */
    public void m(CompositeDecoder compositeDecoder, int i2, CharArrayBuilder charArrayBuilder, boolean z2) {
        Intrinsics.i(compositeDecoder, "decoder");
        Intrinsics.i(charArrayBuilder, "builder");
        charArrayBuilder.e(compositeDecoder.p(a(), i2));
    }

    /* renamed from: D */
    public CharArrayBuilder p(char[] cArr) {
        Intrinsics.i(cArr, "<this>");
        return new CharArrayBuilder(cArr);
    }

    /* renamed from: E */
    public void z(CompositeEncoder compositeEncoder, char[] cArr, int i2) {
        Intrinsics.i(compositeEncoder, "encoder");
        Intrinsics.i(cArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            compositeEncoder.F(a(), i3, cArr[i3]);
        }
    }
}
