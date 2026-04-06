package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FontStyle {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18724b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18725c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18726d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f18727a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FontStyle.f18726d;
        }

        public final int b() {
            return FontStyle.f18725c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FontStyle(int i2) {
        this.f18727a = i2;
    }

    public static final /* synthetic */ FontStyle c(int i2) {
        return new FontStyle(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof FontStyle) && i2 == ((FontStyle) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f18725c) ? "Normal" : f(i2, f18726d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f18727a, obj);
    }

    public int hashCode() {
        return g(this.f18727a);
    }

    public final /* synthetic */ int i() {
        return this.f18727a;
    }

    public String toString() {
        return h(this.f18727a);
    }
}
