package androidx.compose.ui;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface Alignment {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f15444a = Companion.f15445a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f15445a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final Alignment f15446b = new BiasAlignment(-1.0f, -1.0f);

        /* renamed from: c  reason: collision with root package name */
        public static final Alignment f15447c = new BiasAlignment(0.0f, -1.0f);

        /* renamed from: d  reason: collision with root package name */
        public static final Alignment f15448d = new BiasAlignment(1.0f, -1.0f);

        /* renamed from: e  reason: collision with root package name */
        public static final Alignment f15449e = new BiasAlignment(-1.0f, 0.0f);

        /* renamed from: f  reason: collision with root package name */
        public static final Alignment f15450f = new BiasAlignment(0.0f, 0.0f);

        /* renamed from: g  reason: collision with root package name */
        public static final Alignment f15451g = new BiasAlignment(1.0f, 0.0f);

        /* renamed from: h  reason: collision with root package name */
        public static final Alignment f15452h = new BiasAlignment(-1.0f, 1.0f);

        /* renamed from: i  reason: collision with root package name */
        public static final Alignment f15453i = new BiasAlignment(0.0f, 1.0f);

        /* renamed from: j  reason: collision with root package name */
        public static final Alignment f15454j = new BiasAlignment(1.0f, 1.0f);

        /* renamed from: k  reason: collision with root package name */
        public static final Vertical f15455k = new BiasAlignment.Vertical(-1.0f);

        /* renamed from: l  reason: collision with root package name */
        public static final Vertical f15456l = new BiasAlignment.Vertical(0.0f);

        /* renamed from: m  reason: collision with root package name */
        public static final Vertical f15457m = new BiasAlignment.Vertical(1.0f);

        /* renamed from: n  reason: collision with root package name */
        public static final Horizontal f15458n = new BiasAlignment.Horizontal(-1.0f);

        /* renamed from: o  reason: collision with root package name */
        public static final Horizontal f15459o = new BiasAlignment.Horizontal(0.0f);

        /* renamed from: p  reason: collision with root package name */
        public static final Horizontal f15460p = new BiasAlignment.Horizontal(1.0f);

        public final Vertical a() {
            return f15457m;
        }

        public final Alignment b() {
            return f15453i;
        }

        public final Alignment c() {
            return f15454j;
        }

        public final Alignment d() {
            return f15452h;
        }

        public final Alignment e() {
            return f15450f;
        }

        public final Alignment f() {
            return f15451g;
        }

        public final Horizontal g() {
            return f15459o;
        }

        public final Alignment h() {
            return f15449e;
        }

        public final Vertical i() {
            return f15456l;
        }

        public final Horizontal j() {
            return f15460p;
        }

        public final Horizontal k() {
            return f15458n;
        }

        public final Vertical l() {
            return f15455k;
        }

        public final Alignment m() {
            return f15447c;
        }

        public final Alignment n() {
            return f15448d;
        }

        public final Alignment o() {
            return f15446b;
        }
    }

    @Metadata
    public interface Horizontal {
        int a(int i2, int i3, LayoutDirection layoutDirection);
    }

    @Metadata
    public interface Vertical {
        int a(int i2, int i3);
    }

    long a(long j2, long j3, LayoutDirection layoutDirection);
}
