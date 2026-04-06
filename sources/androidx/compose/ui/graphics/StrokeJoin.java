package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class StrokeJoin {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16135b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16136c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16137d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16138e = e(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16139a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return StrokeJoin.f16138e;
        }

        public final int b() {
            return StrokeJoin.f16136c;
        }

        public final int c() {
            return StrokeJoin.f16137d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ StrokeJoin(int i2) {
        this.f16139a = i2;
    }

    public static final /* synthetic */ StrokeJoin d(int i2) {
        return new StrokeJoin(i2);
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof StrokeJoin) && i2 == ((StrokeJoin) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        return g(i2, f16136c) ? "Miter" : g(i2, f16137d) ? "Round" : g(i2, f16138e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f16139a, obj);
    }

    public int hashCode() {
        return h(this.f16139a);
    }

    public final /* synthetic */ int j() {
        return this.f16139a;
    }

    public String toString() {
        return i(this.f16139a);
    }
}
