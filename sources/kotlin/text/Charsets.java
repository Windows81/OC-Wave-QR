package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Charsets {

    /* renamed from: a  reason: collision with root package name */
    public static final Charsets f41117a = new Charsets();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f41118b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f41119c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f41120d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f41121e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f41122f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f41123g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile Charset f41124h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile Charset f41125i;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.h(forName, "forName(...)");
        f41118b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.h(forName2, "forName(...)");
        f41119c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.h(forName3, "forName(...)");
        f41120d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.h(forName4, "forName(...)");
        f41121e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.h(forName5, "forName(...)");
        f41122f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.h(forName6, "forName(...)");
        f41123g = forName6;
    }

    public final Charset a() {
        Charset charset = f41125i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        Intrinsics.h(forName, "forName(...)");
        f41125i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f41124h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        Intrinsics.h(forName, "forName(...)");
        f41124h = forName;
        return forName;
    }
}
