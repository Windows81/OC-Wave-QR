package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CharsetReader {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f42366a;

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f42367b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteBuffer f42368c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42369d;

    /* renamed from: e  reason: collision with root package name */
    public char f42370e;

    public final int a(char[] cArr, int i2, int i3) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i2, i3);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z2 = false;
        while (true) {
            CoderResult decode = this.f42367b.decode(this.f42368c, wrap, z2);
            if (decode.isUnderflow()) {
                if (!z2 && wrap.hasRemaining()) {
                    if (b() < 0) {
                        if (wrap.position() == 0 && !this.f42368c.hasRemaining()) {
                            z2 = true;
                            break;
                        }
                        this.f42367b.reset();
                        z2 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else if (decode.isOverflow()) {
                wrap.position();
                break;
            } else {
                decode.throwException();
            }
        }
        if (z2) {
            this.f42367b.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    public final int b() {
        this.f42368c.compact();
        try {
            int limit = this.f42368c.limit();
            int position = this.f42368c.position();
            int read = this.f42366a.read(this.f42368c.array(), this.f42368c.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.f42368c;
            Intrinsics.g(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.f42368c.flip();
            return this.f42368c.remaining();
        } finally {
            this.f42368c.flip();
        }
    }

    public final int c() {
        if (this.f42369d) {
            this.f42369d = false;
            return this.f42370e;
        }
        char[] cArr = new char[2];
        int d2 = d(cArr, 0, 2);
        if (d2 == -1) {
            return -1;
        }
        if (d2 == 1) {
            return cArr[0];
        }
        if (d2 == 2) {
            this.f42370e = cArr[1];
            this.f42369d = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + d2).toString());
    }

    public final int d(char[] cArr, int i2, int i3) {
        Intrinsics.i(cArr, "array");
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= cArr.length || i3 < 0 || i2 + i3 > cArr.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i2 + ", " + i3 + ", " + cArr.length).toString());
        }
        if (this.f42369d) {
            cArr[i2] = this.f42370e;
            i2++;
            i3--;
            this.f42369d = false;
            if (i3 == 0) {
                return 1;
            }
            i4 = 1;
        }
        if (i3 != 1) {
            return a(cArr, i2, i3) + i4;
        }
        int c2 = c();
        if (c2 != -1) {
            cArr[i2] = (char) c2;
            return i4 + 1;
        } else if (i4 == 0) {
            return -1;
        } else {
            return i4;
        }
    }
}
