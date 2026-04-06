package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Utf8 {
    public static final long a(String str, int i2, int i3) {
        int i4;
        Intrinsics.i(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        } else if (i3 <= str.length()) {
            long j2 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    j2++;
                } else {
                    if (charAt < 2048) {
                        i4 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i4 = 3;
                    } else {
                        int i5 = i2 + 1;
                        char charAt2 = i5 < i3 ? str.charAt(i5) : 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j2++;
                            i2 = i5;
                        } else {
                            j2 += (long) 4;
                            i2 += 2;
                        }
                    }
                    j2 += (long) i4;
                }
                i2++;
            }
            return j2;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
    }

    public static /* synthetic */ long b(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return a(str, i2, i3);
    }
}
