package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LineReader {

    /* renamed from: a  reason: collision with root package name */
    public static final LineReader f40791a = new LineReader();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f40792b;

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f40793c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f40794d;

    /* renamed from: e  reason: collision with root package name */
    public static final CharBuffer f40795e;

    /* renamed from: f  reason: collision with root package name */
    public static final StringBuilder f40796f = new StringBuilder();

    static {
        byte[] bArr = new byte[32];
        f40792b = bArr;
        char[] cArr = new char[32];
        f40793c = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Intrinsics.h(wrap, "wrap(...)");
        f40794d = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        Intrinsics.h(wrap2, "wrap(...)");
        f40795e = wrap2;
    }
}
