package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class WideNavigationRailKt$WideNavigationRailLayout$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11761A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11762B;
    public final /* synthetic */ State C;
    public final /* synthetic */ float D;
    public final /* synthetic */ State E;
    public final /* synthetic */ State F;
    public final /* synthetic */ MutableIntState G;
    public final /* synthetic */ MutableIntState H;
    public final /* synthetic */ Arrangement.Vertical I;
    public final /* synthetic */ State J;
    public final /* synthetic */ Function2 K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f11763z;

    public WideNavigationRailKt$WideNavigationRailLayout$1(WindowInsets windowInsets, Function2 function2, boolean z2, State state, float f2, State state2, State state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State state4, Function2 function22) {
        this.f11763z = windowInsets;
        this.f11761A = function2;
        this.f11762B = z2;
        this.C = state;
        this.D = f2;
        this.E = state2;
        this.F = state3;
        this.G = mutableIntState;
        this.H = mutableIntState2;
        this.I = vertical;
        this.J = state4;
        this.K = function22;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.H0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1489314345, i3, -1, "androidx.compose.material3.WideNavigationRailLayout.<anonymous> (WideNavigationRail.kt:258)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier a2 = SelectableGroupKt.a(PaddingKt.m(SizeKt.A(WindowInsetsPaddingKt.e(SizeKt.d(companion, 0.0f, 1, (Object) null), this.f11763z), 0.0f, WideNavigationRailKt.f11748g, 1, (Object) null), 0.0f, WideNavigationRailKt.f11744c, 0.0f, 0.0f, 13, (Object) null));
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new B8();
                composer2.N(g2);
            }
            Modifier d2 = SemanticsModifierKt.d(a2, false, (Function1) g2, 1, (Object) null);
            final Function2 function2 = this.f11761A;
            final boolean z2 = this.f11762B;
            final State state = this.C;
            final float f2 = this.D;
            final State state2 = this.E;
            final State state3 = this.F;
            final MutableIntState mutableIntState = this.G;
            MutableIntState mutableIntState2 = this.H;
            final Arrangement.Vertical vertical = this.I;
            final MutableIntState mutableIntState3 = mutableIntState2;
            final State state4 = this.J;
            AnonymousClass2 r8 = new MeasurePolicy() {
                /* access modifiers changed from: private */
                public static final Unit e(Placeable.PlacementScope placementScope) {
                    return Unit.f40552a;
                }

                public static final Unit g(int i2, MeasureScope measureScope, Ref.ObjectRef objectRef, List list, Arrangement.Vertical vertical, State state, Placeable.PlacementScope placementScope) {
                    int i3;
                    int P1 = i2 - measureScope.P1(WideNavigationRailKt.f11744c);
                    Object obj = objectRef.f40908z;
                    if (obj == null || ((Placeable) obj).C0() <= 0) {
                        i3 = 0;
                    } else {
                        Placeable.PlacementScope.n(placementScope, (Placeable) objectRef.f40908z, 0, 0, 0.0f, 4, (Object) null);
                        i3 = ((Placeable) objectRef.f40908z).C0() + measureScope.P1(WideNavigationRailKt.f11745d);
                    }
                    if (list != null) {
                        if (!Intrinsics.d(vertical, Arrangement.f3739a.b())) {
                            P1 -= i3;
                        }
                        int[] iArr = new int[list.size()];
                        Collection collection = list;
                        int size = collection.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            iArr[i4] = ((Placeable) list.get(i4)).C0();
                            if (i4 < list.size() - 1) {
                                iArr[i4] = iArr[i4] + measureScope.P1(WideNavigationRailKt.D(state));
                            }
                        }
                        int[] iArr2 = new int[list.size()];
                        vertical.b(measureScope, P1, iArr, iArr2);
                        if (Intrinsics.d(vertical, Arrangement.f3739a.b())) {
                            i3 = 0;
                        }
                        int size2 = collection.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i5), 0, iArr2[i5] + i3, 0.0f, 4, (Object) null);
                        }
                    }
                    return Unit.f40552a;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0183: MOVE  (r3v4 int) = (r24v1 int)
                    	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
                    	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
                    	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
                    	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
                    	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
                    	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
                    */
                public androidx.compose.ui.layout.MeasureResult b(androidx.compose.ui.layout.MeasureScope r28, java.util.List r29, long r30) {
                    /*
                        r27 = this;
                        r0 = r27
                        r8 = r28
                        r1 = r29
                        int r9 = androidx.compose.ui.unit.Constraints.k(r30)
                        int r2 = r29.size()
                        int r3 = androidx.compose.ui.unit.Constraints.n(r30)
                        int r4 = androidx.compose.ui.unit.Constraints.n(r30)
                        if (r4 != 0) goto L_0x003b
                        float r3 = androidx.compose.material3.WideNavigationRailKt.f11747f
                        int r3 = r8.P1(r3)
                        int r4 = androidx.compose.ui.unit.Constraints.l(r30)
                        int r3 = kotlin.ranges.RangesKt.j(r3, r4)
                        androidx.compose.runtime.State r4 = r11
                        float r4 = androidx.compose.material3.WideNavigationRailKt.K(r4)
                        int r4 = r8.P1(r4)
                        int r5 = androidx.compose.ui.unit.Constraints.l(r30)
                        int r4 = kotlin.ranges.RangesKt.j(r4, r5)
                        goto L_0x003f
                    L_0x003b:
                        int r4 = androidx.compose.ui.unit.Constraints.n(r30)
                    L_0x003f:
                        r5 = 1
                        if (r2 >= r5) goto L_0x0054
                        androidx.compose.material3.C8 r5 = new androidx.compose.material3.C8
                        r5.<init>()
                        r6 = 4
                        r7 = 0
                        r10 = 0
                        r1 = r28
                        r2 = r4
                        r3 = r9
                        r4 = r10
                        androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.R1(r1, r2, r3, r4, r5, r6, r7)
                        return r1
                    L_0x0054:
                        r16 = 10
                        r17 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r10 = r30
                        long r6 = androidx.compose.ui.unit.Constraints.d(r10, r12, r13, r14, r15, r16, r17)
                        kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
                        r10.<init>()
                        kotlin.jvm.functions.Function2 r11 = r9
                        if (r11 == 0) goto L_0x00ac
                        r11 = r1
                        java.util.Collection r11 = (java.util.Collection) r11
                        int r11 = r11.size()
                        r13 = 0
                    L_0x0073:
                        if (r13 >= r11) goto L_0x00a1
                        java.lang.Object r14 = r1.get(r13)
                        androidx.compose.ui.layout.Measurable r14 = (androidx.compose.ui.layout.Measurable) r14
                        java.lang.Object r15 = androidx.compose.ui.layout.LayoutIdKt.a(r14)
                        java.lang.String r12 = "header"
                        boolean r12 = kotlin.jvm.internal.Intrinsics.d(r15, r12)
                        if (r12 == 0) goto L_0x009e
                        androidx.compose.ui.layout.Placeable r11 = r14.c0(r6)
                        r10.f40908z = r11
                        if (r2 <= r5) goto L_0x0093
                        java.util.List r1 = r1.subList(r5, r2)
                    L_0x0093:
                        int r2 = r2 + -1
                        java.lang.Object r5 = r10.f40908z
                        androidx.compose.ui.layout.Placeable r5 = (androidx.compose.ui.layout.Placeable) r5
                        int r5 = r5.C0()
                        goto L_0x00ad
                    L_0x009e:
                        int r13 = r13 + 1
                        goto L_0x0073
                    L_0x00a1:
                        java.lang.String r1 = "Collection contains no element matching the predicate."
                        androidx.compose.ui.util.ListUtilsKt.f(r1)
                        kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                        r1.<init>()
                        throw r1
                    L_0x00ac:
                        r5 = 0
                    L_0x00ad:
                        if (r2 <= 0) goto L_0x00b6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                    L_0x00b4:
                        r11 = r2
                        goto L_0x00b8
                    L_0x00b6:
                        r2 = 0
                        goto L_0x00b4
                    L_0x00b8:
                        boolean r2 = r10
                        if (r2 == 0) goto L_0x00c1
                        int r2 = androidx.compose.ui.unit.Constraints.l(r6)
                        goto L_0x00c2
                    L_0x00c1:
                        r2 = r4
                    L_0x00c2:
                        if (r11 == 0) goto L_0x015f
                        float r12 = r12
                        boolean r13 = r10
                        androidx.compose.runtime.State r14 = r13
                        java.util.ArrayList r15 = new java.util.ArrayList
                        r29 = r5
                        int r5 = r1.size()
                        r15.<init>(r5)
                        r5 = r1
                        java.util.Collection r5 = (java.util.Collection) r5
                        int r5 = r5.size()
                        r24 = r3
                        r25 = r4
                        r17 = r9
                        r3 = 0
                        r4 = 0
                        r9 = r29
                    L_0x00e6:
                        if (r3 >= r5) goto L_0x015a
                        java.lang.Object r18 = r1.get(r3)
                        r29 = r1
                        r1 = r18
                        androidx.compose.ui.layout.Measurable r1 = (androidx.compose.ui.layout.Measurable) r1
                        int r9 = -r9
                        r22 = 1
                        r23 = 0
                        r20 = 0
                        r18 = r6
                        r21 = r9
                        r26 = r10
                        long r9 = androidx.compose.ui.unit.ConstraintsKt.j(r18, r20, r21, r22, r23)
                        r18 = r5
                        androidx.compose.ui.unit.Constraints$Companion r5 = androidx.compose.ui.unit.Constraints.f19137b
                        int r0 = r8.P1(r12)
                        r19 = r12
                        float r12 = androidx.compose.material3.WideNavigationRailKt.E(r14)
                        int r12 = r8.P1(r12)
                        r20 = r14
                        int r14 = androidx.compose.ui.unit.Constraints.k(r6)
                        r21 = r6
                        long r5 = r5.b(r0, r2, r12, r14)
                        long r5 = androidx.compose.ui.unit.ConstraintsKt.e(r9, r5)
                        androidx.compose.ui.layout.Placeable r0 = r1.c0(r5)
                        int r1 = r0.H0()
                        if (r13 == 0) goto L_0x013a
                        if (r4 >= r1) goto L_0x013a
                        float r4 = androidx.compose.material3.WideNavigationRailKt.f11743b
                        int r4 = r8.P1(r4)
                        int r4 = r4 + r1
                    L_0x013a:
                        int r9 = r0.C0()
                        boolean r0 = r11.add(r0)
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r15.add(r0)
                        int r3 = r3 + 1
                        r0 = r27
                        r1 = r29
                        r5 = r18
                        r12 = r19
                        r14 = r20
                        r6 = r21
                        r10 = r26
                        goto L_0x00e6
                    L_0x015a:
                        r26 = r10
                    L_0x015c:
                        r0 = r27
                        goto L_0x0169
                    L_0x015f:
                        r24 = r3
                        r25 = r4
                        r17 = r9
                        r26 = r10
                        r4 = 0
                        goto L_0x015c
                    L_0x0169:
                        boolean r1 = r10
                        if (r1 == 0) goto L_0x01a8
                        r5 = r26
                        java.lang.Object r1 = r5.f40908z
                        androidx.compose.ui.layout.Placeable r1 = (androidx.compose.ui.layout.Placeable) r1
                        if (r1 == 0) goto L_0x017a
                        int r12 = r1.L0()
                        goto L_0x017b
                    L_0x017a:
                        r12 = 0
                    L_0x017b:
                        int r1 = java.lang.Math.max(r4, r12)
                        r4 = r25
                        if (r1 <= r4) goto L_0x01cd
                        r3 = r24
                        if (r1 <= r3) goto L_0x01cd
                        int r1 = java.lang.Math.max(r1, r3)
                        int r2 = androidx.compose.ui.unit.Constraints.l(r30)
                        int r1 = kotlin.ranges.RangesKt.j(r1, r2)
                        androidx.compose.runtime.State r2 = r14
                        float r2 = androidx.compose.material3.WideNavigationRailKt.L(r2)
                        int r2 = r8.P1(r2)
                        int r1 = kotlin.ranges.RangesKt.j(r2, r1)
                        androidx.compose.runtime.MutableIntState r2 = r15
                        androidx.compose.material3.WideNavigationRailKt.J(r2, r1)
                    L_0x01a6:
                        r9 = r1
                        goto L_0x01ce
                    L_0x01a8:
                        r4 = r25
                        r5 = r26
                        androidx.compose.runtime.MutableIntState r1 = r15
                        int r1 = androidx.compose.material3.WideNavigationRailKt.I(r1)
                        if (r1 <= 0) goto L_0x01cd
                        androidx.compose.runtime.State r1 = r14
                        float r1 = androidx.compose.material3.WideNavigationRailKt.L(r1)
                        int r1 = r8.P1(r1)
                        androidx.compose.runtime.MutableIntState r2 = r16
                        int r2 = androidx.compose.material3.WideNavigationRailKt.G(r2)
                        int r2 = kotlin.ranges.RangesKt.e(r2, r4)
                        int r1 = kotlin.ranges.RangesKt.o(r1, r4, r2)
                        goto L_0x01a6
                    L_0x01cd:
                        r9 = r4
                    L_0x01ce:
                        androidx.compose.runtime.MutableIntState r1 = r16
                        androidx.compose.material3.WideNavigationRailKt.H(r1, r9)
                        androidx.compose.foundation.layout.Arrangement$Vertical r6 = r17
                        androidx.compose.runtime.State r7 = r18
                        androidx.compose.material3.D8 r10 = new androidx.compose.material3.D8
                        r1 = r10
                        r2 = r17
                        r3 = r28
                        r4 = r5
                        r5 = r11
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        r6 = 4
                        r7 = 0
                        r4 = 0
                        r1 = r28
                        r2 = r9
                        r3 = r17
                        r5 = r10
                        androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.R1(r1, r2, r3, r4, r5, r6, r7)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2.b(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                }
            };
            Function2 function22 = this.f11761A;
            Function2 function23 = this.K;
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, d2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, r8, companion2.c());
            Updater.g(b2, I2, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            if (function22 != null) {
                composer2.X(1714892004);
                Modifier b4 = LayoutIdKt.b(companion, "header");
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
                int a5 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I3 = composer.I();
                Modifier e3 = ComposedModifierKt.e(composer2, b4);
                Function0 a6 = companion2.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a6);
                } else {
                    composer.K();
                }
                Composer b5 = Updater.b(composer);
                Updater.g(b5, g3, companion2.c());
                Updater.g(b5, I3, companion2.e());
                Function2 b6 = companion2.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                    b5.N(Integer.valueOf(a5));
                    b5.A(Integer.valueOf(a5), b6);
                }
                Updater.g(b5, e3, companion2.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function22.m(composer2, 0);
                composer.T();
                composer.M();
            } else {
                composer2.X(1714982338);
                composer.M();
            }
            function23.m(composer2, 0);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
