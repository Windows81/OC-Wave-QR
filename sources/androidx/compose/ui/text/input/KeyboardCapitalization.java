package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class KeyboardCapitalization {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18845b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18846c = g(-1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18847d = g(0);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18848e = g(1);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18849f = g(2);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18850g = g(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f18851a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return KeyboardCapitalization.f18848e;
        }

        public final int b() {
            return KeyboardCapitalization.f18847d;
        }

        public final int c() {
            return KeyboardCapitalization.f18850g;
        }

        public final int d() {
            return KeyboardCapitalization.f18846c;
        }

        public final int e() {
            return KeyboardCapitalization.f18849f;
        }

        public Companion() {
        }
    }

    public /* synthetic */ KeyboardCapitalization(int i2) {
        this.f18851a = i2;
    }

    public static final /* synthetic */ KeyboardCapitalization f(int i2) {
        return new KeyboardCapitalization(i2);
    }

    public static int g(int i2) {
        return i2;
    }

    public static boolean h(int i2, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i2 == ((KeyboardCapitalization) obj).l();
    }

    public static final boolean i(int i2, int i3) {
        return i2 == i3;
    }

    public static int j(int i2) {
        return Integer.hashCode(i2);
    }

    public static String k(int i2) {
        return i(i2, f18846c) ? "Unspecified" : i(i2, f18847d) ? "None" : i(i2, f18848e) ? "Characters" : i(i2, f18849f) ? "Words" : i(i2, f18850g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f18851a, obj);
    }

    public int hashCode() {
        return j(this.f18851a);
    }

    public final /* synthetic */ int l() {
        return this.f18851a;
    }

    public String toString() {
        return k(this.f18851a);
    }
}
