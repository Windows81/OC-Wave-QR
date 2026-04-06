package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ImeAction {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18821b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18822c = k(-1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18823d = k(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18824e = k(0);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18825f = k(2);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18826g = k(3);

    /* renamed from: h  reason: collision with root package name */
    public static final int f18827h = k(4);

    /* renamed from: i  reason: collision with root package name */
    public static final int f18828i = k(5);

    /* renamed from: j  reason: collision with root package name */
    public static final int f18829j = k(6);

    /* renamed from: k  reason: collision with root package name */
    public static final int f18830k = k(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f18831a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ImeAction.f18823d;
        }

        public final int b() {
            return ImeAction.f18830k;
        }

        public final int c() {
            return ImeAction.f18825f;
        }

        public final int d() {
            return ImeAction.f18829j;
        }

        public final int e() {
            return ImeAction.f18824e;
        }

        public final int f() {
            return ImeAction.f18828i;
        }

        public final int g() {
            return ImeAction.f18826g;
        }

        public final int h() {
            return ImeAction.f18827h;
        }

        public final int i() {
            return ImeAction.f18822c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ImeAction(int i2) {
        this.f18831a = i2;
    }

    public static final /* synthetic */ ImeAction j(int i2) {
        return new ImeAction(i2);
    }

    public static int k(int i2) {
        return i2;
    }

    public static boolean l(int i2, Object obj) {
        return (obj instanceof ImeAction) && i2 == ((ImeAction) obj).p();
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static int n(int i2) {
        return Integer.hashCode(i2);
    }

    public static String o(int i2) {
        return m(i2, f18822c) ? "Unspecified" : m(i2, f18824e) ? "None" : m(i2, f18823d) ? "Default" : m(i2, f18825f) ? "Go" : m(i2, f18826g) ? "Search" : m(i2, f18827h) ? "Send" : m(i2, f18828i) ? "Previous" : m(i2, f18829j) ? "Next" : m(i2, f18830k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f18831a, obj);
    }

    public int hashCode() {
        return n(this.f18831a);
    }

    public final /* synthetic */ int p() {
        return this.f18831a;
    }

    public String toString() {
        return o(this.f18831a);
    }
}
