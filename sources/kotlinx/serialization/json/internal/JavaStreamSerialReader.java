package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JavaStreamSerialReader implements InternalJsonReader {

    /* renamed from: a  reason: collision with root package name */
    public final CharsetReader f42380a;

    public int a(char[] cArr, int i2, int i3) {
        Intrinsics.i(cArr, "buffer");
        return this.f42380a.d(cArr, i2, i3);
    }
}
