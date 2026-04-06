package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextMotion {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f19115c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final TextMotion f19116d;

    /* renamed from: e  reason: collision with root package name */
    public static final TextMotion f19117e;

    /* renamed from: a  reason: collision with root package name */
    public final int f19118a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19119b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextMotion a() {
            return TextMotion.f19116d;
        }

        public Companion() {
        }
    }

    @JvmInline
    @Metadata
    public static final class Linearity {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19120b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f19121c = e(1);

        /* renamed from: d  reason: collision with root package name */
        public static final int f19122d = e(2);

        /* renamed from: e  reason: collision with root package name */
        public static final int f19123e = e(3);

        /* renamed from: a  reason: collision with root package name */
        public final int f19124a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return Linearity.f19122d;
            }

            public final int b() {
                return Linearity.f19121c;
            }

            public final int c() {
                return Linearity.f19123e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Linearity(int i2) {
            this.f19124a = i2;
        }

        public static final /* synthetic */ Linearity d(int i2) {
            return new Linearity(i2);
        }

        public static int e(int i2) {
            return i2;
        }

        public static boolean f(int i2, Object obj) {
            return (obj instanceof Linearity) && i2 == ((Linearity) obj).j();
        }

        public static final boolean g(int i2, int i3) {
            return i2 == i3;
        }

        public static int h(int i2) {
            return Integer.hashCode(i2);
        }

        public static String i(int i2) {
            return g(i2, f19121c) ? "Linearity.Linear" : g(i2, f19122d) ? "Linearity.FontHinting" : g(i2, f19123e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f19124a, obj);
        }

        public int hashCode() {
            return h(this.f19124a);
        }

        public final /* synthetic */ int j() {
            return this.f19124a;
        }

        public String toString() {
            return i(this.f19124a);
        }
    }

    static {
        Linearity.Companion companion = Linearity.f19120b;
        f19116d = new TextMotion(companion.a(), false, (DefaultConstructorMarker) null);
        f19117e = new TextMotion(companion.b(), true, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextMotion(int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2);
    }

    public final int b() {
        return this.f19118a;
    }

    public final boolean c() {
        return this.f19119b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.g(this.f19118a, textMotion.f19118a) && this.f19119b == textMotion.f19119b;
    }

    public int hashCode() {
        return (Linearity.h(this.f19118a) * 31) + Boolean.hashCode(this.f19119b);
    }

    public String toString() {
        return Intrinsics.d(this, f19116d) ? "TextMotion.Static" : Intrinsics.d(this, f19117e) ? "TextMotion.Animated" : "Invalid";
    }

    public TextMotion(int i2, boolean z2) {
        this.f19118a = i2;
        this.f19119b = z2;
    }
}
