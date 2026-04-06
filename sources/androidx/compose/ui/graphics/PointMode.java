package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PointMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16097b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16098c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16099d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16100e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16101a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PointMode.f16099d;
        }

        public final int b() {
            return PointMode.f16098c;
        }

        public final int c() {
            return PointMode.f16100e;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof PointMode) && i2 == ((PointMode) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f16098c) ? "Points" : f(i2, f16099d) ? "Lines" : f(i2, f16100e) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f16101a, obj);
    }

    public int hashCode() {
        return g(this.f16101a);
    }

    public final /* synthetic */ int i() {
        return this.f16101a;
    }

    public String toString() {
        return h(this.f16101a);
    }
}
