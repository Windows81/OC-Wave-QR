package com.hansecom.abt.presentation.mvi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class MviEffectKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlinx.coroutines.flow.Flow r15, androidx.lifecycle.Lifecycle.State r16, java.lang.Object r17, kotlin.jvm.functions.Function2 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r6 = r15
            r7 = r18
            r8 = r20
            java.lang.String r0 = "effects"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            r0 = 1958526018(0x74bcbc42, float:1.1962526E32)
            r1 = r19
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = r21 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r8 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x002e
            boolean r1 = r9.l(r15)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r8
            goto L_0x002f
        L_0x002e:
            r1 = r8
        L_0x002f:
            r2 = r21 & 2
            r3 = 32
            if (r2 == 0) goto L_0x003a
            r1 = r1 | 48
        L_0x0037:
            r4 = r16
            goto L_0x004b
        L_0x003a:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x0037
            r4 = r16
            boolean r5 = r9.W(r4)
            if (r5 == 0) goto L_0x0048
            r5 = r3
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
        L_0x004b:
            r5 = r21 & 4
            if (r5 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r10 = r17
            goto L_0x0066
        L_0x0054:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0051
            r10 = r17
            boolean r11 = r9.l(r10)
            if (r11 == 0) goto L_0x0063
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r11
        L_0x0066:
            r11 = r21 & 8
            if (r11 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r11 = r1
            goto L_0x007f
        L_0x006e:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x006c
            boolean r11 = r9.l(r7)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r11
            goto L_0x006c
        L_0x007f:
            r1 = r11 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r1 != r12) goto L_0x0093
            boolean r1 = r9.t()
            if (r1 != 0) goto L_0x008c
            goto L_0x0093
        L_0x008c:
            r9.B()
            r2 = r4
            r3 = r10
            goto L_0x0109
        L_0x0093:
            if (r2 == 0) goto L_0x0099
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            r12 = r1
            goto L_0x009a
        L_0x0099:
            r12 = r4
        L_0x009a:
            if (r5 == 0) goto L_0x009e
            r1 = 0
            r10 = r1
        L_0x009e:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00aa
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.mvi.MviEffect (MviEffect.kt:15)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r1, r2)
        L_0x00aa:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.c()
            java.lang.Object r0 = r9.C(r0)
            r13 = r0
            androidx.lifecycle.LifecycleOwner r13 = (androidx.lifecycle.LifecycleOwner) r13
            r0 = 335019757(0x13f7feed, float:6.2602942E-27)
            r9.X(r0)
            boolean r0 = r9.l(r13)
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x00c5
            r1 = 1
            goto L_0x00c6
        L_0x00c5:
            r1 = 0
        L_0x00c6:
            r0 = r0 | r1
            boolean r1 = r9.l(r15)
            r0 = r0 | r1
            boolean r1 = r9.l(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r9.g()
            if (r0 != 0) goto L_0x00df
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00ef
        L_0x00df:
            com.hansecom.abt.presentation.mvi.MviEffectKt$MviEffect$1$1 r14 = new com.hansecom.abt.presentation.mvi.MviEffectKt$MviEffect$1$1
            r5 = 0
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r9.N(r14)
            r1 = r14
        L_0x00ef:
            r3 = r1
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r9.M()
            r5 = r11 & 910(0x38e, float:1.275E-42)
            r0 = r15
            r1 = r13
            r2 = r10
            r4 = r9
            androidx.compose.runtime.EffectsKt.e(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0107
            androidx.compose.runtime.ComposerKt.X()
        L_0x0107:
            r3 = r10
            r2 = r12
        L_0x0109:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.x()
            if (r9 == 0) goto L_0x011f
            com.hansecom.abt.presentation.mvi.a r10 = new com.hansecom.abt.presentation.mvi.a
            r0 = r10
            r1 = r15
            r4 = r18
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.a(r10)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.mvi.MviEffectKt.b(kotlinx.coroutines.flow.Flow, androidx.lifecycle.Lifecycle$State, java.lang.Object, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(Flow flow, Lifecycle.State state, Object obj, Function2 function2, int i2, int i3, Composer composer, int i4) {
        b(flow, state, obj, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
