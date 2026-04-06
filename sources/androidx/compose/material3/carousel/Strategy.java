package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class Strategy {

    /* renamed from: n  reason: collision with root package name */
    public static final Companion f11950n = new Companion((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f11951o = 8;

    /* renamed from: p  reason: collision with root package name */
    public static final Strategy f11952p = new Strategy(KeylineListKt.a(), CollectionsKt.m(), CollectionsKt.m(), 0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final KeylineList f11953a;

    /* renamed from: b  reason: collision with root package name */
    public final List f11954b;

    /* renamed from: c  reason: collision with root package name */
    public final List f11955c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11956d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11957e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11958f;

    /* renamed from: g  reason: collision with root package name */
    public final float f11959g;

    /* renamed from: h  reason: collision with root package name */
    public final float f11960h;

    /* renamed from: i  reason: collision with root package name */
    public final float f11961i;

    /* renamed from: j  reason: collision with root package name */
    public final FloatList f11962j;

    /* renamed from: k  reason: collision with root package name */
    public final FloatList f11963k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f11964l;

    /* renamed from: m  reason: collision with root package name */
    public List f11965m;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Strategy(KeylineList keylineList, List list, List list2, float f2, float f3, float f4, float f5) {
        this.f11953a = keylineList;
        this.f11954b = list;
        this.f11955c = list2;
        this.f11956d = f2;
        this.f11957e = f3;
        this.f11958f = f4;
        this.f11959g = f5;
        float g2 = StrategyKt.p(list, f4);
        this.f11960h = g2;
        float d2 = StrategyKt.m(list2, f5);
        this.f11961i = d2;
        boolean z2 = true;
        this.f11962j = StrategyKt.q(g2, list, true);
        this.f11963k = StrategyKt.q(d2, list2, false);
        this.f11964l = (keylineList.isEmpty() || f2 == 0.0f || d() == 0.0f) ? false : z2;
    }

    public static /* synthetic */ KeylineList g(Strategy strategy, float f2, float f3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return strategy.f(f2, f3, z2);
    }

    public final float a() {
        return this.f11956d;
    }

    public final KeylineList b() {
        return this.f11953a;
    }

    public final List c() {
        return this.f11955c;
    }

    public final float d() {
        return this.f11953a.m().e();
    }

    public final float e() {
        return this.f11957e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z2 = this.f11964l;
        if (!z2 && !((Strategy) obj).f11964l) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z2 == strategy.f11964l && this.f11956d == strategy.f11956d && this.f11957e == strategy.f11957e && this.f11958f == strategy.f11958f && this.f11959g == strategy.f11959g && d() == strategy.d() && this.f11960h == strategy.f11960h && this.f11961i == strategy.f11961i && Intrinsics.d(this.f11962j, strategy.f11962j) && Intrinsics.d(this.f11963k, strategy.f11963k) && Intrinsics.d(this.f11953a, strategy.f11953a);
    }

    public final KeylineList f(float f2, float f3, boolean z2) {
        float max = Math.max(0.0f, f2);
        float f4 = this.f11960h;
        float max2 = Math.max(0.0f, f3 - this.f11961i);
        if (f4 <= max && max <= max2) {
            return this.f11953a;
        }
        float i2 = StrategyKt.r(1.0f, 0.0f, 0.0f, f4, max);
        FloatList floatList = this.f11962j;
        List list = this.f11954b;
        if (max > max2) {
            i2 = StrategyKt.r(0.0f, 1.0f, max2, f3, max);
            floatList = this.f11963k;
            list = this.f11955c;
            if (max2 < 0.01f && this.f11954b.size() == 2 && this.f11955c.size() == 2) {
                if (this.f11965m == null) {
                    this.f11965m = CollectionsKt.p(CollectionsKt.p0(this.f11954b), CollectionsKt.p0(this.f11955c));
                }
                list = this.f11965m;
                Intrinsics.f(list);
            }
        }
        ShiftPointRange e2 = StrategyKt.n(list.size(), floatList, i2);
        if (!z2) {
            return KeylineListKt.d((KeylineList) list.get(e2.a()), (KeylineList) list.get(e2.c()), e2.b());
        }
        return (KeylineList) list.get(MathKt.d(e2.b()) == 0 ? e2.a() : e2.c());
    }

    public final List h() {
        return this.f11954b;
    }

    public int hashCode() {
        boolean z2 = this.f11964l;
        return !z2 ? Boolean.hashCode(z2) : (((((((((((((((((((Boolean.hashCode(z2) * 31) + Float.hashCode(this.f11956d)) * 31) + Float.hashCode(this.f11957e)) * 31) + Float.hashCode(this.f11958f)) * 31) + Float.hashCode(this.f11959g)) * 31) + Float.hashCode(d())) * 31) + Float.hashCode(this.f11960h)) * 31) + Float.hashCode(this.f11961i)) * 31) + this.f11962j.hashCode()) * 31) + this.f11963k.hashCode()) * 31) + this.f11953a.hashCode();
    }

    public final boolean i() {
        return this.f11964l;
    }

    public Strategy(KeylineList keylineList, float f2, float f3, float f4, float f5) {
        this(keylineList, StrategyKt.o(keylineList, f2, f3, f4), StrategyKt.l(keylineList, f2, f3, f5), f2, f3, f4, f5);
    }
}
