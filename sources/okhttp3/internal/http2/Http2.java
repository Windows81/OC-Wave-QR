package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okio.ByteString;

@Metadata
public final class Http2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Http2 f43060a = new Http2();

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f43061b = ByteString.C.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f43062c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f43063d = new String[64];

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f43064e;

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.h(binaryString, "toBinaryString(it)");
            strArr[i2] = StringsKt.J(Util.t("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f43064e = strArr;
        String[] strArr2 = f43063d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f43063d;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        int length = f43063d.length;
        for (int i8 = 0; i8 < length; i8++) {
            String[] strArr4 = f43063d;
            if (strArr4[i8] == null) {
                strArr4[i8] = f43064e[i8];
            }
        }
    }

    public final String a(int i2, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (!(i2 == 2 || i2 == 3)) {
            if (i2 == 4 || i2 == 6) {
                return i3 == 1 ? "ACK" : f43064e[i3];
            }
            if (!(i2 == 7 || i2 == 8)) {
                String[] strArr = f43063d;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    Intrinsics.f(str);
                } else {
                    str = f43064e[i3];
                }
                String str2 = str;
                return (i2 != 5 || (i3 & 4) == 0) ? (i2 != 0 || (i3 & 32) == 0) ? str2 : StringsKt.K(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.K(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f43064e[i3];
    }

    public final String b(int i2) {
        String[] strArr = f43062c;
        return i2 < strArr.length ? strArr[i2] : Util.t("0x%02x", Integer.valueOf(i2));
    }

    public final String c(boolean z2, int i2, int i3, int i4, int i5) {
        return Util.t("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), b(i4), a(i4, i5));
    }
}
