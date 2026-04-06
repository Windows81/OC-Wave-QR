package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class Utf8Old extends Utf8 {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f21396b = ThreadLocal.withInitial(new a());

    public static class Cache {

        /* renamed from: a  reason: collision with root package name */
        public final CharsetEncoder f21397a;

        /* renamed from: b  reason: collision with root package name */
        public final CharsetDecoder f21398b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f21399c = null;

        /* renamed from: d  reason: collision with root package name */
        public ByteBuffer f21400d = null;

        public Cache() {
            Charset charset = StandardCharsets.UTF_8;
            this.f21397a = charset.newEncoder();
            this.f21398b = charset.newDecoder();
        }
    }

    public static /* synthetic */ Cache c() {
        return new Cache();
    }
}
