package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JsonFriendModuleApi
public abstract class InternalJsonReaderCodePointImpl implements InternalJsonReader {

    /* renamed from: a  reason: collision with root package name */
    public Character f42378a;

    public final int a(char[] cArr, int i2, int i3) {
        int i4;
        int i5;
        Intrinsics.i(cArr, "buffer");
        Character ch = this.f42378a;
        if (ch != null) {
            Intrinsics.f(ch);
            cArr[i2] = ch.charValue();
            this.f42378a = null;
            i4 = 1;
        } else {
            i4 = 0;
        }
        while (i4 < i3 && !b()) {
            int c2 = c();
            if (c2 <= 65535) {
                cArr[i2 + i4] = (char) c2;
                i5 = i4 + 1;
            } else {
                char c3 = (char) ((c2 & 1023) + 56320);
                cArr[i2 + i4] = (char) ((c2 >>> 10) + 55232);
                int i6 = i4 + 1;
                if (i6 < i3) {
                    cArr[i6 + i2] = c3;
                    i5 = i4 + 2;
                } else {
                    this.f42378a = Character.valueOf(c3);
                    i5 = i6;
                }
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    public abstract boolean b();

    public abstract int c();
}
