package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class AndroidExternalSurfaceZOrder {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f2892b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f2893c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f2894d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f2895e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f2896a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AndroidExternalSurfaceZOrder.f2893c;
        }

        public final int b() {
            return AndroidExternalSurfaceZOrder.f2894d;
        }

        public final int c() {
            return AndroidExternalSurfaceZOrder.f2895e;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i2 == ((AndroidExternalSurfaceZOrder) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f2896a, obj);
    }

    public int hashCode() {
        return g(this.f2896a);
    }

    public final /* synthetic */ int i() {
        return this.f2896a;
    }

    public String toString() {
        return h(this.f2896a);
    }
}
