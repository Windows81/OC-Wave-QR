package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PaintingStyle {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16061b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16062c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16063d = c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f16064a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PaintingStyle.f16062c;
        }

        public final int b() {
            return PaintingStyle.f16063d;
        }

        public Companion() {
        }
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof PaintingStyle) && i2 == ((PaintingStyle) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return e(i2, f16062c) ? "Fill" : e(i2, f16063d) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return d(this.f16064a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f16064a;
    }

    public int hashCode() {
        return f(this.f16064a);
    }

    public String toString() {
        return g(this.f16064a);
    }
}
