package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TileMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16143b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16144c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16145d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16146e = e(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16147f = e(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f16148a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TileMode.f16144c;
        }

        public final int b() {
            return TileMode.f16147f;
        }

        public final int c() {
            return TileMode.f16146e;
        }

        public final int d() {
            return TileMode.f16145d;
        }

        public Companion() {
        }
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof TileMode) && i2 == ((TileMode) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        return g(i2, f16144c) ? "Clamp" : g(i2, f16145d) ? "Repeated" : g(i2, f16146e) ? "Mirror" : g(i2, f16147f) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f16148a, obj);
    }

    public int hashCode() {
        return h(this.f16148a);
    }

    public final /* synthetic */ int j() {
        return this.f16148a;
    }

    public String toString() {
        return i(this.f16148a);
    }
}
