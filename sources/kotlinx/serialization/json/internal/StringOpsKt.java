package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class StringOpsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f42456a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f42457b;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + e(i2 >> 12) + e(i2 >> 8) + e(i2 >> 4) + e(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f42456a = strArr;
        byte[] bArr = new byte[93];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f42457b = bArr;
    }

    public static final byte[] a() {
        return f42457b;
    }

    public static final String[] b() {
        return f42456a;
    }

    public static final void c(StringBuilder sb, String str) {
        Intrinsics.i(sb, "<this>");
        Intrinsics.i(str, "value");
        sb.append('\"');
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            String[] strArr = f42456a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append(str, i2, i3);
                sb.append(strArr[charAt]);
                i2 = i3 + 1;
            }
        }
        if (i2 != 0) {
            sb.append(str, i2, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        Intrinsics.i(str, "<this>");
        if (StringsKt.B(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.B(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char e(int i2) {
        int i3 = i2 & 15;
        return (char) (i3 < 10 ? i3 + 48 : i3 + 87);
    }
}
