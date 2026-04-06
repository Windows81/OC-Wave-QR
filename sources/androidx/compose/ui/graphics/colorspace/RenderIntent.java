package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class RenderIntent {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16230b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16231c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16232d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16233e = d(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16234f = d(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f16235a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return RenderIntent.f16234f;
        }

        public final int b() {
            return RenderIntent.f16231c;
        }

        public final int c() {
            return RenderIntent.f16232d;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof RenderIntent) && i2 == ((RenderIntent) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f16231c) ? "Perceptual" : f(i2, f16232d) ? "Relative" : f(i2, f16233e) ? "Saturation" : f(i2, f16234f) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f16235a, obj);
    }

    public int hashCode() {
        return g(this.f16235a);
    }

    public final /* synthetic */ int i() {
        return this.f16235a;
    }

    public String toString() {
        return h(this.f16235a);
    }
}
