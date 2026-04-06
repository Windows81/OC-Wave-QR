package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Questions f35386A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f35387B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f35388z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3(List list, ChangeSecurityQuestions.State.Questions questions, boolean z2, Function1 function1) {
        super(4);
        this.f35388z = list;
        this.f35386A = questions;
        this.f35387B = z2;
        this.C = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.LazyItemScope r11, int r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r10 = this;
            r0 = 1
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0010
            boolean r11 = r13.W(r11)
            if (r11 == 0) goto L_0x000d
            r11 = 4
            goto L_0x000e
        L_0x000d:
            r11 = 2
        L_0x000e:
            r11 = r11 | r14
            goto L_0x0011
        L_0x0010:
            r11 = r14
        L_0x0011:
            r14 = r14 & 48
            if (r14 != 0) goto L_0x0021
            boolean r14 = r13.i(r12)
            if (r14 == 0) goto L_0x001e
            r14 = 32
            goto L_0x0020
        L_0x001e:
            r14 = 16
        L_0x0020:
            r11 = r11 | r14
        L_0x0021:
            r14 = r11 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            r2 = 0
            if (r14 == r1) goto L_0x002a
            r14 = r0
            goto L_0x002b
        L_0x002a:
            r14 = r2
        L_0x002b:
            r1 = r11 & 1
            boolean r14 = r13.E(r14, r1)
            if (r14 == 0) goto L_0x0148
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0042
            r14 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)"
            r3 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            androidx.compose.runtime.ComposerKt.Y(r3, r11, r14, r1)
        L_0x0042:
            java.util.List r11 = r10.f35388z
            java.lang.Object r11 = r11.get(r12)
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3
            r11 = -1519383232(0xffffffffa5700d40, float:-2.0821171E-16)
            r13.X(r11)
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            r14 = 0
            r1 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.h(r11, r14, r0, r1)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r1 = r1.g()
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r4.k()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.ColumnKt.a(r1, r4, r13, r2)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r13, r2)
            androidx.compose.runtime.CompositionLocalMap r5 = r13.I()
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.ComposedModifierKt.e(r13, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r8 = r13.v()
            if (r8 != 0) goto L_0x0084
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0084:
            r13.s()
            boolean r8 = r13.n()
            if (r8 == 0) goto L_0x0091
            r13.y(r7)
            goto L_0x0094
        L_0x0091:
            r13.K()
        L_0x0094:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r13)
            kotlin.jvm.functions.Function2 r8 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r1, r8)
            kotlin.jvm.functions.Function2 r1 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r1)
            kotlin.jvm.functions.Function2 r1 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x00be
            java.lang.Object r5 = r7.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r8)
            if (r5 != 0) goto L_0x00cc
        L_0x00be:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r1)
        L_0x00cc:
            kotlin.jvm.functions.Function2 r1 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r14, r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r14 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "questions_item"
            r14.append(r1)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.a(r11, r14)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions r11 = r10.f35386A
            kotlinx.collections.immutable.ImmutableList r11 = r11.b()
            int r11 = r11.size()
            int r11 = r11 - r0
            if (r12 == r11) goto L_0x00f9
            r6 = r0
            goto L_0x00fa
        L_0x00f9:
            r6 = r2
        L_0x00fa:
            r11 = -623089496(0xffffffffdadc68a8, float:-3.10197828E16)
            r13.X(r11)
            boolean r11 = r10.f35387B
            boolean r11 = r13.d(r11)
            kotlin.jvm.functions.Function1 r12 = r10.C
            boolean r12 = r13.W(r12)
            r11 = r11 | r12
            boolean r12 = r13.W(r3)
            r11 = r11 | r12
            java.lang.Object r12 = r13.g()
            if (r11 != 0) goto L_0x0120
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x012c
        L_0x0120:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$1$1$1$1$1$1 r12 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$1$1$1$1$1$1
            boolean r11 = r10.f35387B
            kotlin.jvm.functions.Function1 r14 = r10.C
            r12.<init>(r11, r14, r3)
            r13.N(r12)
        L_0x012c:
            r4 = r12
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r13.M()
            r8 = 0
            r9 = 0
            r7 = r13
            com.hansecom.abt.ui.components.listItem.OptionItemKt.b(r3, r4, r5, r6, r7, r8, r9)
            r13.T()
            r13.M()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x014b
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x014b
        L_0x0148:
            r13.B()
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3.b(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
