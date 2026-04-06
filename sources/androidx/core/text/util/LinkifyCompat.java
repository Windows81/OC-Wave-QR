package androidx.core.text.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Comparator;

public final class LinkifyCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f20118a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f20119b = new a();

    public static class Api24Impl {
    }

    public static class LinkSpec {

        /* renamed from: a  reason: collision with root package name */
        public int f20120a;

        /* renamed from: b  reason: collision with root package name */
        public int f20121b;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    public static /* synthetic */ int b(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i2 = linkSpec.f20120a;
        int i3 = linkSpec2.f20120a;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return Integer.compare(linkSpec2.f20121b, linkSpec.f20121b);
    }
}
