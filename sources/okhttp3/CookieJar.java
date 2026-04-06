package okhttp3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface CookieJar {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f42623a = Companion.f42625a;

    /* renamed from: b  reason: collision with root package name */
    public static final CookieJar f42624b = new Companion.NoCookies();

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42625a = new Companion();

        @Metadata
        public static final class NoCookies implements CookieJar {
            public void a(HttpUrl httpUrl, List list) {
                Intrinsics.i(httpUrl, "url");
                Intrinsics.i(list, "cookies");
            }

            public List b(HttpUrl httpUrl) {
                Intrinsics.i(httpUrl, "url");
                return CollectionsKt.m();
            }
        }
    }

    void a(HttpUrl httpUrl, List list);

    List b(HttpUrl httpUrl);
}
