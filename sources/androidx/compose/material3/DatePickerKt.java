package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class DatePickerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9704a = Dp.m((float) 48);

    /* renamed from: b  reason: collision with root package name */
    public static final float f9705b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f9706c;

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f9707d;

    /* renamed from: e  reason: collision with root package name */
    public static final PaddingValues f9708e;

    /* renamed from: f  reason: collision with root package name */
    public static final PaddingValues f9709f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f9710g;

    static {
        float f2 = (float) 12;
        f9706c = Dp.m(f2);
        f9707d = PaddingKt.e(0.0f, 0.0f, Dp.m(f2), Dp.m(f2), 3, (Object) null);
        float f3 = (float) 24;
        float f4 = (float) 16;
        f9708e = PaddingKt.e(Dp.m(f3), Dp.m(f4), Dp.m(f2), 0.0f, 8, (Object) null);
        f9709f = PaddingKt.e(Dp.m(f3), 0.0f, Dp.m(f2), Dp.m(f2), 2, (Object) null);
        f9710g = Dp.m(f4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D(java.lang.Long r34, long r35, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function1 r38, androidx.compose.material3.internal.CalendarModel r39, kotlin.ranges.IntRange r40, androidx.compose.material3.DatePickerFormatter r41, androidx.compose.material3.SelectableDates r42, androidx.compose.material3.DatePickerColors r43, androidx.compose.runtime.Composer r44, int r45) {
        /*
            r11 = r35
            r13 = r39
            r14 = r40
            r15 = r41
            r10 = r43
            r9 = r45
            r0 = 48
            r1 = -434467002(0xffffffffe61a8f46, float:-1.8247184E23)
            r2 = r44
            androidx.compose.runtime.Composer r7 = r2.q(r1)
            r6 = 6
            r2 = r9 & 6
            r4 = r34
            if (r2 != 0) goto L_0x0029
            boolean r2 = r7.W(r4)
            if (r2 == 0) goto L_0x0026
            r2 = 4
            goto L_0x0027
        L_0x0026:
            r2 = 2
        L_0x0027:
            r2 = r2 | r9
            goto L_0x002a
        L_0x0029:
            r2 = r9
        L_0x002a:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x003a
            boolean r3 = r7.j(r11)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r2 = r2 | r3
        L_0x003a:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004e
            r3 = r37
            boolean r16 = r7.l(r3)
            if (r16 == 0) goto L_0x0049
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r16 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r2 = r2 | r16
            goto L_0x0050
        L_0x004e:
            r3 = r37
        L_0x0050:
            r6 = r9 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r38
            boolean r16 = r7.l(r6)
            if (r16 == 0) goto L_0x005f
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0061
        L_0x005f:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0061:
            r2 = r2 | r16
            goto L_0x0066
        L_0x0064:
            r6 = r38
        L_0x0066:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0076
            boolean r0 = r7.l(r13)
            if (r0 == 0) goto L_0x0073
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0075
        L_0x0073:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0075:
            r2 = r2 | r0
        L_0x0076:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0087
            boolean r0 = r7.l(r14)
            if (r0 == 0) goto L_0x0084
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0086
        L_0x0084:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0086:
            r2 = r2 | r0
        L_0x0087:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x00a2
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0096
            boolean r0 = r7.W(r15)
            goto L_0x009a
        L_0x0096:
            boolean r0 = r7.l(r15)
        L_0x009a:
            if (r0 == 0) goto L_0x009f
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00a1
        L_0x009f:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x00a1:
            r2 = r2 | r0
        L_0x00a2:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x00b7
            r0 = r42
            boolean r17 = r7.W(r0)
            if (r17 == 0) goto L_0x00b2
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00b4
        L_0x00b2:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00b4:
            r2 = r2 | r17
            goto L_0x00b9
        L_0x00b7:
            r0 = r42
        L_0x00b9:
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r17 = r9 & r17
            if (r17 != 0) goto L_0x00cc
            boolean r17 = r7.W(r10)
            if (r17 == 0) goto L_0x00c8
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00ca
        L_0x00c8:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00ca:
            r2 = r2 | r17
        L_0x00cc:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r5 = r2 & r17
            r1 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 == r1) goto L_0x00da
            r1 = 1
        L_0x00d7:
            r19 = 1
            goto L_0x00dc
        L_0x00da:
            r1 = 0
            goto L_0x00d7
        L_0x00dc:
            r5 = r2 & 1
            boolean r1 = r7.E(r1, r5)
            if (r1 == 0) goto L_0x0459
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00f3
            r1 = -1
            java.lang.String r5 = "androidx.compose.material3.DatePickerContent (DatePicker.kt:1537)"
            r8 = -434467002(0xffffffffe61a8f46, float:-1.8247184E23)
            androidx.compose.runtime.ComposerKt.Y(r8, r2, r1, r5)
        L_0x00f3:
            androidx.compose.material3.internal.CalendarMonth r8 = r13.h(r11)
            int r1 = r8.g(r14)
            r5 = 0
            int r1 = kotlin.ranges.RangesKt.e(r1, r5)
            r0 = 2
            androidx.compose.foundation.lazy.LazyListState r11 = androidx.compose.foundation.lazy.LazyListStateKt.b(r1, r5, r7, r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r5 = r7.W(r11)
            boolean r12 = r7.i(r1)
            r5 = r5 | r12
            java.lang.Object r12 = r7.g()
            r14 = 0
            if (r5 != 0) goto L_0x0121
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r12 != r5) goto L_0x0129
        L_0x0121:
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$1 r12 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$1
            r12.<init>(r11, r1, r14)
            r7.N(r12)
        L_0x0129:
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r1 = 0
            androidx.compose.runtime.EffectsKt.g(r0, r12, r7, r1)
            java.lang.Object r0 = r7.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r5.a()
            if (r0 != r12) goto L_0x0144
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r7)
            r7.N(r0)
        L_0x0144:
            r12 = r0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r1 = r7.g()
            java.lang.Object r14 = r5.a()
            if (r1 != r14) goto L_0x015b
            androidx.compose.material3.h1 r1 = new androidx.compose.material3.h1
            r1.<init>()
            r7.N(r1)
        L_0x015b:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r14 = 48
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.j(r0, r1, r7, r14)
            r14 = r0
            androidx.compose.runtime.MutableState r14 = (androidx.compose.runtime.MutableState) r14
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.Arrangement r16 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r16.g()
            androidx.compose.ui.Alignment$Companion r21 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r21.k()
            r22 = r8
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.a(r0, r3, r7, r8)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r7, r8)
            androidx.compose.runtime.CompositionLocalMap r8 = r7.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r7, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r23 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r23.a()
            androidx.compose.runtime.Applier r24 = r7.v()
            if (r24 != 0) goto L_0x0196
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0196:
            r7.s()
            boolean r24 = r7.n()
            if (r24 == 0) goto L_0x01a3
            r7.y(r6)
            goto L_0x01a6
        L_0x01a3:
            r7.K()
        L_0x01a6:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r7)
            kotlin.jvm.functions.Function2 r9 = r23.c()
            androidx.compose.runtime.Updater.g(r6, r0, r9)
            kotlin.jvm.functions.Function2 r0 = r23.e()
            androidx.compose.runtime.Updater.g(r6, r8, r0)
            kotlin.jvm.functions.Function2 r0 = r23.b()
            boolean r8 = r6.n()
            if (r8 != 0) goto L_0x01d0
            java.lang.Object r8 = r6.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 != 0) goto L_0x01de
        L_0x01d0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r6.N(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r0)
        L_0x01de:
            kotlin.jvm.functions.Function2 r0 = r23.d()
            androidx.compose.runtime.Updater.g(r6, r4, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            float r9 = f9706c
            r8 = 0
            r0 = 0
            r6 = 2
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.k(r1, r9, r8, r6, r0)
            boolean r4 = r11.f()
            boolean r18 = r11.d()
            boolean r24 = F(r14)
            java.lang.Long r0 = java.lang.Long.valueOf(r35)
            java.util.Locale r6 = r39.f()
            java.lang.String r0 = r15.c(r0, r6)
            if (r0 != 0) goto L_0x020c
            java.lang.String r0 = "-"
        L_0x020c:
            r6 = r0
            boolean r0 = r7.l(r12)
            boolean r26 = r7.W(r11)
            r0 = r0 | r26
            java.lang.Object r8 = r7.g()
            if (r0 != 0) goto L_0x0223
            java.lang.Object r0 = r5.a()
            if (r8 != r0) goto L_0x022b
        L_0x0223:
            androidx.compose.material3.i1 r8 = new androidx.compose.material3.i1
            r8.<init>(r12, r11)
            r7.N(r8)
        L_0x022b:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            boolean r0 = r7.l(r12)
            boolean r27 = r7.W(r11)
            r0 = r0 | r27
            r27 = r1
            java.lang.Object r1 = r7.g()
            if (r0 != 0) goto L_0x0245
            java.lang.Object r0 = r5.a()
            if (r1 != r0) goto L_0x024d
        L_0x0245:
            androidx.compose.material3.j1 r1 = new androidx.compose.material3.j1
            r1.<init>(r12, r11)
            r7.N(r1)
        L_0x024d:
            r28 = r1
            kotlin.jvm.functions.Function0 r28 = (kotlin.jvm.functions.Function0) r28
            boolean r0 = r7.W(r14)
            java.lang.Object r1 = r7.g()
            if (r0 != 0) goto L_0x0261
            java.lang.Object r0 = r5.a()
            if (r1 != r0) goto L_0x0269
        L_0x0261:
            androidx.compose.material3.k1 r1 = new androidx.compose.material3.k1
            r1.<init>(r14)
            r7.N(r1)
        L_0x0269:
            r29 = r1
            kotlin.jvm.functions.Function0 r29 = (kotlin.jvm.functions.Function0) r29
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r2 & r0
            r31 = 6
            r32 = r30 | 6
            r0 = r3
            r5 = r27
            r1 = r4
            r4 = r2
            r2 = r18
            r3 = r24
            r15 = r4
            r4 = r6
            r44 = r12
            r6 = 2
            r12 = r5
            r5 = r8
            r18 = r14
            r8 = r31
            r14 = r6
            r6 = r28
            r25 = r7
            r7 = r29
            r20 = r22
            r14 = 0
            r8 = r43
            r33 = r9
            r9 = r25
            r10 = r32
            Y(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.Alignment r0 = r21.o()
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r14)
            r10 = r25
            int r1 = androidx.compose.runtime.ComposablesKt.a(r10, r14)
            androidx.compose.runtime.CompositionLocalMap r2 = r10.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r10, r12)
            kotlin.jvm.functions.Function0 r4 = r23.a()
            androidx.compose.runtime.Applier r5 = r10.v()
            if (r5 != 0) goto L_0x02c1
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02c1:
            r10.s()
            boolean r5 = r10.n()
            if (r5 == 0) goto L_0x02ce
            r10.y(r4)
            goto L_0x02d1
        L_0x02ce:
            r10.K()
        L_0x02d1:
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r5 = r23.c()
            androidx.compose.runtime.Updater.g(r4, r0, r5)
            kotlin.jvm.functions.Function2 r0 = r23.e()
            androidx.compose.runtime.Updater.g(r4, r2, r0)
            kotlin.jvm.functions.Function2 r0 = r23.b()
            boolean r2 = r4.n()
            if (r2 != 0) goto L_0x02fb
            java.lang.Object r2 = r4.g()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r5)
            if (r2 != 0) goto L_0x0309
        L_0x02fb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r4.N(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A(r1, r0)
        L_0x0309:
            kotlin.jvm.functions.Function2 r0 = r23.d()
            androidx.compose.runtime.Updater.g(r4, r3, r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r2 = r33
            r0 = 2
            r1 = 0
            r9 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.k(r12, r2, r9, r0, r1)
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r16.g()
            androidx.compose.ui.Alignment$Horizontal r1 = r21.k()
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.a(r0, r1, r10, r14)
            int r1 = androidx.compose.runtime.ComposablesKt.a(r10, r14)
            androidx.compose.runtime.CompositionLocalMap r3 = r10.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r10, r2)
            kotlin.jvm.functions.Function0 r4 = r23.a()
            androidx.compose.runtime.Applier r5 = r10.v()
            if (r5 != 0) goto L_0x0340
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0340:
            r10.s()
            boolean r5 = r10.n()
            if (r5 == 0) goto L_0x034d
            r10.y(r4)
            goto L_0x0350
        L_0x034d:
            r10.K()
        L_0x0350:
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r5 = r23.c()
            androidx.compose.runtime.Updater.g(r4, r0, r5)
            kotlin.jvm.functions.Function2 r0 = r23.e()
            androidx.compose.runtime.Updater.g(r4, r3, r0)
            kotlin.jvm.functions.Function2 r0 = r23.b()
            boolean r3 = r4.n()
            if (r3 != 0) goto L_0x037a
            java.lang.Object r3 = r4.g()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r5)
            if (r3 != 0) goto L_0x0388
        L_0x037a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4.N(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A(r1, r0)
        L_0x0388:
            kotlin.jvm.functions.Function2 r0 = r23.d()
            androidx.compose.runtime.Updater.g(r4, r2, r0)
            int r0 = r15 >> 24
            r0 = r0 & 14
            int r1 = r15 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r14 = r43
            j0(r14, r13, r10, r0)
            int r0 = r15 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r15 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r15 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r15
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r15
            r0 = r0 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r15
            r0 = r0 | r1
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r15
            r0 = r0 | r1
            r15 = r0 | r30
            r0 = r11
            r1 = r34
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r13 = r9
            r9 = r10
            r25 = r10
            r10 = r15
            Q(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r25.T()
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r0 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects
            r15 = r25
            r1 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r2 = androidx.compose.material3.MotionSchemeKt.b(r0, r15, r1)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r3 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            androidx.compose.animation.core.FiniteAnimationSpec r3 = androidx.compose.material3.MotionSchemeKt.b(r3, r15, r1)
            androidx.compose.animation.core.FiniteAnimationSpec r0 = androidx.compose.material3.MotionSchemeKt.b(r0, r15, r1)
            boolean r16 = F(r18)
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.draw.ClipKt.b(r12)
            r8 = 14
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r0
            androidx.compose.animation.EnterTransition r1 = androidx.compose.animation.EnterExitTransitionKt.m(r4, r5, r6, r7, r8, r9)
            r4 = 1058642330(0x3f19999a, float:0.6)
            androidx.compose.animation.EnterTransition r2 = androidx.compose.animation.EnterExitTransitionKt.n(r2, r4)
            androidx.compose.animation.EnterTransition r21 = r1.c(r2)
            r4 = r0
            androidx.compose.animation.ExitTransition r0 = androidx.compose.animation.EnterExitTransitionKt.y(r4, r5, r6, r7, r8, r9)
            r1 = 2
            r2 = 0
            androidx.compose.animation.ExitTransition r1 = androidx.compose.animation.EnterExitTransitionKt.q(r3, r13, r1, r2)
            androidx.compose.animation.ExitTransition r19 = r0.c(r1)
            androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2 r13 = new androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
            r0 = r13
            r1 = r35
            r3 = r18
            r4 = r44
            r5 = r11
            r6 = r40
            r7 = r20
            r8 = r42
            r9 = r39
            r10 = r43
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 54
            r1 = 1193716082(0x4726a972, float:42665.445)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r13, r15, r0)
            r23 = 196656(0x30030, float:2.75574E-40)
            r24 = 16
            r20 = 0
            r17 = r12
            r18 = r21
            r21 = r0
            r22 = r15
            androidx.compose.animation.AnimatedVisibilityKt.j(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15.T()
            r15.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x045e
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x045e
        L_0x0459:
            r15 = r7
            r14 = r10
            r15.B()
        L_0x045e:
            androidx.compose.runtime.ScopeUpdateScope r12 = r15.x()
            if (r12 == 0) goto L_0x0481
            androidx.compose.material3.l1 r13 = new androidx.compose.material3.l1
            r0 = r13
            r1 = r34
            r2 = r35
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r45
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0481:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.D(java.lang.Long, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.material3.internal.CalendarModel, kotlin.ranges.IntRange, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final String D0(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(502032503, i2, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1972)");
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            composer.X(974450583);
            if (z4) {
                composer.X(1416909399);
                Strings.Companion companion = Strings.f12320b;
                sb.append(Strings_androidKt.b(Strings.a(R.string.G), composer, 0));
                composer.M();
            } else if (z5) {
                composer.X(1416913397);
                Strings.Companion companion2 = Strings.f12320b;
                sb.append(Strings_androidKt.b(Strings.a(R.string.D), composer, 0));
                composer.M();
            } else if (z6) {
                composer.X(1416917332);
                Strings.Companion companion3 = Strings.f12320b;
                sb.append(Strings_androidKt.b(Strings.a(R.string.C), composer, 0));
                composer.M();
            } else {
                composer.X(974832875);
                composer.M();
            }
            composer.M();
        } else {
            composer.X(974838827);
            composer.M();
        }
        if (z3) {
            composer.X(1416920485);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Strings.Companion companion4 = Strings.f12320b;
            sb.append(Strings_androidKt.b(Strings.a(R.string.f10678y), composer, 0));
            composer.M();
        } else {
            composer.X(975029291);
            composer.M();
        }
        String sb2 = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return sb2;
    }

    public static final MutableState E() {
        return SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final float E0() {
        return f9706c;
    }

    public static final boolean F(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final PaddingValues F0() {
        return f9707d;
    }

    public static final void G(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final float G0() {
        return f9704a;
    }

    public static final Unit H(CoroutineScope coroutineScope, LazyListState lazyListState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DatePickerKt$DatePickerContent$2$1$1$1(lazyListState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final int H0(IntRange intRange) {
        return ((intRange.o() - intRange.n()) + 1) * 12;
    }

    public static final Unit I(CoroutineScope coroutineScope, LazyListState lazyListState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DatePickerKt$DatePickerContent$2$2$1$1(lazyListState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Object I0(LazyListState lazyListState, Function1 function1, CalendarModel calendarModel, IntRange intRange, Continuation continuation) {
        Object a2 = SnapshotStateKt.q(new C0182m1(lazyListState)).a(new DatePickerKt$updateDisplayedMonth$3(lazyListState, function1, calendarModel, intRange), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public static final Unit J(MutableState mutableState) {
        G(mutableState, !F(mutableState));
        return Unit.f40552a;
    }

    public static final int J0(LazyListState lazyListState) {
        return lazyListState.s();
    }

    public static final Unit K(Long l2, long j2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        D(l2, j2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void L(String str, Modifier modifier, boolean z2, Function0 function0, boolean z3, boolean z4, boolean z5, boolean z6, String str2, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2 = modifier;
        boolean z7 = z2;
        boolean z8 = z5;
        String str3 = str2;
        int i4 = i2;
        Composer q2 = composer.q(-945355136);
        String str4 = str;
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str4) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(modifier2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z7) ? 256 : 128;
        }
        Function0 function02 = function0;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function02) ? 2048 : 1024;
        }
        boolean z9 = z3;
        if ((i4 & 24576) == 0) {
            i3 |= q2.d(z9) ? 16384 : 8192;
        }
        boolean z10 = z4;
        if ((196608 & i4) == 0) {
            i3 |= q2.d(z10) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.d(z8) ? 1048576 : 524288;
        }
        boolean z11 = z6;
        if ((12582912 & i4) == 0) {
            i3 |= q2.d(z11) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i3 |= q2.W(str3) ? 67108864 : 33554432;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((805306368 & i4) == 0) {
            i3 |= q2.W(datePickerColors2) ? 536870912 : 268435456;
        }
        boolean z12 = false;
        if (q2.E((306783379 & i3) != 306783378, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-945355136, i3, -1, "androidx.compose.material3.Day (DatePicker.kt:2003)");
            }
            if ((234881024 & i3) == 67108864) {
                z12 = true;
            }
            Object g2 = q2.g();
            if (z12 || g2 == Composer.f14567a.a()) {
                g2 = new O0(str3);
                q2.N(g2);
            }
            Modifier c2 = SemanticsModifierKt.c(modifier2, true, (Function1) g2);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f13010a;
            Shape g3 = ShapesKt.g(datePickerModalTokens.e(), q2, 6);
            int i5 = i3 >> 6;
            int i6 = i5;
            long v2 = ((Color) datePickerColors.a(z2, z4, z3, q2, (i5 & 14) | ((i3 >> 12) & 112) | (i5 & 896) | ((i3 >> 18) & 7168)).getValue()).v();
            BorderStroke a2 = (!z8 || z7) ? null : BorderStrokeKt.a(datePickerModalTokens.l(), datePickerColors.k());
            DatePickerKt$Day$2 datePickerKt$Day$2 = r3;
            DatePickerKt$Day$2 datePickerKt$Day$22 = new DatePickerKt$Day$2(str, datePickerColors, z5, z2, z6, z4);
            composer2 = q2;
            SurfaceKt.d(z2, function0, c2, z4, g3, v2, 0, 0.0f, 0.0f, a2, (MutableInteractionSource) null, ComposableLambdaKt.e(1126347158, true, datePickerKt$Day$2, q2, 54), composer2, i6 & 7294, 48, 1472);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new P0(str, modifier, z2, function0, z3, z4, z5, z6, str2, datePickerColors, i2));
        }
    }

    public static final Unit M(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.z0(semanticsPropertyReceiver, new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null));
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.a());
        return Unit.f40552a;
    }

    public static final Unit N(String str, Modifier modifier, boolean z2, Function0 function0, boolean z3, boolean z4, boolean z5, boolean z6, String str2, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        L(str, modifier, z2, function0, z3, z4, z5, z6, str2, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void O(Modifier modifier, int i2, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i3) {
        int i4;
        Composer q2 = composer.q(-1461252485);
        if ((i3 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= q2.i(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= q2.l(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= q2.W(datePickerColors) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1461252485, i4, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1406)");
            }
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(datePickerColors.g())), ComposableLambdaKt.e(-1734512197, true, new DatePickerKt$DisplayModeToggleButton$1(i2, function1, modifier), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new Y0(modifier, i2, function1, datePickerColors, i3));
        }
    }

    public static final Unit P(Modifier modifier, int i2, Function1 function1, DatePickerColors datePickerColors, int i3, Composer composer, int i4) {
        O(modifier, i2, function1, datePickerColors, composer, RecomposeScopeImplKt.a(i3 | 1));
        return Unit.f40552a;
    }

    public static final void Q(LazyListState lazyListState, Long l2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer composer2;
        LazyListState lazyListState2 = lazyListState;
        CalendarModel calendarModel2 = calendarModel;
        IntRange intRange2 = intRange;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        int i4 = i2;
        Composer q2 = composer.q(-1994757941);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(lazyListState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        Long l3 = l2;
        if ((i4 & 48) == 0) {
            i3 |= q2.W(l3) ? 32 : 16;
        }
        Function1 function13 = function1;
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function13) ? 256 : 128;
        }
        Function1 function14 = function12;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function14) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(calendarModel2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.l(intRange2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= (2097152 & i4) == 0 ? q2.W(datePickerFormatter2) : q2.l(datePickerFormatter2) ? 1048576 : 524288;
        }
        SelectableDates selectableDates2 = selectableDates;
        if ((12582912 & i4) == 0) {
            i3 |= q2.W(selectableDates2) ? 8388608 : 4194304;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((100663296 & i4) == 0) {
            i3 |= q2.W(datePickerColors2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        boolean z2 = false;
        if (q2.E((38347923 & i5) != 38347922, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1994757941, i5, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1711)");
            }
            CalendarDate j2 = calendarModel.j();
            boolean W = q2.W(intRange2);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = calendarModel2.g(intRange.n(), 1);
                q2.N(g2);
            }
            DatePickerKt$HorizontalMonthsList$1 datePickerKt$HorizontalMonthsList$1 = r0;
            TextStyle e2 = TypographyKt.e(DatePickerModalTokens.f13010a.g(), q2, 6);
            composer2 = q2;
            DatePickerKt$HorizontalMonthsList$1 datePickerKt$HorizontalMonthsList$12 = new DatePickerKt$HorizontalMonthsList$1(lazyListState, intRange, calendarModel, (CalendarMonth) g2, function1, j2, l2, datePickerFormatter, selectableDates, datePickerColors);
            TextKt.h(e2, ComposableLambdaKt.e(1504086906, true, datePickerKt$HorizontalMonthsList$1, composer2, 54), composer2, 48);
            int i6 = i5;
            int i7 = i6 & 14;
            boolean z3 = i7 == 4;
            if ((i6 & 7168) == 2048) {
                z2 = true;
            }
            boolean l4 = z3 | z2 | composer2.l(calendarModel2) | composer2.l(intRange2);
            Object g3 = composer2.g();
            if (l4 || g3 == Composer.f14567a.a()) {
                DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState, function12, calendarModel, intRange, (Continuation) null);
                composer2.N(datePickerKt$HorizontalMonthsList$2$1);
                g3 = datePickerKt$HorizontalMonthsList$2$1;
            }
            EffectsKt.g(lazyListState2, (Function2) g3, composer2, i7);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new U0(lazyListState, l2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i2));
        }
    }

    public static final Unit R(LazyListState lazyListState, Long l2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        Q(lazyListState, l2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void S(kotlin.jvm.functions.Function0 r22, androidx.compose.ui.graphics.vector.ImageVector r23, java.lang.String r24, androidx.compose.ui.Modifier r25, boolean r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r6 = r24
            r7 = r28
            r0 = -368059805(0xffffffffea0fda63, float:-4.3476924E25)
            r1 = r27
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r7 | 6
            r14 = r22
            goto L_0x0028
        L_0x0016:
            r1 = r7 & 6
            r14 = r22
            if (r1 != 0) goto L_0x0027
            boolean r1 = r15.l(r14)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r7
            goto L_0x0028
        L_0x0027:
            r1 = r7
        L_0x0028:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
            r5 = r23
            goto L_0x0043
        L_0x0031:
            r2 = r7 & 48
            r5 = r23
            if (r2 != 0) goto L_0x0043
            boolean r2 = r15.W(r5)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r15.W(r6)
            if (r2 == 0) goto L_0x0057
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r29 & 8
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r3 = r25
            goto L_0x0075
        L_0x0063:
            r3 = r7 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r25
            boolean r4 = r15.W(r3)
            if (r4 == 0) goto L_0x0072
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r29 & 16
            if (r4 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r8 = r26
            goto L_0x0090
        L_0x007e:
            r8 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x007b
            r8 = r26
            boolean r9 = r15.d(r8)
            if (r9 == 0) goto L_0x008d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r9
        L_0x0090:
            r9 = r1 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            r13 = 1
            if (r9 == r10) goto L_0x0099
            r9 = r13
            goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            r10 = r1 & 1
            boolean r9 = r15.E(r9, r10)
            if (r9 == 0) goto L_0x0127
            if (r2 == 0) goto L_0x00a9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r20 = r2
            goto L_0x00ab
        L_0x00a9:
            r20 = r3
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            r21 = r13
            goto L_0x00b2
        L_0x00b0:
            r21 = r8
        L_0x00b2:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00be
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x00be:
            androidx.compose.material3.TooltipDefaults r8 = androidx.compose.material3.TooltipDefaults.f11582a
            androidx.compose.material3.TooltipAnchorPosition$Companion r0 = androidx.compose.material3.TooltipAnchorPosition.f11568b
            int r9 = r0.a()
            r12 = 390(0x186, float:5.47E-43)
            r0 = 2
            r10 = 0
            r11 = r15
            r4 = r13
            r13 = r0
            androidx.compose.ui.window.PopupPositionProvider r16 = r8.e(r9, r10, r11, r12, r13)
            androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1 r0 = new androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1
            r0.<init>(r6)
            r1 = -456272562(0xffffffffe4cdd54e, float:-3.0375622E22)
            r3 = 54
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r4, r0, r15, r3)
            r12 = 0
            r13 = 7
            r8 = 0
            r9 = 0
            r10 = 0
            androidx.compose.material3.TooltipState r10 = androidx.compose.material3.TooltipKt.z(r8, r9, r10, r11, r12, r13)
            androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$2 r8 = new androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$2
            r0 = r8
            r1 = r22
            r2 = r20
            r9 = r3
            r3 = r21
            r11 = r4
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1124908186(0xffffffffbcf34366, float:-0.029695224)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r11, r8, r15, r9)
            r18 = 100663344(0x6000030, float:2.4074262E-35)
            r19 = 248(0xf8, float:3.48E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 0
            r2 = 0
            r8 = r16
            r9 = r17
            r14 = r1
            r1 = r15
            r15 = r2
            r16 = r0
            r17 = r1
            androidx.compose.material3.TooltipKt.j(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0122
            androidx.compose.runtime.ComposerKt.X()
        L_0x0122:
            r4 = r20
            r5 = r21
            goto L_0x012d
        L_0x0127:
            r1 = r15
            r1.B()
            r4 = r3
            r5 = r8
        L_0x012d:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0146
            androidx.compose.material3.g1 r9 = new androidx.compose.material3.g1
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r24
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.S(kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit T(Function0 function0, ImageVector imageVector, String str, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        S(function0, imageVector, str, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void U(CalendarMonth calendarMonth, Function1 function1, long j2, Long l2, Long l3, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier;
        int i4;
        int i5;
        int i6;
        Composer composer3;
        boolean z2;
        int i7;
        char c2;
        boolean z3;
        Composer composer4;
        Boolean bool;
        String str;
        MutableState mutableState;
        boolean z4;
        Function1 function12 = function1;
        long j3 = j2;
        Long l4 = l2;
        Long l5 = l3;
        SelectedRangeInfo selectedRangeInfo2 = selectedRangeInfo;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        SelectableDates selectableDates2 = selectableDates;
        DatePickerColors datePickerColors2 = datePickerColors;
        Locale locale2 = locale;
        int i8 = i2;
        Composer q2 = composer.q(-333300603);
        if ((i8 & 6) == 0) {
            i3 = i8 | (q2.W(calendarMonth) ? 4 : 2);
        } else {
            CalendarMonth calendarMonth2 = calendarMonth;
            i3 = i8;
        }
        if ((i8 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i3 |= q2.j(j3) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i3 |= q2.W(l4) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i3 |= q2.W(l5) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i3 |= q2.W(selectedRangeInfo2) ? 131072 : 65536;
        }
        if ((1572864 & i8) == 0) {
            i3 |= (2097152 & i8) == 0 ? q2.W(datePickerFormatter2) : q2.l(datePickerFormatter2) ? 1048576 : 524288;
        }
        if ((12582912 & i8) == 0) {
            i3 |= q2.W(selectableDates2) ? 8388608 : 4194304;
        }
        if ((100663296 & i8) == 0) {
            i3 |= q2.W(datePickerColors2) ? 67108864 : 33554432;
        }
        if ((805306368 & i8) == 0) {
            i3 |= q2.l(locale2) ? 536870912 : 268435456;
        }
        int i9 = i3;
        if (q2.E((i9 & 306783379) != 306783378, i9 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-333300603, i9, -1, "androidx.compose.material3.Month (DatePicker.kt:1844)");
            }
            if (selectedRangeInfo2 != null) {
                q2.X(606579709);
                Modifier.Companion companion = Modifier.f15489d;
                boolean z5 = ((i9 & 458752) == 131072) | ((234881024 & i9) == 67108864);
                Object g2 = q2.g();
                if (z5 || g2 == Composer.f14567a.a()) {
                    g2 = new K0(selectedRangeInfo2, datePickerColors2);
                    q2.N(g2);
                }
                modifier = DrawModifierKt.d(companion, (Function1) g2);
                q2.M();
            } else {
                q2.X(606771165);
                q2.M();
                modifier = Modifier.f15489d;
            }
            Modifier o0 = SizeKt.l(Modifier.f15489d, Dp.m(f9704a * ((float) 6))).o0(modifier);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.e(), Alignment.f15444a.k(), q2, 6);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, o0);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            q2.X(-680088486);
            int i10 = 0;
            int i11 = 6;
            int i12 = 0;
            while (i10 < i11) {
                Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
                MeasurePolicy b4 = RowKt.b(Arrangement.f3739a.e(), Alignment.f15444a.i(), q2, 54);
                int a5 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, h2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
                Function0 a6 = companion3.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a6);
                } else {
                    q2.K();
                }
                Composer b5 = Updater.b(q2);
                int i13 = i12;
                Updater.g(b5, b4, companion3.c());
                Updater.g(b5, I2, companion3.e());
                Function2 b6 = companion3.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                    b5.N(Integer.valueOf(a5));
                    b5.A(Integer.valueOf(a5), b6);
                }
                Updater.g(b5, e3, companion3.d());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
                q2.X(1542622325);
                int i14 = i13;
                int i15 = 0;
                while (i15 < 7) {
                    if (i14 < calendarMonth.a() || i14 >= calendarMonth.a() + calendarMonth.d()) {
                        SelectableDates selectableDates3 = selectableDates;
                        i5 = i10;
                        i4 = i15;
                        i6 = i9;
                        composer3 = q2;
                        composer3.X(576825328);
                        Modifier.Companion companion4 = Modifier.f15489d;
                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f13010a;
                        SpacerKt.a(SizeKt.v(SizeKt.x(companion4, datePickerModalTokens.f(), datePickerModalTokens.d(), 0.0f, 0.0f, 12, (Object) null), ((Dp) composer3.C(InteractiveComponentSizeKt.e())).t(), ((Dp) composer3.C(InteractiveComponentSizeKt.e())).t()), composer3, 0);
                        composer3.M();
                    } else {
                        q2.X(577914947);
                        int a7 = i14 - calendarMonth.a();
                        i5 = i10;
                        i4 = i15;
                        long e4 = (((long) a7) * 86400000) + calendarMonth.e();
                        boolean z6 = e4 == j3;
                        boolean z7 = l4 != null && e4 == l2.longValue();
                        boolean z8 = l5 != null && e4 == l3.longValue();
                        if (selectedRangeInfo2 != null) {
                            q2.X(578361347);
                            boolean j4 = ((i9 & 458752) == 131072) | q2.j(e4);
                            Object g3 = q2.g();
                            if (j4 || g3 == Composer.f14567a.a()) {
                                if (e4 >= (l4 != null ? l2.longValue() : Long.MAX_VALUE)) {
                                    if (e4 <= (l5 != null ? l3.longValue() : Long.MIN_VALUE)) {
                                        z4 = true;
                                        i7 = i9;
                                        c2 = 2;
                                        mutableState = SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z4), (SnapshotMutationPolicy) null, 2, (Object) null);
                                        q2.N(mutableState);
                                    }
                                }
                                z4 = false;
                                i7 = i9;
                                c2 = 2;
                                mutableState = SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z4), (SnapshotMutationPolicy) null, 2, (Object) null);
                                q2.N(mutableState);
                            } else {
                                i7 = i9;
                                mutableState = g3;
                                c2 = 2;
                            }
                            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                            q2.M();
                            z2 = booleanValue;
                        } else {
                            i7 = i9;
                            c2 = 2;
                            q2.X(578890300);
                            q2.M();
                            z2 = false;
                        }
                        String D0 = D0(selectedRangeInfo2 != null, z6, z7, z8, z2, q2, 0);
                        String a8 = datePickerFormatter2.a(Long.valueOf(e4), locale2, true);
                        if (a8 == null) {
                            a8 = "";
                        }
                        String str2 = a8;
                        i6 = i7;
                        String str3 = D0;
                        char c3 = c2;
                        Composer composer5 = q2;
                        String c4 = CalendarLocale_jvmKt.c(a7 + 1, 0, 0, false, locale, 7, (Object) null);
                        Modifier.Companion companion5 = Modifier.f15489d;
                        boolean z9 = z7 || z8;
                        if ((i6 & 112) == 32) {
                            z3 = true;
                            composer4 = composer5;
                        } else {
                            composer4 = composer5;
                            z3 = false;
                        }
                        boolean j5 = z3 | composer4.j(e4);
                        Object g4 = composer4.g();
                        if (j5 || g4 == Composer.f14567a.a()) {
                            g4 = new V0(function1, e4);
                            composer4.N(g4);
                        } else {
                            Function1 function13 = function1;
                        }
                        Function0 function0 = (Function0) g4;
                        boolean j6 = composer4.j(e4) | ((i6 & 29360128) == 8388608);
                        Object g5 = composer4.g();
                        if (j6 || g5 == Composer.f14567a.a()) {
                            SelectableDates selectableDates4 = selectableDates;
                            bool = Boolean.valueOf(selectableDates4.b(calendarMonth.f()) && selectableDates4.a(e4));
                            composer4.N(bool);
                        } else {
                            bool = g5;
                            SelectableDates selectableDates5 = selectableDates;
                        }
                        boolean booleanValue2 = bool.booleanValue();
                        String str4 = str3;
                        if (str4 != null) {
                            str = str4 + ", " + str2;
                        } else {
                            str = str2;
                        }
                        String str5 = str;
                        composer3 = composer4;
                        L(c4, companion5, z9, function0, z7, booleanValue2, z6, z2, str5, datePickerColors, composer3, ((i6 << 3) & 1879048192) | 48);
                        composer3.M();
                    }
                    i14++;
                    j3 = j2;
                    i15 = i4 + 1;
                    q2 = composer3;
                    i9 = i6;
                    i10 = i5;
                    locale2 = locale;
                }
                SelectableDates selectableDates6 = selectableDates;
                int i16 = i10;
                int i17 = i9;
                Composer composer6 = q2;
                composer6.M();
                composer6.T();
                j3 = j2;
                i12 = i14;
                i11 = 6;
                i10 = i16 + 1;
                locale2 = locale;
            }
            SelectableDates selectableDates7 = selectableDates;
            composer2 = q2;
            composer2.M();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            SelectableDates selectableDates8 = selectableDates2;
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0094f1(calendarMonth, function1, j2, l2, l3, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, i2));
        }
    }

    public static final Unit V(SelectedRangeInfo selectedRangeInfo, DatePickerColors datePickerColors, ContentDrawScope contentDrawScope) {
        DateRangePickerKt.w(contentDrawScope, selectedRangeInfo, datePickerColors.e());
        contentDrawScope.q2();
        return Unit.f40552a;
    }

    public static final Unit W(Function1 function1, long j2) {
        function1.invoke(Long.valueOf(j2));
        return Unit.f40552a;
    }

    public static final Unit X(CalendarMonth calendarMonth, Function1 function1, long j2, Long l2, Long l3, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, int i2, Composer composer, int i3) {
        U(calendarMonth, function1, j2, l2, l3, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void Y(Modifier modifier, boolean z2, boolean z3, boolean z4, String str, Function0 function0, Function0 function02, Function0 function03, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2 = modifier;
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        String str2 = str;
        Function0 function04 = function0;
        Function0 function05 = function02;
        DatePickerColors datePickerColors2 = datePickerColors;
        int i4 = i2;
        Composer q2 = composer.q(-773929258);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.d(z5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z6) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z7) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(str2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.l(function04) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.l(function05) ? 1048576 : 524288;
        }
        Function0 function06 = function03;
        if ((12582912 & i4) == 0) {
            i3 |= q2.l(function06) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i3 |= q2.W(datePickerColors2) ? 67108864 : 33554432;
        }
        if (q2.E((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-773929258, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2191)");
            }
            Modifier l2 = SizeKt.l(SizeKt.h(modifier2, 0.0f, 1, (Object) null), f9705b);
            MeasurePolicy b2 = RowKt.b(z7 ? Arrangement.f3739a.f() : Arrangement.f3739a.d(), Alignment.f15444a.i(), q2, 48);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, l2);
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
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            composer2 = q2;
            r0(function03, z4, (Modifier) null, ComposableLambdaKt.e(619076006, true, new DatePickerKt$MonthsNavigation$1$1(str2, datePickerColors2), q2, 54), q2, ((i3 >> 21) & 14) | 3072 | ((i3 >> 6) & 112), 4);
            if (!z7) {
                composer2.X(281624840);
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(datePickerColors.h())), ComposableLambdaKt.e(-128317193, true, new DatePickerKt$MonthsNavigation$1$2(function05, z6, function04, z5), composer2, 54), composer2, ProvidedValue.f14769i | 48);
                composer2.M();
            } else {
                composer2.X(282432080);
                composer2.M();
            }
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            Q0 q0 = r0;
            Q0 q02 = new Q0(modifier, z2, z3, z4, str, function0, function02, function03, datePickerColors, i2);
            x2.a(q0);
        }
    }

    public static final Unit Z(Modifier modifier, boolean z2, boolean z3, boolean z4, String str, Function0 function0, Function0 function02, Function0 function03, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        Y(modifier, z2, z3, z4, str, function0, function02, function03, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.compose.material3.S0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: androidx.compose.material3.S0} */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0185, code lost:
        if (r6 == r18.a()) goto L_0x0187;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a0(java.lang.Long r26, long r27, int r29, kotlin.jvm.functions.Function1 r30, kotlin.jvm.functions.Function1 r31, androidx.compose.material3.internal.CalendarModel r32, kotlin.ranges.IntRange r33, androidx.compose.material3.DatePickerFormatter r34, androidx.compose.material3.SelectableDates r35, androidx.compose.material3.DatePickerColors r36, androidx.compose.ui.focus.FocusRequester r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r12 = r34
            r13 = r39
            r0 = -2053685029(0xffffffff859740db, float:-1.4223796E-35)
            r1 = r38
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r13 & 6
            r2 = 4
            r15 = r26
            if (r1 != 0) goto L_0x001f
            boolean r1 = r14.W(r15)
            if (r1 == 0) goto L_0x001c
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r4 = r13 & 48
            r10 = r27
            if (r4 != 0) goto L_0x0032
            boolean r4 = r14.j(r10)
            if (r4 == 0) goto L_0x002f
            r4 = 32
            goto L_0x0031
        L_0x002f:
            r4 = 16
        L_0x0031:
            r1 = r1 | r4
        L_0x0032:
            r4 = r13 & 384(0x180, float:5.38E-43)
            r9 = r29
            if (r4 != 0) goto L_0x0044
            boolean r4 = r14.i(r9)
            if (r4 == 0) goto L_0x0041
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r4
        L_0x0044:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            r8 = r30
            if (r4 != 0) goto L_0x0056
            boolean r4 = r14.l(r8)
            if (r4 == 0) goto L_0x0053
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r1 = r1 | r4
        L_0x0056:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            r7 = r31
            if (r4 != 0) goto L_0x0068
            boolean r4 = r14.l(r7)
            if (r4 == 0) goto L_0x0065
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r1 = r1 | r4
        L_0x0068:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r13
            r6 = r32
            if (r4 != 0) goto L_0x007b
            boolean r4 = r14.l(r6)
            if (r4 == 0) goto L_0x0078
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007a
        L_0x0078:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x007a:
            r1 = r1 | r4
        L_0x007b:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 & r13
            r5 = r33
            if (r4 != 0) goto L_0x008e
            boolean r4 = r14.l(r5)
            if (r4 == 0) goto L_0x008b
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x008d
        L_0x008b:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x008d:
            r1 = r1 | r4
        L_0x008e:
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00a9
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x009d
            boolean r4 = r14.W(r12)
            goto L_0x00a1
        L_0x009d:
            boolean r4 = r14.l(r12)
        L_0x00a1:
            if (r4 == 0) goto L_0x00a6
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a8
        L_0x00a6:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a8:
            r1 = r1 | r4
        L_0x00a9:
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00be
            r4 = r35
            boolean r16 = r14.W(r4)
            if (r16 == 0) goto L_0x00b9
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00bb
        L_0x00b9:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00bb:
            r1 = r1 | r16
            goto L_0x00c0
        L_0x00be:
            r4 = r35
        L_0x00c0:
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r16 = r13 & r16
            r0 = r36
            if (r16 != 0) goto L_0x00d5
            boolean r17 = r14.W(r0)
            if (r17 == 0) goto L_0x00d1
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00d3
        L_0x00d1:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00d3:
            r1 = r1 | r17
        L_0x00d5:
            r17 = r40 & 6
            r3 = r37
            if (r17 != 0) goto L_0x00e6
            boolean r17 = r14.W(r3)
            if (r17 == 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r2 = 2
        L_0x00e3:
            r2 = r40 | r2
            goto L_0x00e8
        L_0x00e6:
            r2 = r40
        L_0x00e8:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r1 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x00fa
            r0 = r2 & 3
            r3 = 2
            if (r0 == r3) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r0 = 0
            goto L_0x00fb
        L_0x00fa:
            r0 = 1
        L_0x00fb:
            r3 = r1 & 1
            boolean r0 = r14.E(r0, r3)
            if (r0 == 0) goto L_0x01e9
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1443)"
            r3 = -2053685029(0xffffffff859740db, float:-1.4223796E-35)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r2, r0)
        L_0x0111:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r14.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            r2 = 48
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            int r0 = r0.P1(r2)
            int r0 = -r0
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r2 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects
            r3 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r2 = androidx.compose.material3.MotionSchemeKt.b(r2, r14, r3)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r4 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            androidx.compose.animation.core.FiniteAnimationSpec r4 = androidx.compose.material3.MotionSchemeKt.b(r4, r14, r3)
            r16 = r1
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial
            androidx.compose.animation.core.FiniteAnimationSpec r5 = androidx.compose.material3.MotionSchemeKt.b(r1, r14, r3)
            androidx.compose.animation.core.FiniteAnimationSpec r1 = androidx.compose.material3.MotionSchemeKt.b(r1, r14, r3)
            androidx.compose.material3.DisplayMode r24 = androidx.compose.material3.DisplayMode.c(r29)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            java.lang.Object r6 = r14.g()
            androidx.compose.runtime.Composer$Companion r18 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r18.a()
            if (r6 != r7) goto L_0x015a
            androidx.compose.material3.R0 r6 = new androidx.compose.material3.R0
            r6.<init>()
            r14.N(r6)
        L_0x015a:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7 = 0
            r8 = 0
            r9 = 1
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r3, r8, r6, r9, r7)
            boolean r3 = r14.l(r5)
            boolean r6 = r14.l(r2)
            r3 = r3 | r6
            boolean r6 = r14.l(r4)
            r3 = r3 | r6
            boolean r6 = r14.i(r0)
            r3 = r3 | r6
            boolean r6 = r14.l(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r14.g()
            if (r3 != 0) goto L_0x0187
            java.lang.Object r3 = r18.a()
            if (r6 != r3) goto L_0x019b
        L_0x0187:
            androidx.compose.material3.S0 r6 = new androidx.compose.material3.S0
            r18 = r6
            r19 = r5
            r20 = r2
            r21 = r4
            r22 = r0
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            r14.N(r6)
        L_0x019b:
            r18 = r6
            kotlin.jvm.functions.Function1 r18 = (kotlin.jvm.functions.Function1) r18
            androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3 r8 = new androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
            r0 = r8
            r1 = r26
            r19 = 6
            r2 = r27
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r12 = r8
            r8 = r34
            r13 = r9
            r9 = r35
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 54
            r1 = 1838500091(0x6d9548fb, float:5.775187E27)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r13, r12, r14, r0)
            int r0 = r16 >> 6
            r0 = r0 & 14
            r1 = 1597440(0x186000, float:2.23849E-39)
            r9 = r0 | r1
            r10 = 40
            r4 = 0
            java.lang.String r5 = "DatePickerDisplayModeAnimation"
            r6 = 0
            r1 = r24
            r2 = r17
            r3 = r18
            r8 = r14
            androidx.compose.animation.AnimatedContentKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ec
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01ec
        L_0x01e9:
            r14.B()
        L_0x01ec:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.x()
            if (r14 == 0) goto L_0x021a
            androidx.compose.material3.T0 r13 = new androidx.compose.material3.T0
            r0 = r13
            r1 = r26
            r2 = r27
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r15 = r13
            r13 = r39
            r25 = r14
            r14 = r40
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r25
            r0.a(r15)
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.a0(java.lang.Long, long, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.material3.internal.CalendarModel, kotlin.ranges.IntRange, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit b0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.c0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public static final ContentTransform c0(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i2, FiniteAnimationSpec finiteAnimationSpec4, AnimatedContentTransitionScope animatedContentTransitionScope) {
        return animatedContentTransitionScope.a(DisplayMode.f(((DisplayMode) animatedContentTransitionScope.d()).i(), DisplayMode.f9856b.a()) ? AnimatedContentKt.f(EnterExitTransitionKt.A(finiteAnimationSpec, new C0044a1()).c(EnterExitTransitionKt.o(finiteAnimationSpec2, 0.0f, 2, (Object) null)), EnterExitTransitionKt.q(finiteAnimationSpec3, 0.0f, 2, (Object) null).c(EnterExitTransitionKt.D(finiteAnimationSpec, new C0054b1(i2)))) : AnimatedContentKt.f(EnterExitTransitionKt.A(finiteAnimationSpec, new C0064c1(i2)).c(EnterExitTransitionKt.o(finiteAnimationSpec2, 0.0f, 2, (Object) null)), EnterExitTransitionKt.D(finiteAnimationSpec, new C0074d1()).c(EnterExitTransitionKt.q(finiteAnimationSpec3, 0.0f, 2, (Object) null))), AnimatedContentKt.c(true, new C0084e1(finiteAnimationSpec4)));
    }

    public static final int d0(int i2) {
        return i2;
    }

    public static final int e0(int i2, int i3) {
        return i2;
    }

    public static final int f0(int i2, int i3) {
        return i2;
    }

    public static final int g0(int i2) {
        return i2;
    }

    public static final FiniteAnimationSpec h0(FiniteAnimationSpec finiteAnimationSpec, IntSize intSize, IntSize intSize2) {
        return finiteAnimationSpec;
    }

    public static final Unit i0(Long l2, long j2, int i2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4, Composer composer, int i5) {
        a0(l2, j2, i2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.a(i3 | 1), RecomposeScopeImplKt.a(i4));
        return Unit.f40552a;
    }

    public static final void j0(DatePickerColors datePickerColors, CalendarModel calendarModel, Composer composer, int i2) {
        int i3;
        Composer composer2;
        DatePickerColors datePickerColors2 = datePickerColors;
        CalendarModel calendarModel2 = calendarModel;
        int i4 = i2;
        Composer q2 = composer.q(-1849465391);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(datePickerColors2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(calendarModel2) ? 32 : 16;
        }
        boolean z2 = false;
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1849465391, i3, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1782)");
            }
            int d2 = calendarModel.d();
            List k2 = calendarModel.k();
            ArrayList arrayList = new ArrayList();
            int i5 = d2 - 1;
            int size = k2.size();
            for (int i6 = i5; i6 < size; i6++) {
                arrayList.add(k2.get(i6));
            }
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(k2.get(i7));
            }
            TextStyle e2 = TypographyKt.e(DatePickerModalTokens.f13010a.C(), q2, 6);
            Modifier h2 = SizeKt.h(SizeKt.b(Modifier.f15489d, 0.0f, f9704a, 1, (Object) null), 0.0f, 1, (Object) null);
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.e(), Alignment.f15444a.i(), q2, 54);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, h2);
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
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e3, companion.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            q2.X(24563235);
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                Pair pair = (Pair) arrayList.get(i8);
                Modifier.Companion companion2 = Modifier.f15489d;
                boolean W = q2.W(pair);
                Object g2 = q2.g();
                if (W || g2 == Composer.f14567a.a()) {
                    g2 = new L0(pair);
                    q2.N(g2);
                }
                Modifier a4 = SemanticsModifierKt.a(companion2, (Function1) g2);
                DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f13010a;
                Modifier v2 = SizeKt.v(SizeKt.x(a4, datePickerModalTokens.f(), datePickerModalTokens.d(), 0.0f, 0.0f, 12, (Object) null), ((Dp) q2.C(InteractiveComponentSizeKt.e())).t(), ((Dp) q2.C(InteractiveComponentSizeKt.e())).t());
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.e(), z2);
                int a5 = ComposablesKt.a(q2, z2 ? 1 : 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, v2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
                Function0 a6 = companion3.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a6);
                } else {
                    q2.K();
                }
                Composer b5 = Updater.b(q2);
                Updater.g(b5, g3, companion3.c());
                Updater.g(b5, I2, companion3.e());
                Function2 b6 = companion3.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                    b5.N(Integer.valueOf(a5));
                    b5.A(Integer.valueOf(a5), b6);
                }
                Updater.g(b5, e4, companion3.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                Composer composer3 = q2;
                TextKt.j((String) pair.f(), SizeKt.E(companion2, (Alignment) null, false, 3, (Object) null), datePickerColors.l(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.a()), 0, 0, false, 0, 0, (Function1) null, e2, composer3, 48, 0, 130040);
                composer3.T();
                i8++;
                size2 = size2;
                arrayList = arrayList;
                z2 = false;
                q2 = composer3;
            }
            composer2 = q2;
            composer2.M();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new M0(datePickerColors2, calendarModel2, i4));
        }
    }

    public static final Unit k0(Pair pair, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, (String) pair.e());
        return Unit.f40552a;
    }

    public static final Unit l0(DatePickerColors datePickerColors, CalendarModel calendarModel, int i2, Composer composer, int i3) {
        j0(datePickerColors, calendarModel, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void m0(String str, Modifier modifier, boolean z2, boolean z3, Function0 function0, boolean z4, String str2, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2 = modifier;
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        String str3 = str2;
        DatePickerColors datePickerColors2 = datePickerColors;
        int i4 = i2;
        Composer q2 = composer.q(-1153850597);
        String str4 = str;
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str4) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(modifier2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z6) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function0) ? 16384 : 8192;
        } else {
            Function0 function02 = function0;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.d(z7) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.W(str3) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i3 |= q2.W(datePickerColors2) ? 8388608 : 4194304;
        }
        boolean z8 = false;
        if (q2.E((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1153850597, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:2128)");
            }
            boolean z9 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object g2 = q2.g();
            if (z9 || g2 == Composer.f14567a.a()) {
                g2 = (!z6 || z5) ? null : BorderStrokeKt.a(DatePickerModalTokens.f13010a.l(), datePickerColors.k());
                q2.N(g2);
            }
            BorderStroke borderStroke = (BorderStroke) g2;
            if ((3670016 & i3) == 1048576) {
                z8 = true;
            }
            Object g3 = q2.g();
            if (z8 || g3 == Composer.f14567a.a()) {
                g3 = new W0(str3);
                q2.N(g3);
            }
            int i5 = i3 >> 6;
            int i6 = i5 & 14;
            composer2 = q2;
            SurfaceKt.d(z2, function0, SemanticsModifierKt.c(modifier2, true, (Function1) g3), z4, ShapesKt.g(DatePickerModalTokens.f13010a.z(), q2, 6), ((Color) datePickerColors2.m(z5, z7, q2, ((i3 >> 15) & 896) | i6 | ((i3 >> 12) & 112)).getValue()).v(), 0, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.e(-564400443, true, new DatePickerKt$Year$2(str, datePickerColors, z3, z2, z4), composer2, 54), composer2, i6 | ((i3 >> 9) & 112) | (i5 & 7168), 48, 1472);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new X0(str, modifier, z2, z3, function0, z4, str2, datePickerColors, i2));
        }
    }

    public static final Unit n0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.z0(semanticsPropertyReceiver, new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null));
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.a());
        return Unit.f40552a;
    }

    public static final Unit o0(String str, Modifier modifier, boolean z2, boolean z3, Function0 function0, boolean z4, String str2, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        m0(str, modifier, z2, z3, function0, z4, str2, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void p0(Modifier modifier, long j2, Function1 function1, SelectableDates selectableDates, CalendarModel calendarModel, IntRange intRange, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        int i4 = i2;
        Composer q2 = composer.q(-1286899812);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i4;
        } else {
            Modifier modifier2 = modifier;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.j(j2) ? 32 : 16;
        } else {
            long j3 = j2;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function1) ? 256 : 128;
        } else {
            Function1 function12 = function1;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(selectableDates) ? 2048 : 1024;
        } else {
            SelectableDates selectableDates2 = selectableDates;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(calendarModel) ? 16384 : 8192;
        } else {
            CalendarModel calendarModel2 = calendarModel;
        }
        IntRange intRange2 = intRange;
        if ((196608 & i4) == 0) {
            i3 |= q2.l(intRange2) ? 131072 : 65536;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((1572864 & i4) == 0) {
            i3 |= q2.W(datePickerColors2) ? 1048576 : 524288;
        }
        if (q2.E((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1286899812, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2068)");
            }
            TextKt.h(TypographyKt.e(DatePickerModalTokens.f13010a.w(), q2, 6), ComposableLambdaKt.e(1301915789, true, new DatePickerKt$YearPicker$1(calendarModel, j2, intRange, modifier, datePickerColors, function1, selectableDates), q2, 54), q2, 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new N0(modifier, j2, function1, selectableDates, calendarModel, intRange, datePickerColors, i2));
        }
    }

    public static final Unit q0(Modifier modifier, long j2, Function1 function1, SelectableDates selectableDates, CalendarModel calendarModel, IntRange intRange, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        p0(modifier, j2, function1, selectableDates, calendarModel, intRange, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r0(kotlin.jvm.functions.Function0 r22, boolean r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function2 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r2 = r23
            r4 = r25
            r5 = r27
            r0 = -709923073(0xffffffffd5af6eff, float:-2.41114074E13)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r5 | 6
            r6 = r3
            r3 = r22
            goto L_0x002d
        L_0x0019:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r22
            boolean r6 = r1.l(r3)
            if (r6 == 0) goto L_0x0027
            r6 = 4
            goto L_0x0028
        L_0x0027:
            r6 = 2
        L_0x0028:
            r6 = r6 | r5
            goto L_0x002d
        L_0x002a:
            r3 = r22
            r6 = r5
        L_0x002d:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
            goto L_0x0044
        L_0x0034:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0044
            boolean r7 = r1.d(r2)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x004d
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r24
            goto L_0x005f
        L_0x004d:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r24
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r6 = r6 | r9
        L_0x005f:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0067
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r15 = r6
            goto L_0x0078
        L_0x0067:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            boolean r9 = r1.l(r4)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r6 = r6 | r9
            goto L_0x0065
        L_0x0078:
            r6 = r15 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            r13 = 1
            if (r6 == r9) goto L_0x0081
            r6 = r13
            goto L_0x0082
        L_0x0081:
            r6 = 0
        L_0x0082:
            r9 = r15 & 1
            boolean r6 = r1.E(r6, r9)
            if (r6 == 0) goto L_0x00fb
            if (r7 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r19 = r6
            goto L_0x0093
        L_0x0091:
            r19 = r8
        L_0x0093:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x009f
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r6, r7)
        L_0x009f:
            androidx.compose.foundation.shape.RoundedCornerShape r0 = androidx.compose.foundation.shape.RoundedCornerShapeKt.f()
            androidx.compose.material3.ButtonDefaults r6 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r7 = r1.C(r7)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r9 = r7.v()
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 13
            r7 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r18 = r15
            r15 = r1
            androidx.compose.material3.ButtonColors r10 = r6.n(r7, r9, r11, r13, r15, r16, r17)
            androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1 r6 = new androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
            r6.<init>(r4, r2)
            r7 = 54
            r8 = 1899489890(0x7137ea62, float:9.107057E29)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r9, r6, r1, r7)
            r6 = r18 & 14
            r7 = 807075840(0x301b0000, float:5.638867E-10)
            r6 = r6 | r7
            int r7 = r18 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r17 = r6 | r7
            r18 = 388(0x184, float:5.44E-43)
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r6 = r22
            r7 = r19
            r9 = r0
            r16 = r1
            androidx.compose.material3.ButtonKt.g(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0100
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0100
        L_0x00fb:
            r1.B()
            r19 = r8
        L_0x0100:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x011b
            androidx.compose.material3.Z0 r8 = new androidx.compose.material3.Z0
            r0 = r8
            r1 = r22
            r2 = r23
            r3 = r19
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.r0(kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit s0(Function0 function0, boolean z2, Modifier modifier, Function2 function2, int i2, int i3, Composer composer, int i4) {
        r0(function0, z2, modifier, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
