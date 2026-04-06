package androidx.compose.foundation.layout;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BoxKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableScatterMap f3780a = d(true);

    /* renamed from: b  reason: collision with root package name */
    public static final MutableScatterMap f3781b = d(false);

    /* renamed from: c  reason: collision with root package name */
    public static final MeasurePolicy f3782c = new BoxMeasurePolicy(Alignment.f15444a.o(), false);

    /* renamed from: d  reason: collision with root package name */
    public static final MeasurePolicy f3783d = BoxKt$EmptyBoxMeasurePolicy$1.f3786a;

    public static final void a(Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-211209833);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-211209833, i3, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            MeasurePolicy measurePolicy = f3783d;
            int a2 = ComposablesKt.a(q2, 0);
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            CompositionLocalMap I = q2.I();
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion.c());
            Updater.g(b2, I, companion.e());
            Updater.g(b2, e2, companion.d());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BoxKt$Box$2(modifier, i2));
        }
    }

    public static final MutableScatterMap d(boolean z2) {
        MutableScatterMap mutableScatterMap = new MutableScatterMap(9);
        Alignment.Companion companion = Alignment.f15444a;
        mutableScatterMap.x(companion.o(), new BoxMeasurePolicy(companion.o(), z2));
        mutableScatterMap.x(companion.m(), new BoxMeasurePolicy(companion.m(), z2));
        mutableScatterMap.x(companion.n(), new BoxMeasurePolicy(companion.n(), z2));
        mutableScatterMap.x(companion.h(), new BoxMeasurePolicy(companion.h(), z2));
        mutableScatterMap.x(companion.e(), new BoxMeasurePolicy(companion.e(), z2));
        mutableScatterMap.x(companion.f(), new BoxMeasurePolicy(companion.f(), z2));
        mutableScatterMap.x(companion.d(), new BoxMeasurePolicy(companion.d(), z2));
        mutableScatterMap.x(companion.b(), new BoxMeasurePolicy(companion.b(), z2));
        mutableScatterMap.x(companion.c(), new BoxMeasurePolicy(companion.c(), z2));
        return mutableScatterMap;
    }

    public static final BoxChildDataNode e(Measurable measurable) {
        Object t2 = measurable.t();
        if (t2 instanceof BoxChildDataNode) {
            return (BoxChildDataNode) t2;
        }
        return null;
    }

    public static final boolean f(Measurable measurable) {
        BoxChildDataNode e2 = e(measurable);
        if (e2 != null) {
            return e2.a3();
        }
        return false;
    }

    public static final MeasurePolicy g(Alignment alignment, boolean z2) {
        MeasurePolicy measurePolicy = (MeasurePolicy) (z2 ? f3780a : f3781b).e(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z2) : measurePolicy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.Z2();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.ui.layout.Placeable.PlacementScope r13, androidx.compose.ui.layout.Placeable r14, androidx.compose.ui.layout.Measurable r15, androidx.compose.ui.unit.LayoutDirection r16, int r17, int r18, androidx.compose.ui.Alignment r19) {
        /*
            androidx.compose.foundation.layout.BoxChildDataNode r0 = e(r15)
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.Alignment r0 = r0.Z2()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r1 = r0
            goto L_0x0011
        L_0x000f:
            r1 = r19
        L_0x0011:
            int r0 = r14.L0()
            int r2 = r14.C0()
            long r3 = (long) r0
            r0 = 32
            long r3 = r3 << r0
            long r5 = (long) r2
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r2 = r3 | r5
            long r2 = androidx.compose.ui.unit.IntSize.c(r2)
            r4 = r17
            long r4 = (long) r4
            long r4 = r4 << r0
            r0 = r18
            long r9 = (long) r0
            long r6 = r9 & r7
            long r4 = r4 | r6
            long r4 = androidx.compose.ui.unit.IntSize.c(r4)
            r6 = r16
            long r8 = r1.a(r2, r4, r6)
            r11 = 2
            r12 = 0
            r10 = 0
            r6 = r13
            r7 = r14
            androidx.compose.ui.layout.Placeable.PlacementScope.l(r6, r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.h(androidx.compose.ui.layout.Placeable$PlacementScope, androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.LayoutDirection, int, int, androidx.compose.ui.Alignment):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.ui.layout.MeasurePolicy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.layout.MeasurePolicy i(androidx.compose.ui.Alignment r5, boolean r6, androidx.compose.runtime.Composer r7, int r8) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)"
            r2 = 56522820(0x35e7844, float:6.5377995E-37)
            androidx.compose.runtime.ComposerKt.Y(r2, r8, r0, r1)
        L_0x000f:
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.o()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r0 == 0) goto L_0x0029
            if (r6 != 0) goto L_0x0029
            r5 = -1709785313(0xffffffff9a16bf1f, float:-3.117366E-23)
            r7.X(r5)
            r7.M()
            androidx.compose.ui.layout.MeasurePolicy r5 = f3782c
            goto L_0x0076
        L_0x0029:
            r0 = -1709737635(0xffffffff9a17795d, float:-3.1324105E-23)
            r7.X(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x003e
            boolean r0 = r7.W(r5)
            if (r0 != 0) goto L_0x0042
        L_0x003e:
            r0 = r8 & 6
            if (r0 != r3) goto L_0x0044
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x0053
            boolean r3 = r7.d(r6)
            if (r3 != 0) goto L_0x0057
        L_0x0053:
            r8 = r8 & 48
            if (r8 != r4) goto L_0x0058
        L_0x0057:
            r1 = r2
        L_0x0058:
            r8 = r0 | r1
            java.lang.Object r0 = r7.g()
            if (r8 != 0) goto L_0x0068
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x0070
        L_0x0068:
            androidx.compose.foundation.layout.BoxMeasurePolicy r0 = new androidx.compose.foundation.layout.BoxMeasurePolicy
            r0.<init>(r5, r6)
            r7.N(r0)
        L_0x0070:
            r5 = r0
            androidx.compose.foundation.layout.BoxMeasurePolicy r5 = (androidx.compose.foundation.layout.BoxMeasurePolicy) r5
            r7.M()
        L_0x0076:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x007f
            androidx.compose.runtime.ComposerKt.X()
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.i(androidx.compose.ui.Alignment, boolean, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }
}
