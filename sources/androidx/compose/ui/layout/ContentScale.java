package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public interface ContentScale {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f17026a = Companion.f17027a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17027a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final ContentScale f17028b = new ContentScale$Companion$Crop$1();

        /* renamed from: c  reason: collision with root package name */
        public static final ContentScale f17029c = new ContentScale$Companion$Fit$1();

        /* renamed from: d  reason: collision with root package name */
        public static final ContentScale f17030d = new ContentScale$Companion$FillHeight$1();

        /* renamed from: e  reason: collision with root package name */
        public static final ContentScale f17031e = new ContentScale$Companion$FillWidth$1();

        /* renamed from: f  reason: collision with root package name */
        public static final ContentScale f17032f = new ContentScale$Companion$Inside$1();

        /* renamed from: g  reason: collision with root package name */
        public static final FixedScale f17033g = new FixedScale(1.0f);

        /* renamed from: h  reason: collision with root package name */
        public static final ContentScale f17034h = new ContentScale$Companion$FillBounds$1();

        public final ContentScale a() {
            return f17028b;
        }

        public final ContentScale b() {
            return f17034h;
        }

        public final ContentScale c() {
            return f17030d;
        }

        public final ContentScale d() {
            return f17029c;
        }

        public final ContentScale e() {
            return f17032f;
        }

        public final FixedScale f() {
            return f17033g;
        }
    }

    long a(long j2, long j3);
}
