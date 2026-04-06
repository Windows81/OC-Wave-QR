package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class ComposableLambdaImpl implements ComposableLambda {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f15127A;

    /* renamed from: B  reason: collision with root package name */
    public Object f15128B;
    public RecomposeScope C;
    public List D;

    /* renamed from: z  reason: collision with root package name */
    public final int f15129z;

    public ComposableLambdaImpl(int i2, boolean z2, Object obj) {
        this.f15129z = i2;
        this.f15127A = z2;
        this.f15128B = obj;
    }

    public static final Unit t(ComposableLambdaImpl composableLambdaImpl, Object obj, int i2, Composer composer, int i3) {
        composableLambdaImpl.i(obj, composer, RecomposeScopeImplKt.a(i2) | 1);
        return Unit.f40552a;
    }

    public static final Unit u(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i2, Composer composer, int i3) {
        composableLambdaImpl.k(obj, obj2, composer, RecomposeScopeImplKt.a(i2) | 1);
        return Unit.f40552a;
    }

    public static final Unit v(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i2, Composer composer, int i3) {
        composableLambdaImpl.p(obj, obj2, obj3, composer, RecomposeScopeImplKt.a(i2) | 1);
        return Unit.f40552a;
    }

    public static final Unit w(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i2, Composer composer, int i3) {
        composableLambdaImpl.q(obj, obj2, obj3, obj4, composer, RecomposeScopeImplKt.a(i2) | 1);
        return Unit.f40552a;
    }

    public static final Unit x(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, Composer composer, int i3) {
        composableLambdaImpl.s(obj, obj2, obj3, obj4, obj5, composer, RecomposeScopeImplKt.a(i2) | 1);
        return Unit.f40552a;
    }

    public final void A(Object obj) {
        if (!Intrinsics.d(this.f15128B, obj)) {
            boolean z2 = this.f15128B == null;
            this.f15128B = obj;
            if (!z2) {
                z();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return i(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public Object h(Composer composer, int i2) {
        Composer q2 = composer.q(this.f15129z);
        y(q2);
        int d2 = i2 | (q2.W(this) ? ComposableLambdaKt.d(0) : ComposableLambdaKt.g(0));
        Object obj = this.f15128B;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object m2 = ((Function2) TypeIntrinsics.e(obj, 2)).m(q2, Integer.valueOf(d2));
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ComposableLambdaImpl$invoke$1(this));
        }
        return m2;
    }

    public Object i(Object obj, Composer composer, int i2) {
        Composer q2 = composer.q(this.f15129z);
        y(q2);
        int d2 = q2.W(this) ? ComposableLambdaKt.d(1) : ComposableLambdaKt.g(1);
        Object obj2 = this.f15128B;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object d3 = ((Function3) TypeIntrinsics.e(obj2, 3)).d(obj, q2, Integer.valueOf(d2 | i2));
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(this, obj, i2));
        }
        return d3;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return k(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    public Object k(Object obj, Object obj2, Composer composer, int i2) {
        Composer q2 = composer.q(this.f15129z);
        y(q2);
        int d2 = q2.W(this) ? ComposableLambdaKt.d(2) : ComposableLambdaKt.g(2);
        Object obj3 = this.f15128B;
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object j2 = ((Function4) TypeIntrinsics.e(obj3, 4)).j(obj, obj2, q2, Integer.valueOf(d2 | i2));
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(this, obj, obj2, i2));
        }
        return j2;
    }

    public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return q(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return h((Composer) obj, ((Number) obj2).intValue());
    }

    public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return p(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    public Object p(Object obj, Object obj2, Object obj3, Composer composer, int i2) {
        Composer q2 = composer.q(this.f15129z);
        y(q2);
        int d2 = q2.W(this) ? ComposableLambdaKt.d(3) : ComposableLambdaKt.g(3);
        Object obj4 = this.f15128B;
        Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object n2 = ((Function5) TypeIntrinsics.e(obj4, 5)).n(obj, obj2, obj3, q2, Integer.valueOf(d2 | i2));
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new b(this, obj, obj2, obj3, i2));
        }
        return n2;
    }

    public Object q(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i2) {
        Composer q2 = composer.q(this.f15129z);
        y(q2);
        int d2 = q2.W(this) ? ComposableLambdaKt.d(4) : ComposableLambdaKt.g(4);
        Object obj5 = this.f15128B;
        Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object l2 = ((Function6) TypeIntrinsics.e(obj5, 6)).l(obj, obj2, obj3, obj4, q2, Integer.valueOf(d2 | i2));
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(this, obj, obj2, obj3, obj4, i2));
        }
        return l2;
    }

    public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return s(obj, obj2, obj3, obj4, obj5, (Composer) obj6, ((Number) obj7).intValue());
    }

    public Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, int i2) {
        Composer q2 = composer.q(this.f15129z);
        y(q2);
        int d2 = q2.W(this) ? ComposableLambdaKt.d(5) : ComposableLambdaKt.g(5);
        Object obj6 = this.f15128B;
        Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object r2 = ((Function7) TypeIntrinsics.e(obj6, 7)).r(obj, obj2, obj3, obj4, obj5, q2, Integer.valueOf(i2 | d2));
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new d(this, obj, obj2, obj3, obj4, obj5, i2));
        }
        return r2;
    }

    public final void y(Composer composer) {
        RecomposeScope b2;
        if (this.f15127A && (b2 = composer.b()) != null) {
            composer.L(b2);
            if (ComposableLambdaKt.f(this.C, b2)) {
                this.C = b2;
                return;
            }
            List list = this.D;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.D = arrayList;
                arrayList.add(b2);
                return;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (ComposableLambdaKt.f((RecomposeScope) list.get(i2), b2)) {
                    list.set(i2, b2);
                    return;
                }
            }
            list.add(b2);
        }
    }

    public final void z() {
        if (this.f15127A) {
            RecomposeScope recomposeScope = this.C;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.C = null;
            }
            List list = this.D;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((RecomposeScope) list.get(i2)).invalidate();
                }
                list.clear();
            }
        }
    }
}
