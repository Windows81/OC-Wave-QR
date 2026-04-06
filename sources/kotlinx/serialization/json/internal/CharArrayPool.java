package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CharArrayPool extends CharArrayPoolBase {

    /* renamed from: c  reason: collision with root package name */
    public static final CharArrayPool f42359c = new CharArrayPool();

    public final void c(char[] cArr) {
        Intrinsics.i(cArr, "array");
        a(cArr);
    }

    public final char[] d() {
        return super.b(128);
    }
}
