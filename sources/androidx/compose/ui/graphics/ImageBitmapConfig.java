package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ImageBitmapConfig {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16021b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16022c = g(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16023d = g(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16024e = g(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16025f = g(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f16026g = g(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f16027a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ImageBitmapConfig.f16023d;
        }

        public final int b() {
            return ImageBitmapConfig.f16022c;
        }

        public final int c() {
            return ImageBitmapConfig.f16025f;
        }

        public final int d() {
            return ImageBitmapConfig.f16026g;
        }

        public final int e() {
            return ImageBitmapConfig.f16024e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ImageBitmapConfig(int i2) {
        this.f16027a = i2;
    }

    public static final /* synthetic */ ImageBitmapConfig f(int i2) {
        return new ImageBitmapConfig(i2);
    }

    public static int g(int i2) {
        return i2;
    }

    public static boolean h(int i2, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i2 == ((ImageBitmapConfig) obj).l();
    }

    public static final boolean i(int i2, int i3) {
        return i2 == i3;
    }

    public static int j(int i2) {
        return Integer.hashCode(i2);
    }

    public static String k(int i2) {
        return i(i2, f16022c) ? "Argb8888" : i(i2, f16023d) ? "Alpha8" : i(i2, f16024e) ? "Rgb565" : i(i2, f16025f) ? "F16" : i(i2, f16026g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f16027a, obj);
    }

    public int hashCode() {
        return j(this.f16027a);
    }

    public final /* synthetic */ int l() {
        return this.f16027a;
    }

    public String toString() {
        return k(this.f16027a);
    }
}
