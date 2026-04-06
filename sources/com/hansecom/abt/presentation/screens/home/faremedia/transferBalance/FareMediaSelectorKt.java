package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class FareMediaSelectorKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia r28, kotlinx.collections.immutable.ImmutableList r29, kotlinx.collections.immutable.ImmutableList r30, kotlin.jvm.functions.Function1 r31, boolean r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r34
            java.lang.String r0 = "virtualFareMediaList"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r0 = "physicalFareMediaList"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onSelectItem"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = -1832385040(0xffffffff92c805f0, float:-1.2623238E-27)
            r1 = r33
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r35 & 1
            r14 = 2
            if (r1 == 0) goto L_0x002a
            r1 = r13 | 6
            goto L_0x003a
        L_0x002a:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0039
            boolean r1 = r15.W(r9)
            if (r1 == 0) goto L_0x0036
            r1 = 4
            goto L_0x0037
        L_0x0036:
            r1 = r14
        L_0x0037:
            r1 = r1 | r13
            goto L_0x003a
        L_0x0039:
            r1 = r13
        L_0x003a:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x0041
            r1 = r1 | 48
            goto L_0x0051
        L_0x0041:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0051
            boolean r2 = r15.W(r10)
            if (r2 == 0) goto L_0x004e
            r2 = 32
            goto L_0x0050
        L_0x004e:
            r2 = 16
        L_0x0050:
            r1 = r1 | r2
        L_0x0051:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0068
            boolean r2 = r15.W(r11)
            if (r2 == 0) goto L_0x0065
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r2
        L_0x0068:
            r2 = r35 & 8
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x007f
            boolean r2 = r15.l(r12)
            if (r2 == 0) goto L_0x007c
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r2
        L_0x007f:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r3 = r32
        L_0x0087:
            r8 = r1
            goto L_0x009c
        L_0x0089:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0085
            r3 = r32
            boolean r4 = r15.d(r3)
            if (r4 == 0) goto L_0x0098
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r4
            goto L_0x0087
        L_0x009c:
            r1 = r8 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r4) goto L_0x00b0
            boolean r1 = r15.t()
            if (r1 != 0) goto L_0x00a9
            goto L_0x00b0
        L_0x00a9:
            r15.B()
            r5 = r3
            r7 = r15
            goto L_0x0216
        L_0x00b0:
            r7 = 1
            if (r2 == 0) goto L_0x00b6
            r24 = r7
            goto L_0x00b8
        L_0x00b6:
            r24 = r3
        L_0x00b8:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00c4
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.FareMediaSelector (FareMediaSelector.kt:50)"
            androidx.compose.runtime.ComposerKt.Y(r0, r8, r1, r2)
        L_0x00c4:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 1705837379(0x65ad0343, float:1.021287E23)
            r15.X(r2)
            java.lang.Object r2 = r15.g()
            androidx.compose.runtime.Composer$Companion r25 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r25.a()
            if (r2 != r3) goto L_0x00e1
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.d r2 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.d
            r2.<init>()
            r15.N(r2)
        L_0x00e1:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r15.M()
            r3 = 48
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.j(r1, r2, r15, r3)
            r6 = r1
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            r1 = 0
            r5 = 6
            r4 = 0
            if (r9 == 0) goto L_0x0164
            r2 = 1341418903(0x4ff46d97, float:8.2016456E9)
            r15.X(r2)
            boolean r2 = r28.c()
            if (r2 != 0) goto L_0x0109
            boolean r2 = r28.d()
            if (r2 != 0) goto L_0x0109
            r16 = r7
            goto L_0x010b
        L_0x0109:
            r16 = r0
        L_0x010b:
            com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem r0 = com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.f38685a
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r2, r1, r7, r4)
            r2 = 1705846275(0x65ad2603, float:1.0220882E23)
            r15.X(r2)
            boolean r2 = r15.W(r6)
            java.lang.Object r3 = r15.g()
            if (r2 != 0) goto L_0x0129
            java.lang.Object r2 = r25.a()
            if (r3 != r2) goto L_0x0131
        L_0x0129:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.e r3 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.e
            r3.<init>(r6)
            r15.N(r3)
        L_0x0131:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r15.M()
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ComposableSingletons$FareMediaSelectorKt r2 = com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ComposableSingletons$FareMediaSelectorKt.f37266a
            kotlin.jvm.functions.Function2 r17 = r2.a()
            int r2 = r8 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r18 = 221190(0x36006, float:3.09953E-40)
            r18 = r2 | r18
            r19 = 0
            r2 = r28
            r4 = r16
            r5 = r17
            r26 = r6
            r6 = r15
            r7 = r18
            r27 = r8
            r8 = r19
            r0.t(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.M()
            r2 = r14
            r7 = r15
            r1 = r26
            r3 = 0
            r4 = 1
            r5 = 6
            goto L_0x01cf
        L_0x0164:
            r26 = r6
            r27 = r8
            r2 = 1341807209(0x4ffa5a69, float:8.4004582E9)
            r15.X(r2)
            r2 = r24 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r17 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r2, r3, r14, r3)
            int r2 = com.hansecom.abt.R.string.U9
            java.lang.String r18 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r15, r0)
            int r2 = com.hansecom.abt.R.drawable.Q
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r5 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r4 = r4.a(r15, r5)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r16 = r4.c(r15, r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r4 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r4, r3)
            r1 = 1705855363(0x65ad4983, float:1.0229068E23)
            r15.X(r1)
            r1 = r26
            boolean r6 = r15.W(r1)
            java.lang.Object r7 = r15.g()
            if (r6 != 0) goto L_0x01ab
            java.lang.Object r6 = r25.a()
            if (r7 != r6) goto L_0x01b3
        L_0x01ab:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.f r7 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.f
            r7.<init>(r1)
            r15.N(r7)
        L_0x01b3:
            r6 = r7
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r15.M()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r22 = 48
            r23 = 64
            r20 = 0
            r2 = r14
            r14 = r6
            r7 = r15
            r15 = r0
            r21 = r7
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r7.M()
        L_0x01cf:
            boolean r0 = n(r1)
            if (r0 == 0) goto L_0x020b
            androidx.compose.material3.SheetState r0 = androidx.compose.material3.ModalBottomSheetKt.T(r4, r3, r7, r5, r2)
            r2 = 1705871492(0x65ad8884, float:1.0243596E23)
            r7.X(r2)
            boolean r2 = r7.W(r1)
            java.lang.Object r3 = r7.g()
            if (r2 != 0) goto L_0x01ef
            java.lang.Object r2 = r25.a()
            if (r3 != r2) goto L_0x01f7
        L_0x01ef:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.g r3 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.g
            r3.<init>(r1)
            r7.N(r3)
        L_0x01f7:
            r4 = r3
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r7.M()
            r1 = r27
            r6 = r1 & 8176(0x1ff0, float:1.1457E-41)
            r1 = r29
            r2 = r30
            r3 = r31
            r5 = r7
            s(r0, r1, r2, r3, r4, r5, r6)
        L_0x020b:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0214
            androidx.compose.runtime.ComposerKt.X()
        L_0x0214:
            r5 = r24
        L_0x0216:
            androidx.compose.runtime.ScopeUpdateScope r8 = r7.x()
            if (r8 == 0) goto L_0x0231
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.h r14 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.h
            r0 = r14
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r14)
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.FareMediaSelectorKt.k(com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final MutableState l() {
        return SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final Unit m(PaymentMethodState.FareMedia fareMedia, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, boolean z2, int i2, int i3, Composer composer, int i4) {
        k(fareMedia, immutableList, immutableList2, function1, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final boolean n(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void o(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final Unit p(MutableState mutableState) {
        o(mutableState, true);
        return Unit.f40552a;
    }

    public static final Unit q(MutableState mutableState) {
        o(mutableState, true);
        return Unit.f40552a;
    }

    public static final Unit r(MutableState mutableState) {
        o(mutableState, false);
        return Unit.f40552a;
    }

    public static final void s(SheetState sheetState, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, Function0 function0, Composer composer, int i2) {
        int i3;
        int i4 = i2;
        Composer q2 = composer.q(301486200);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(sheetState) ? 4 : 2) | i4;
        } else {
            SheetState sheetState2 = sheetState;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(immutableList) ? 32 : 16;
        } else {
            ImmutableList immutableList3 = immutableList;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.W(immutableList2) ? 256 : 128;
        } else {
            ImmutableList immutableList4 = immutableList2;
        }
        Function1 function12 = function1;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function12) ? 2048 : 1024;
        }
        Function0 function02 = function0;
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function02) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(301486200, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.FareMediaSelectorBottomSheet (FareMediaSelector.kt:96)");
            }
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                q2.N(g2);
            }
            String b2 = StringResources_androidKt.b(R.string.Z2, q2, 0);
            FareMediaSelectorKt$FareMediaSelectorBottomSheet$1 fareMediaSelectorKt$FareMediaSelectorBottomSheet$1 = r7;
            FareMediaSelectorKt$FareMediaSelectorBottomSheet$1 fareMediaSelectorKt$FareMediaSelectorBottomSheet$12 = new FareMediaSelectorKt$FareMediaSelectorBottomSheet$1(immutableList, immutableList2, function1, (CoroutineScope) g2, sheetState, function0);
            AbtBottomSheetKt.e(sheetState, b2, 0, 0, (Shape) null, (Function2) null, function0, (Function3) null, ComposableLambdaKt.e(-1319045140, true, fareMediaSelectorKt$FareMediaSelectorBottomSheet$1, q2, 54), q2, (i3 & 14) | 100663296 | ((i3 << 6) & 3670016), 188);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0601c(sheetState, immutableList, immutableList2, function1, function0, i2));
        }
    }

    public static final Unit t(SheetState sheetState, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        s(sheetState, immutableList, immutableList2, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(kotlinx.collections.immutable.ImmutableList r18, kotlinx.collections.immutable.ImmutableList r19, kotlin.jvm.functions.Function1 r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = -577274243(0xffffffffdd977e7d, float:-1.3645375E18)
            r5 = r21
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            r6 = 4
            if (r5 != 0) goto L_0x0021
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001e
            r5 = r6
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r5 = r5 | r3
            goto L_0x0022
        L_0x0021:
            r5 = r3
        L_0x0022:
            r7 = r3 & 48
            r8 = 32
            if (r7 != 0) goto L_0x0033
            boolean r7 = r15.W(r1)
            if (r7 == 0) goto L_0x0030
            r7 = r8
            goto L_0x0032
        L_0x0030:
            r7 = 16
        L_0x0032:
            r5 = r5 | r7
        L_0x0033:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r15.l(r2)
            if (r7 == 0) goto L_0x0041
            r7 = r9
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r5 = r5 | r7
        L_0x0044:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r7 != r10) goto L_0x0057
            boolean r7 = r15.t()
            if (r7 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r15.B()
            r4 = r15
            goto L_0x00c2
        L_0x0057:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0063
            r7 = -1
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ScreenImpl (FareMediaSelector.kt:124)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r7, r10)
        L_0x0063:
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r7 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r4.n(r7)
            r7 = 796208613(0x2f752de5, float:2.2298925E-10)
            r15.X(r7)
            r7 = r5 & 14
            r10 = 0
            r11 = 1
            if (r7 != r6) goto L_0x007c
            r6 = r11
            goto L_0x007d
        L_0x007c:
            r6 = r10
        L_0x007d:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != r9) goto L_0x0083
            r7 = r11
            goto L_0x0084
        L_0x0083:
            r7 = r10
        L_0x0084:
            r6 = r6 | r7
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r8) goto L_0x008a
            r10 = r11
        L_0x008a:
            r5 = r6 | r10
            java.lang.Object r6 = r15.g()
            if (r5 != 0) goto L_0x009a
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00a2
        L_0x009a:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.a r6 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.a
            r6.<init>(r0, r1, r2)
            r15.N(r6)
        L_0x00a2:
            r14 = r6
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15.M()
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 495(0x1ef, float:6.94E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r4
            r4 = r15
            androidx.compose.foundation.lazy.LazyDslKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c2:
            androidx.compose.runtime.ScopeUpdateScope r4 = r4.x()
            if (r4 == 0) goto L_0x00d0
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.b r5 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.b
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.FareMediaSelectorKt.u(kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit v(ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        if (!immutableList.isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$FareMediaSelectorKt.f37266a.b(), 3, (Object) null);
        }
        lazyListScope.d(immutableList.size(), new FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$2(new i(), immutableList), new FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$3(FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$1.f37281z, immutableList), ComposableLambdaKt.c(-632812321, true, new FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$4(immutableList, function1)));
        if (!immutableList2.isEmpty() && !immutableList.isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$FareMediaSelectorKt.f37266a.c(), 3, (Object) null);
        }
        if (!immutableList2.isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$FareMediaSelectorKt.f37266a.d(), 3, (Object) null);
        }
        lazyListScope.d(immutableList2.size(), new FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$6(new j(), immutableList2), new FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$7(FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$5.f37288z, immutableList2), ComposableLambdaKt.c(-632812321, true, new FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$8(immutableList2, function1)));
        return Unit.f40552a;
    }

    public static final Object w(PaymentMethodState.FareMedia fareMedia) {
        Intrinsics.i(fareMedia, "it");
        return fareMedia.m();
    }

    public static final Object x(PaymentMethodState.FareMedia fareMedia) {
        Intrinsics.i(fareMedia, "it");
        return fareMedia.m();
    }

    public static final Unit y(ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, int i2, Composer composer, int i3) {
        u(immutableList, immutableList2, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
