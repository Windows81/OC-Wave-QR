package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class TimePickerKt$TimeInputImpl$2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f11501A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref f11502B;
    public final /* synthetic */ TimePickerColors C;
    public final /* synthetic */ MutableState D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f11503z;

    public static final Unit k(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.d(TimePickerSelectionMode.f11521b.b());
        return Unit.f40552a;
    }

    public static final Unit p(TimePickerState timePickerState, Ref ref, MutableState mutableState, TextFieldValue textFieldValue) {
        TimePickerKt.E0(TimePickerSelectionMode.f11521b.a(), timePickerState, textFieldValue, TimePickerKt.J(mutableState), timePickerState.f() ? 23 : 12, ref, new T7(mutableState));
        return Unit.f40552a;
    }

    public static final Unit q(MutableState mutableState, TextFieldValue textFieldValue) {
        TimePickerKt.K(mutableState, textFieldValue);
        return Unit.f40552a;
    }

    public static final Unit s(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.d(TimePickerSelectionMode.f11521b.b());
        return Unit.f40552a;
    }

    public static final Unit t(TimePickerState timePickerState, Ref ref, MutableState mutableState, TextFieldValue textFieldValue) {
        TimePickerKt.E0(TimePickerSelectionMode.f11521b.b(), timePickerState, textFieldValue, TimePickerKt.L(mutableState), 59, ref, new U7(mutableState));
        return Unit.f40552a;
    }

    public static final Unit u(MutableState mutableState, TextFieldValue textFieldValue) {
        TimePickerKt.M(mutableState, textFieldValue);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(androidx.compose.runtime.Composer r40, int r41) {
        /*
            r39 = this;
            r0 = r39
            r12 = r40
            r1 = r41
            r2 = 1
            r3 = r1 & 3
            r4 = 2
            r5 = 0
            if (r3 == r4) goto L_0x000f
            r3 = r2
            goto L_0x0010
        L_0x000f:
            r3 = r5
        L_0x0010:
            r2 = r2 & r1
            boolean r2 = r12.E(r3, r2)
            if (r2 == 0) goto L_0x023b
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1032)"
            r4 = 1306700887(0x4de2ac57, float:4.7536816E8)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.runtime.MutableState r1 = r0.f11503z
            androidx.compose.material3.TimePickerState r13 = r0.f11501A
            androidx.compose.ui.node.Ref r14 = r0.f11502B
            androidx.compose.material3.TimePickerColors r15 = r0.C
            androidx.compose.runtime.MutableState r11 = r0.D
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r2 = r2.f()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r3 = r3.l()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.RowKt.b(r2, r3, r12, r5)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r12, r5)
            androidx.compose.runtime.CompositionLocalMap r4 = r40.I()
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.ComposedModifierKt.e(r12, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r8 = r40.v()
            if (r8 != 0) goto L_0x005d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x005d:
            r40.s()
            boolean r8 = r40.n()
            if (r8 == 0) goto L_0x006a
            r12.y(r7)
            goto L_0x006d
        L_0x006a:
            r40.K()
        L_0x006d:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r40)
            kotlin.jvm.functions.Function2 r8 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r2, r8)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r4 = r7.n()
            if (r4 != 0) goto L_0x0097
            java.lang.Object r4 = r7.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r8)
            if (r4 != 0) goto L_0x00a5
        L_0x0097:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.A(r3, r2)
        L_0x00a5:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r5, r2)
            androidx.compose.foundation.layout.RowScopeInstance r2 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            boolean r2 = r12.W(r1)
            boolean r3 = r12.l(r13)
            r2 = r2 | r3
            java.lang.Object r3 = r40.g()
            if (r2 != 0) goto L_0x00c5
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00cd
        L_0x00c5:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$1$1 r3 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$1$1
            r3.<init>(r13, r1)
            r12.N(r3)
        L_0x00cd:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.input.key.KeyInputModifierKt.a(r10, r3)
            androidx.compose.ui.text.input.TextFieldValue r3 = androidx.compose.material3.TimePickerKt.J(r1)
            boolean r4 = r12.l(r13)
            boolean r5 = r12.W(r1)
            r4 = r4 | r5
            boolean r5 = r12.l(r14)
            r4 = r4 | r5
            java.lang.Object r5 = r40.g()
            if (r4 != 0) goto L_0x00f3
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00fb
        L_0x00f3:
            androidx.compose.material3.P7 r5 = new androidx.compose.material3.P7
            r5.<init>(r13, r14, r1)
            r12.N(r5)
        L_0x00fb:
            r4 = r5
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.material3.TimePickerSelectionMode$Companion r16 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r5 = r16.a()
            androidx.compose.ui.text.input.ImeAction$Companion r17 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r22 = r17.d()
            androidx.compose.ui.text.input.KeyboardType$Companion r28 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r21 = r28.d()
            androidx.compose.foundation.text.KeyboardOptions r6 = new androidx.compose.foundation.text.KeyboardOptions
            r26 = 115(0x73, float:1.61E-43)
            r27 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r12.l(r13)
            java.lang.Object r7 = r40.g()
            if (r1 != 0) goto L_0x0137
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x013f
        L_0x0137:
            androidx.compose.material3.Q7 r7 = new androidx.compose.material3.Q7
            r7.<init>(r13)
            r12.N(r7)
        L_0x013f:
            r21 = r7
            kotlin.jvm.functions.Function1 r21 = (kotlin.jvm.functions.Function1) r21
            androidx.compose.foundation.text.KeyboardActions r7 = new androidx.compose.foundation.text.KeyboardActions
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 59
            r26 = 0
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r18 = 24576(0x6000, float:3.4438E-41)
            r19 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r13
            r8 = r15
            r9 = r40
            r0 = r10
            r10 = r18
            r18 = r15
            r15 = r11
            r11 = r19
            androidx.compose.material3.TimePickerKt.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r1 = androidx.compose.material3.TimePickerKt.f11472e
            androidx.compose.material3.tokens.TimeInputTokens r2 = androidx.compose.material3.tokens.TimeInputTokens.f14236a
            float r2 = r2.a()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.v(r0, r1, r2)
            r2 = 6
            androidx.compose.material3.TimePickerKt.F(r1, r12, r2)
            boolean r1 = r12.W(r15)
            boolean r2 = r12.l(r13)
            r1 = r1 | r2
            java.lang.Object r2 = r40.g()
            if (r1 != 0) goto L_0x0197
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x019f
        L_0x0197:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$4$1 r2 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$4$1
            r2.<init>(r13, r15)
            r12.N(r2)
        L_0x019f:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.key.KeyInputModifierKt.b(r0, r2)
            androidx.compose.ui.text.input.TextFieldValue r2 = androidx.compose.material3.TimePickerKt.L(r15)
            boolean r0 = r12.l(r13)
            boolean r3 = r12.W(r15)
            r0 = r0 | r3
            boolean r3 = r12.l(r14)
            r0 = r0 | r3
            java.lang.Object r3 = r40.g()
            if (r0 != 0) goto L_0x01c5
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x01cd
        L_0x01c5:
            androidx.compose.material3.R7 r3 = new androidx.compose.material3.R7
            r3.<init>(r13, r14, r15)
            r12.N(r3)
        L_0x01cd:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            int r5 = r16.b()
            int r33 = r17.b()
            int r32 = r28.d()
            androidx.compose.foundation.text.KeyboardOptions r6 = new androidx.compose.foundation.text.KeyboardOptions
            r37 = 115(0x73, float:1.61E-43)
            r38 = 0
            r30 = 0
            r31 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r29 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            boolean r0 = r12.l(r13)
            java.lang.Object r4 = r40.g()
            if (r0 != 0) goto L_0x0202
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x020a
        L_0x0202:
            androidx.compose.material3.S7 r4 = new androidx.compose.material3.S7
            r4.<init>(r13)
            r12.N(r4)
        L_0x020a:
            r22 = r4
            kotlin.jvm.functions.Function1 r22 = (kotlin.jvm.functions.Function1) r22
            androidx.compose.foundation.text.KeyboardActions r7 = new androidx.compose.foundation.text.KeyboardActions
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 59
            r27 = 0
            r19 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r10 = 24576(0x6000, float:3.4438E-41)
            r11 = 0
            r4 = r13
            r8 = r18
            r9 = r40
            androidx.compose.material3.TimePickerKt.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r40.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x023e
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x023e
        L_0x023b:
            r40.B()
        L_0x023e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.i(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        i((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
