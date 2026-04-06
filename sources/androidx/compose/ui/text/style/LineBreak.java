package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class LineBreak {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19032b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19033c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19034d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19035e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f19036f = d(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f19037a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return LineBreak.f19033c;
        }

        public final int b() {
            return LineBreak.f19036f;
        }

        public Companion() {
        }
    }

    @JvmInline
    @Metadata
    public static final class Strategy {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19038b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f19039c = d(1);

        /* renamed from: d  reason: collision with root package name */
        public static final int f19040d = d(2);

        /* renamed from: e  reason: collision with root package name */
        public static final int f19041e = d(3);

        /* renamed from: f  reason: collision with root package name */
        public static final int f19042f = d(0);

        /* renamed from: a  reason: collision with root package name */
        public final int f19043a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return Strategy.f19041e;
            }

            public final int b() {
                return Strategy.f19040d;
            }

            public final int c() {
                return Strategy.f19039c;
            }

            public Companion() {
            }
        }

        public static int d(int i2) {
            return i2;
        }

        public static boolean e(int i2, Object obj) {
            return (obj instanceof Strategy) && i2 == ((Strategy) obj).i();
        }

        public static final boolean f(int i2, int i3) {
            return i2 == i3;
        }

        public static int g(int i2) {
            return Integer.hashCode(i2);
        }

        public static String h(int i2) {
            return f(i2, f19039c) ? "Strategy.Simple" : f(i2, f19040d) ? "Strategy.HighQuality" : f(i2, f19041e) ? "Strategy.Balanced" : f(i2, f19042f) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.f19043a, obj);
        }

        public int hashCode() {
            return g(this.f19043a);
        }

        public final /* synthetic */ int i() {
            return this.f19043a;
        }

        public String toString() {
            return h(this.f19043a);
        }
    }

    @JvmInline
    @Metadata
    public static final class Strictness {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19044b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f19045c = e(1);

        /* renamed from: d  reason: collision with root package name */
        public static final int f19046d = e(2);

        /* renamed from: e  reason: collision with root package name */
        public static final int f19047e = e(3);

        /* renamed from: f  reason: collision with root package name */
        public static final int f19048f = e(4);

        /* renamed from: g  reason: collision with root package name */
        public static final int f19049g = e(0);

        /* renamed from: a  reason: collision with root package name */
        public final int f19050a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return Strictness.f19045c;
            }

            public final int b() {
                return Strictness.f19046d;
            }

            public final int c() {
                return Strictness.f19047e;
            }

            public final int d() {
                return Strictness.f19048f;
            }

            public Companion() {
            }
        }

        public static int e(int i2) {
            return i2;
        }

        public static boolean f(int i2, Object obj) {
            return (obj instanceof Strictness) && i2 == ((Strictness) obj).j();
        }

        public static final boolean g(int i2, int i3) {
            return i2 == i3;
        }

        public static int h(int i2) {
            return Integer.hashCode(i2);
        }

        public static String i(int i2) {
            return g(i2, f19045c) ? "Strictness.None" : g(i2, f19046d) ? "Strictness.Loose" : g(i2, f19047e) ? "Strictness.Normal" : g(i2, f19048f) ? "Strictness.Strict" : g(i2, f19049g) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f19050a, obj);
        }

        public int hashCode() {
            return h(this.f19050a);
        }

        public final /* synthetic */ int j() {
            return this.f19050a;
        }

        public String toString() {
            return i(this.f19050a);
        }
    }

    @JvmInline
    @Metadata
    public static final class WordBreak {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19051b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f19052c = c(1);

        /* renamed from: d  reason: collision with root package name */
        public static final int f19053d = c(2);

        /* renamed from: e  reason: collision with root package name */
        public static final int f19054e = c(0);

        /* renamed from: a  reason: collision with root package name */
        public final int f19055a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return WordBreak.f19052c;
            }

            public final int b() {
                return WordBreak.f19053d;
            }

            public Companion() {
            }
        }

        public static int c(int i2) {
            return i2;
        }

        public static boolean d(int i2, Object obj) {
            return (obj instanceof WordBreak) && i2 == ((WordBreak) obj).h();
        }

        public static final boolean e(int i2, int i3) {
            return i2 == i3;
        }

        public static int f(int i2) {
            return Integer.hashCode(i2);
        }

        public static String g(int i2) {
            return e(i2, f19052c) ? "WordBreak.None" : e(i2, f19053d) ? "WordBreak.Phrase" : e(i2, f19054e) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return d(this.f19055a, obj);
        }

        public final /* synthetic */ int h() {
            return this.f19055a;
        }

        public int hashCode() {
            return f(this.f19055a);
        }

        public String toString() {
            return g(this.f19055a);
        }
    }

    static {
        Strategy.Companion companion = Strategy.f19038b;
        int c2 = companion.c();
        Strictness.Companion companion2 = Strictness.f19044b;
        int c3 = companion2.c();
        WordBreak.Companion companion3 = WordBreak.f19051b;
        f19033c = d(LineBreak_androidKt.e(c2, c3, companion3.a()));
        f19034d = d(LineBreak_androidKt.e(companion.a(), companion2.b(), companion3.b()));
        f19035e = d(LineBreak_androidKt.e(companion.b(), companion2.d(), companion3.a()));
    }

    public /* synthetic */ LineBreak(int i2) {
        this.f19037a = i2;
    }

    public static final /* synthetic */ LineBreak c(int i2) {
        return new LineBreak(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof LineBreak) && i2 == ((LineBreak) obj).l();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static final int g(int i2) {
        return Strategy.d(LineBreak_androidKt.f(i2));
    }

    public static final int h(int i2) {
        return Strictness.e(LineBreak_androidKt.g(i2));
    }

    public static final int i(int i2) {
        return WordBreak.c(LineBreak_androidKt.h(i2));
    }

    public static int j(int i2) {
        return Integer.hashCode(i2);
    }

    public static String k(int i2) {
        return "LineBreak(strategy=" + Strategy.h(g(i2)) + ", strictness=" + Strictness.i(h(i2)) + ", wordBreak=" + WordBreak.g(i(i2)) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f19037a, obj);
    }

    public int hashCode() {
        return j(this.f19037a);
    }

    public final /* synthetic */ int l() {
        return this.f19037a;
    }

    public String toString() {
        return k(this.f19037a);
    }
}
