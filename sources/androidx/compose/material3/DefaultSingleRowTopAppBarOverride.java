package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class DefaultSingleRowTopAppBarOverride implements SingleRowTopAppBarOverride {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultSingleRowTopAppBarOverride f9844a = new DefaultSingleRowTopAppBarOverride();

    public static final float h(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope) {
        TopAppBarState c2;
        TopAppBarScrollBehavior f2 = singleRowTopAppBarOverrideScope.f();
        if (f2 == null || (c2 = f2.c()) == null) {
            return 0.0f;
        }
        return c2.g();
    }

    public static final float i() {
        return 1.0f;
    }

    public static final Unit j(DefaultSingleRowTopAppBarOverride defaultSingleRowTopAppBarOverride, SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, int i2, Composer composer, int i3) {
        defaultSingleRowTopAppBarOverride.a(singleRowTopAppBarOverrideScope, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final long k(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final Unit l(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, float f2) {
        TopAppBarState c2 = singleRowTopAppBarOverrideScope.f().c();
        c2.k(c2.g() + f2);
        return Unit.f40552a;
    }

    public static final Unit m(State state, DrawScope drawScope) {
        long v2 = ((Color) state.getValue()).v();
        if (!Color.n(v2, Color.f15975b.f())) {
            DrawScope.A1(drawScope, v2, 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.H0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: androidx.compose.material3.internal.FloatProducer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: kotlin.jvm.functions.Function3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.compose.material3.SingleRowTopAppBarOverrideScope r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r36 = this;
            r0 = r37
            r1 = r39
            r2 = 1
            r3 = 2137486921(0x7f677649, float:3.0766584E38)
            r4 = r38
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = 6
            r5 = r1 & 6
            r6 = 2
            r12 = 4
            if (r5 != 0) goto L_0x0021
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001d
            r5 = r12
            goto L_0x001e
        L_0x001d:
            r5 = r6
        L_0x001e:
            r5 = r5 | r1
            r13 = r5
            goto L_0x0022
        L_0x0021:
            r13 = r1
        L_0x0022:
            r5 = r13 & 3
            r14 = 0
            if (r5 == r6) goto L_0x0029
            r5 = r2
            goto L_0x002a
        L_0x0029:
            r5 = r14
        L_0x002a:
            r6 = r13 & 1
            boolean r5 = r15.E(r5, r6)
            if (r5 == 0) goto L_0x02b4
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x003e
            r5 = -1
            java.lang.String r6 = "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2510)"
            androidx.compose.runtime.ComposerKt.Y(r3, r13, r5, r6)
        L_0x003e:
            float r3 = r37.c()
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x02ac
            float r3 = r37.c()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r5
            r5 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r5) goto L_0x02ac
            androidx.compose.material3.TopAppBarColors r3 = r37.b()
            androidx.compose.material3.TopAppBarScrollBehavior r5 = r37.f()
            boolean r3 = r15.W(r3)
            boolean r5 = r15.W(r5)
            r3 = r3 | r5
            java.lang.Object r5 = r15.g()
            if (r3 != 0) goto L_0x0077
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0083
        L_0x0077:
            androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$targetColor$2$1 r3 = new androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$targetColor$2$1
            r3.<init>(r0)
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.e(r3)
            r15.N(r5)
        L_0x0083:
            androidx.compose.runtime.State r5 = (androidx.compose.runtime.State) r5
            long r5 = k(r5)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r3 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects
            androidx.compose.animation.core.FiniteAnimationSpec r3 = androidx.compose.material3.MotionSchemeKt.b(r3, r15, r4)
            r10 = 0
            r11 = 12
            r7 = 0
            r8 = 0
            r4 = r5
            r6 = r3
            r9 = r15
            androidx.compose.runtime.State r3 = androidx.compose.animation.SingleValueAnimationKt.a(r4, r6, r7, r8, r9, r10, r11)
            androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1 r4 = new androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1
            r4.<init>(r0)
            r5 = 54
            r6 = -1658896622(0xffffffff9d1f3f12, float:-2.1076081E-21)
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r2, r4, r15, r5)
            androidx.compose.material3.TopAppBarScrollBehavior r4 = r37.f()
            r5 = 0
            if (r4 == 0) goto L_0x011c
            androidx.compose.material3.TopAppBarScrollBehavior r4 = r37.f()
            boolean r4 = r4.d()
            if (r4 != 0) goto L_0x011c
            r4 = 689467622(0x291870e6, float:3.3848704E-14)
            r15.X(r4)
            androidx.compose.ui.Modifier$Companion r25 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.gestures.Orientation r27 = androidx.compose.foundation.gestures.Orientation.Vertical
            r4 = r13 & 14
            if (r4 != r12) goto L_0x00ca
            r6 = r2
            goto L_0x00cb
        L_0x00ca:
            r6 = r14
        L_0x00cb:
            java.lang.Object r7 = r15.g()
            if (r6 != 0) goto L_0x00d9
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00e1
        L_0x00d9:
            androidx.compose.material3.g2 r7 = new androidx.compose.material3.g2
            r7.<init>(r0)
            r15.N(r7)
        L_0x00e1:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.foundation.gestures.DraggableState r26 = androidx.compose.foundation.gestures.DraggableKt.i(r7, r15, r14)
            if (r4 != r12) goto L_0x00eb
            r4 = r2
            goto L_0x00ec
        L_0x00eb:
            r4 = r14
        L_0x00ec:
            java.lang.Object r6 = r15.g()
            if (r4 != 0) goto L_0x00fa
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0102
        L_0x00fa:
            androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 r6 = new androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1
            r6.<init>(r0, r5)
            r15.N(r6)
        L_0x0102:
            r32 = r6
            kotlin.jvm.functions.Function3 r32 = (kotlin.jvm.functions.Function3) r32
            r34 = 188(0xbc, float:2.63E-43)
            r35 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.gestures.DraggableKt.h(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r15.M()
            goto L_0x0127
        L_0x011c:
            r4 = 690108113(0x292236d1, float:3.601877E-14)
            r15.X(r4)
            r15.M()
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
        L_0x0127:
            androidx.compose.ui.Modifier r6 = r37.d()
            androidx.compose.ui.Modifier r4 = r6.o0(r4)
            boolean r6 = r15.W(r3)
            java.lang.Object r7 = r15.g()
            if (r6 != 0) goto L_0x0141
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0149
        L_0x0141:
            androidx.compose.material3.h2 r7 = new androidx.compose.material3.h2
            r7.<init>(r3)
            r15.N(r7)
        L_0x0149:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.draw.DrawModifierKt.b(r4, r7)
            java.lang.Object r4 = r15.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r6.a()
            if (r4 != r7) goto L_0x0163
            androidx.compose.material3.i2 r4 = new androidx.compose.material3.i2
            r4.<init>()
            r15.N(r4)
        L_0x0163:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r3, r14, r4, r2, r5)
            kotlin.Unit r4 = kotlin.Unit.f40552a
            java.lang.Object r5 = r15.g()
            java.lang.Object r7 = r6.a()
            if (r5 != r7) goto L_0x017a
            androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$4$1 r5 = androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$4$1.f9845z
            r15.N(r5)
        L_0x017a:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r5
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r3, r4, r5)
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r4 = r4.o()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.g(r4, r14)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r15, r14)
            androidx.compose.runtime.CompositionLocalMap r7 = r15.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r15, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r8.a()
            androidx.compose.runtime.Applier r10 = r15.v()
            if (r10 != 0) goto L_0x01a5
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01a5:
            r15.s()
            boolean r10 = r15.n()
            if (r10 == 0) goto L_0x01b2
            r15.y(r9)
            goto L_0x01b5
        L_0x01b2:
            r15.K()
        L_0x01b5:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r10 = r8.c()
            androidx.compose.runtime.Updater.g(r9, r4, r10)
            kotlin.jvm.functions.Function2 r4 = r8.e()
            androidx.compose.runtime.Updater.g(r9, r7, r4)
            kotlin.jvm.functions.Function2 r4 = r8.b()
            boolean r7 = r9.n()
            if (r7 != 0) goto L_0x01df
            java.lang.Object r7 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r10)
            if (r7 != 0) goto L_0x01ed
        L_0x01df:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r9.N(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.A(r5, r4)
        L_0x01ed:
            kotlin.jvm.functions.Function2 r4 = r8.d()
            androidx.compose.runtime.Updater.g(r9, r3, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.WindowInsets r4 = r37.l()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.e(r3, r4)
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.draw.ClipKt.b(r3)
            androidx.compose.material3.TopAppBarScrollBehavior r4 = r37.f()
            androidx.compose.ui.Modifier r4 = androidx.compose.material3.AppBarKt.M(r3, r4)
            r3 = r13 & 14
            if (r3 != r12) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            r2 = r14
        L_0x0212:
            java.lang.Object r3 = r15.g()
            if (r2 != 0) goto L_0x021e
            java.lang.Object r2 = r6.a()
            if (r3 != r2) goto L_0x0226
        L_0x021e:
            androidx.compose.material3.j2 r3 = new androidx.compose.material3.j2
            r3.<init>(r0)
            r15.N(r3)
        L_0x0226:
            r5 = r3
            androidx.compose.material3.internal.FloatProducer r5 = (androidx.compose.material3.internal.FloatProducer) r5
            androidx.compose.material3.TopAppBarColors r2 = r37.b()
            long r2 = r2.c()
            androidx.compose.material3.TopAppBarColors r7 = r37.b()
            long r8 = r7.e()
            androidx.compose.material3.TopAppBarColors r7 = r37.b()
            long r12 = r7.b()
            androidx.compose.material3.TopAppBarColors r7 = r37.b()
            long r10 = r7.d()
            kotlin.jvm.functions.Function2 r14 = r37.i()
            androidx.compose.ui.text.TextStyle r16 = r37.k()
            kotlin.jvm.functions.Function2 r17 = r37.g()
            androidx.compose.ui.text.TextStyle r19 = r37.h()
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r20 = r7.b()
            androidx.compose.ui.Alignment$Horizontal r23 = r37.j()
            kotlin.jvm.functions.Function2 r25 = r37.e()
            float r26 = r37.c()
            java.lang.Object r7 = r15.g()
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x027d
            androidx.compose.material3.k2 r7 = new androidx.compose.material3.k2
            r7.<init>()
            r15.N(r7)
        L_0x027d:
            r18 = r7
            kotlin.jvm.functions.Function0 r18 = (kotlin.jvm.functions.Function0) r18
            r27 = 0
            r28 = 1600566(0x186c36, float:2.24287E-39)
            r21 = 0
            r22 = 0
            r6 = r2
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            r19 = r20
            r20 = r23
            r23 = r25
            r25 = r26
            r26 = r2
            androidx.compose.material3.AppBarKt.x(r4, r5, r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x02b8
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x02b8
        L_0x02ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The expandedHeight is expected to be specified and finite"
            r0.<init>(r1)
            throw r0
        L_0x02b4:
            r2 = r15
            r2.B()
        L_0x02b8:
            androidx.compose.runtime.ScopeUpdateScope r2 = r2.x()
            if (r2 == 0) goto L_0x02c9
            androidx.compose.material3.l2 r3 = new androidx.compose.material3.l2
            r4 = r36
            r3.<init>(r4, r0, r1)
            r2.a(r3)
            goto L_0x02cb
        L_0x02c9:
            r4 = r36
        L_0x02cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DefaultSingleRowTopAppBarOverride.a(androidx.compose.material3.SingleRowTopAppBarOverrideScope, androidx.compose.runtime.Composer, int):void");
    }
}
