package okhttp3;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata
public final class Credentials {

    /* renamed from: a  reason: collision with root package name */
    public static final Credentials f42626a = new Credentials();

    public static final String a(String str, String str2, Charset charset) {
        Intrinsics.i(str, "username");
        Intrinsics.i(str2, "password");
        Intrinsics.i(charset, "charset");
        String d2 = ByteString.C.c(str + ':' + str2, charset).d();
        return "Basic " + d2;
    }
}
