package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ModalBottomSheet_androidKt {
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019e, code lost:
        if (r2 == r18.a()) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function0 r23, long r24, androidx.compose.material3.ModalBottomSheetProperties r26, androidx.compose.animation.core.Animatable r27, kotlin.jvm.functions.Function2 r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            r12 = r27
            r13 = r28
            r14 = r30
            r0 = 766784632(0x2db43478, float:2.0486932E-11)
            r1 = r29
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r14 & 6
            r10 = r23
            if (r1 != 0) goto L_0x0020
            boolean r1 = r15.l(r10)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r14
            goto L_0x0021
        L_0x0020:
            r1 = r14
        L_0x0021:
            r2 = r14 & 48
            r7 = r24
            if (r2 != 0) goto L_0x0033
            boolean r2 = r15.j(r7)
            if (r2 == 0) goto L_0x0030
            r2 = 32
            goto L_0x0032
        L_0x0030:
            r2 = 16
        L_0x0032:
            r1 = r1 | r2
        L_0x0033:
            r2 = r14 & 384(0x180, float:5.38E-43)
            r5 = r26
            if (r2 != 0) goto L_0x0045
            boolean r2 = r15.W(r5)
            if (r2 == 0) goto L_0x0042
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r1 = r1 | r2
        L_0x0045:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x005e
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 != 0) goto L_0x0052
            boolean r2 = r15.W(r12)
            goto L_0x0056
        L_0x0052:
            boolean r2 = r15.l(r12)
        L_0x0056:
            if (r2 == 0) goto L_0x005b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x005d
        L_0x005b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x005d:
            r1 = r1 | r2
        L_0x005e:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x006e
            boolean r2 = r15.l(r13)
            if (r2 == 0) goto L_0x006b
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006d
        L_0x006b:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x006d:
            r1 = r1 | r2
        L_0x006e:
            r3 = r1
            r1 = r3 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            r11 = 0
            if (r1 == r2) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = r11
        L_0x0079:
            r2 = r3 & 1
            boolean r1 = r15.E(r1, r2)
            if (r1 == 0) goto L_0x01c0
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x008d
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:369)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r1, r2)
        L_0x008d:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r15.C(r0)
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r15.C(r0)
            r1 = r0
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r15.C(r0)
            r16 = r0
            androidx.compose.ui.unit.LayoutDirection r16 = (androidx.compose.ui.unit.LayoutDirection) r16
            androidx.compose.runtime.CompositionContext r0 = androidx.compose.runtime.ComposablesKt.e(r15, r11)
            int r17 = r3 >> 12
            r4 = r17 & 14
            androidx.compose.runtime.State r4 = androidx.compose.runtime.SnapshotStateKt.p(r13, r15, r4)
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.Object r9 = r15.g()
            androidx.compose.runtime.Composer$Companion r18 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r18.a()
            if (r9 != r11) goto L_0x00d1
            androidx.compose.material3.V3 r9 = new androidx.compose.material3.V3
            r9.<init>()
            r15.N(r9)
        L_0x00d1:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r11 = 48
            java.lang.Object r6 = androidx.compose.runtime.saveable.RememberSaveableKt.j(r6, r9, r15, r11)
            r9 = r6
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r6 = r15.g()
            java.lang.Object r11 = r18.a()
            if (r6 != r11) goto L_0x00ef
            kotlin.coroutines.EmptyCoroutineContext r6 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r6 = androidx.compose.runtime.EffectsKt.j(r6, r15)
            r15.N(r6)
        L_0x00ef:
            r11 = r6
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            boolean r6 = r15.W(r2)
            boolean r19 = r15.W(r1)
            r6 = r6 | r19
            r19 = r0
            java.lang.Object r0 = r15.g()
            if (r6 != 0) goto L_0x010f
            java.lang.Object r6 = r18.a()
            if (r0 != r6) goto L_0x010b
            goto L_0x010f
        L_0x010b:
            r22 = r3
            r2 = 1
            goto L_0x0147
        L_0x010f:
            androidx.compose.material3.ModalBottomSheetDialogWrapper r6 = new androidx.compose.material3.ModalBottomSheetDialogWrapper
            r20 = 0
            r12 = r19
            r0 = r6
            r19 = r1
            r1 = r23
            r21 = r2
            r2 = r26
            r22 = r3
            r13 = r4
            r3 = r24
            r5 = r21
            r14 = r6
            r6 = r16
            r7 = r19
            r8 = r9
            r9 = r27
            r10 = r11
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1 r0 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1
            r0.<init>(r13)
            r1 = -1051373467(0xffffffffc1555065, float:-13.332128)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r1, r2, r0)
            r14.l(r12, r0)
            r15.N(r14)
            r0 = r14
        L_0x0147:
            r3 = r0
            androidx.compose.material3.ModalBottomSheetDialogWrapper r3 = (androidx.compose.material3.ModalBottomSheetDialogWrapper) r3
            boolean r0 = r15.l(r3)
            java.lang.Object r1 = r15.g()
            if (r0 != 0) goto L_0x015a
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x0162
        L_0x015a:
            androidx.compose.material3.W3 r1 = new androidx.compose.material3.W3
            r1.<init>(r3)
            r15.N(r1)
        L_0x0162:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 0
            androidx.compose.runtime.EffectsKt.c(r3, r1, r15, r0)
            boolean r1 = r15.l(r3)
            r4 = r22
            r5 = r4 & 14
            r6 = 4
            if (r5 != r6) goto L_0x0175
            r5 = r2
            goto L_0x0176
        L_0x0175:
            r5 = r0
        L_0x0176:
            r1 = r1 | r5
            r5 = r4 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x017f
            r5 = r2
            goto L_0x0180
        L_0x017f:
            r5 = r0
        L_0x0180:
            r1 = r1 | r5
            r4 = r4 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r4 != r5) goto L_0x0189
            r4 = r2
            goto L_0x018a
        L_0x0189:
            r4 = r0
        L_0x018a:
            r1 = r1 | r4
            int r2 = r16.ordinal()
            boolean r2 = r15.i(r2)
            r1 = r1 | r2
            java.lang.Object r2 = r15.g()
            if (r1 != 0) goto L_0x01a0
            java.lang.Object r1 = r18.a()
            if (r2 != r1) goto L_0x01b1
        L_0x01a0:
            androidx.compose.material3.X3 r1 = new androidx.compose.material3.X3
            r2 = r1
            r4 = r23
            r5 = r26
            r6 = r24
            r8 = r16
            r2.<init>(r3, r4, r5, r6, r8)
            r15.N(r1)
        L_0x01b1:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.compose.runtime.EffectsKt.h(r2, r15, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01c3
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01c3
        L_0x01c0:
            r15.B()
        L_0x01c3:
            androidx.compose.runtime.ScopeUpdateScope r8 = r15.x()
            if (r8 == 0) goto L_0x01de
            androidx.compose.material3.Y3 r9 = new androidx.compose.material3.Y3
            r0 = r9
            r1 = r23
            r2 = r24
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r30
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.e(kotlin.jvm.functions.Function0, long, androidx.compose.material3.ModalBottomSheetProperties, androidx.compose.animation.core.Animatable, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final Function2 f(State state) {
        return (Function2) state.getValue();
    }

    public static final Unit g(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, long j2, LayoutDirection layoutDirection) {
        modalBottomSheetDialogWrapper.o(function0, modalBottomSheetProperties, j2, layoutDirection);
        return Unit.f40552a;
    }

    public static final Unit h(Function0 function0, long j2, ModalBottomSheetProperties modalBottomSheetProperties, Animatable animatable, Function2 function2, int i2, Composer composer, int i3) {
        e(function0, j2, modalBottomSheetProperties, animatable, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final UUID i() {
        return UUID.randomUUID();
    }

    public static final DisposableEffectResult j(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, DisposableEffectScope disposableEffectScope) {
        modalBottomSheetDialogWrapper.show();
        return new ModalBottomSheet_androidKt$ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7$$inlined$onDispose$1(modalBottomSheetDialogWrapper);
    }

    public static final boolean l(long j2) {
        return !Color.n(j2, Color.f15975b.e()) && ((double) ColorKt.i(j2)) <= 0.5d;
    }

    public static final boolean m(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
