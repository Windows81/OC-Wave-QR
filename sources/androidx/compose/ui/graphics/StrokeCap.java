package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class StrokeCap {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16130b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16131c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16132d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16133e = e(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16134a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return StrokeCap.f16131c;
        }

        public final int b() {
            return StrokeCap.f16132d;
        }

        public final int c() {
            return StrokeCap.f16133e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ StrokeCap(int i2) {
        this.f16134a = i2;
    }

    public static final /* synthetic */ StrokeCap d(int i2) {
        return new StrokeCap(i2);
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof StrokeCap) && i2 == ((StrokeCap) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        return g(i2, f16131c) ? "Butt" : g(i2, f16132d) ? "Round" : g(i2, f16133e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f16134a, obj);
    }

    public int hashCode() {
        return h(this.f16134a);
    }

    public final /* synthetic */ int j() {
        return this.f16134a;
    }

    public String toString() {
        return i(this.f16134a);
    }
}
