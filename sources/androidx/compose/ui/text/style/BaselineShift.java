package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class BaselineShift {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19019b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final float f19020c = e(0.5f);

    /* renamed from: d  reason: collision with root package name */
    public static final float f19021d = e(-0.5f);

    /* renamed from: e  reason: collision with root package name */
    public static final float f19022e = e(0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f19023a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return BaselineShift.f19022e;
        }

        public final float b() {
            return BaselineShift.f19021d;
        }

        public final float c() {
            return BaselineShift.f19020c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ BaselineShift(float f2) {
        this.f19023a = f2;
    }

    public static final /* synthetic */ BaselineShift d(float f2) {
        return new BaselineShift(f2);
    }

    public static float e(float f2) {
        return f2;
    }

    public static boolean f(float f2, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f2, ((BaselineShift) obj).j()) == 0;
    }

    public static final boolean g(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    public static int h(float f2) {
        return Float.hashCode(f2);
    }

    public static String i(float f2) {
        return "BaselineShift(multiplier=" + f2 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f19023a, obj);
    }

    public int hashCode() {
        return h(this.f19023a);
    }

    public final /* synthetic */ float j() {
        return this.f19023a;
    }

    public String toString() {
        return i(this.f19023a);
    }
}
