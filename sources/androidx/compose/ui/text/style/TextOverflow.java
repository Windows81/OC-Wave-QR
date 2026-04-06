package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextOverflow {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19125b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19126c = f(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19127d = f(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19128e = f(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f19129f = f(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f19130g = f(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f19131a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TextOverflow.f19126c;
        }

        public final int b() {
            return TextOverflow.f19127d;
        }

        public final int c() {
            return TextOverflow.f19130g;
        }

        public final int d() {
            return TextOverflow.f19129f;
        }

        public final int e() {
            return TextOverflow.f19128e;
        }

        public Companion() {
        }
    }

    public static int f(int i2) {
        return i2;
    }

    public static boolean g(int i2, Object obj) {
        return (obj instanceof TextOverflow) && i2 == ((TextOverflow) obj).k();
    }

    public static final boolean h(int i2, int i3) {
        return i2 == i3;
    }

    public static int i(int i2) {
        return Integer.hashCode(i2);
    }

    public static String j(int i2) {
        return h(i2, f19126c) ? "Clip" : h(i2, f19127d) ? "Ellipsis" : h(i2, f19130g) ? "MiddleEllipsis" : h(i2, f19128e) ? "Visible" : h(i2, f19129f) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f19131a, obj);
    }

    public int hashCode() {
        return i(this.f19131a);
    }

    public final /* synthetic */ int k() {
        return this.f19131a;
    }

    public String toString() {
        return j(this.f19131a);
    }
}
