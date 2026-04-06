package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LineHeightStyle {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f19056d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final LineHeightStyle f19057e = new LineHeightStyle(Alignment.f19061b.b(), Trim.f19071b.a(), Mode.f19067b.a(), (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final float f19058a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19059b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19060c;

    @JvmInline
    @Metadata
    public static final class Alignment {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19061b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final float f19062c = d(0.0f);

        /* renamed from: d  reason: collision with root package name */
        public static final float f19063d = d(0.5f);

        /* renamed from: e  reason: collision with root package name */
        public static final float f19064e = d(-1.0f);

        /* renamed from: f  reason: collision with root package name */
        public static final float f19065f = d(1.0f);

        /* renamed from: a  reason: collision with root package name */
        public final float f19066a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return Alignment.f19063d;
            }

            public final float b() {
                return Alignment.f19064e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Alignment(float f2) {
            this.f19066a = f2;
        }

        public static final /* synthetic */ Alignment c(float f2) {
            return new Alignment(f2);
        }

        public static float d(float f2) {
            if (!((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f)) {
                InlineClassHelperKt.c("topRatio should be in [0..1] range or -1");
            }
            return f2;
        }

        public static boolean e(float f2, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f2, ((Alignment) obj).i()) == 0;
        }

        public static final boolean f(float f2, float f3) {
            return Float.compare(f2, f3) == 0;
        }

        public static int g(float f2) {
            return Float.hashCode(f2);
        }

        public static String h(float f2) {
            if (f2 == f19062c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f2 == f19063d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f2 == f19064e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f2 == f19065f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f19066a, obj);
        }

        public int hashCode() {
            return g(this.f19066a);
        }

        public final /* synthetic */ float i() {
            return this.f19066a;
        }

        public String toString() {
            return h(this.f19066a);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LineHeightStyle a() {
            return LineHeightStyle.f19057e;
        }

        public Companion() {
        }
    }

    @JvmInline
    @Metadata
    public static final class Mode {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19067b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f19068c = d(0);

        /* renamed from: d  reason: collision with root package name */
        public static final int f19069d = d(1);

        /* renamed from: a  reason: collision with root package name */
        public final int f19070a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return Mode.f19068c;
            }

            public final int b() {
                return Mode.f19069d;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Mode(int i2) {
            this.f19070a = i2;
        }

        public static final /* synthetic */ Mode c(int i2) {
            return new Mode(i2);
        }

        public static int d(int i2) {
            return i2;
        }

        public static boolean e(int i2, Object obj) {
            return (obj instanceof Mode) && i2 == ((Mode) obj).i();
        }

        public static final boolean f(int i2, int i3) {
            return i2 == i3;
        }

        public static int g(int i2) {
            return Integer.hashCode(i2);
        }

        public static String h(int i2) {
            return "Mode(value=" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f19070a, obj);
        }

        public int hashCode() {
            return g(this.f19070a);
        }

        public final /* synthetic */ int i() {
            return this.f19070a;
        }

        public String toString() {
            return h(this.f19070a);
        }
    }

    @JvmInline
    @Metadata
    public static final class Trim {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f19071b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f19072c = d(1);

        /* renamed from: d  reason: collision with root package name */
        public static final int f19073d = d(16);

        /* renamed from: e  reason: collision with root package name */
        public static final int f19074e = d(17);

        /* renamed from: f  reason: collision with root package name */
        public static final int f19075f = d(0);

        /* renamed from: a  reason: collision with root package name */
        public final int f19076a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return Trim.f19074e;
            }

            public final int b() {
                return Trim.f19075f;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Trim(int i2) {
            this.f19076a = i2;
        }

        public static final /* synthetic */ Trim c(int i2) {
            return new Trim(i2);
        }

        public static int d(int i2) {
            return i2;
        }

        public static boolean e(int i2, Object obj) {
            return (obj instanceof Trim) && i2 == ((Trim) obj).k();
        }

        public static final boolean f(int i2, int i3) {
            return i2 == i3;
        }

        public static int g(int i2) {
            return Integer.hashCode(i2);
        }

        public static final boolean h(int i2) {
            return (i2 & 1) > 0;
        }

        public static final boolean i(int i2) {
            return (i2 & 16) > 0;
        }

        public static String j(int i2) {
            return i2 == f19072c ? "LineHeightStyle.Trim.FirstLineTop" : i2 == f19073d ? "LineHeightStyle.Trim.LastLineBottom" : i2 == f19074e ? "LineHeightStyle.Trim.Both" : i2 == f19075f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.f19076a, obj);
        }

        public int hashCode() {
            return g(this.f19076a);
        }

        public final /* synthetic */ int k() {
            return this.f19076a;
        }

        public String toString() {
            return j(this.f19076a);
        }
    }

    public /* synthetic */ LineHeightStyle(float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, i2, i3);
    }

    public final float b() {
        return this.f19058a;
    }

    public final int c() {
        return this.f19060c;
    }

    public final int d() {
        return this.f19059b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.f(this.f19058a, lineHeightStyle.f19058a) && Trim.f(this.f19059b, lineHeightStyle.f19059b) && Mode.f(this.f19060c, lineHeightStyle.f19060c);
    }

    public int hashCode() {
        return (((Alignment.g(this.f19058a) * 31) + Trim.g(this.f19059b)) * 31) + Mode.g(this.f19060c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + Alignment.h(this.f19058a) + ", trim=" + Trim.j(this.f19059b) + ",mode=" + Mode.h(this.f19060c) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, i2);
    }

    public LineHeightStyle(float f2, int i2, int i3) {
        this.f19058a = f2;
        this.f19059b = i2;
        this.f19060c = i3;
    }

    public LineHeightStyle(float f2, int i2) {
        this(f2, i2, Mode.f19067b.a(), (DefaultConstructorMarker) null);
    }
}
