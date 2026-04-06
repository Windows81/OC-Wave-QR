package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DebugMenuDialogKt$DialogImpl$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37610A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f37611B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37612z;

    public DebugMenuDialogKt$DialogImpl$2(Function1 function1, Function0 function0, MutableState mutableState) {
        this.f37612z = function1;
        this.f37610A = function0;
        this.f37611B = mutableState;
    }

    /* access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(DebugMenu.Action.RestartApp.f37607a);
        return Unit.f40552a;
    }

    public static final Unit g(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r13, int r14) {
        /*
            r12 = this;
            r0 = r14 & 3
            r1 = 2
            if (r0 != r1) goto L_0x0011
            boolean r0 = r13.t()
            if (r0 != 0) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            r13.B()
            goto L_0x00d0
        L_0x0011:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0020
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.presentation.screens.main.debugMenu.DialogImpl.<anonymous> (DebugMenuDialog.kt:71)"
            r2 = 42861985(0x28e05a1, float:2.0868256E-37)
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r0, r1)
        L_0x0020:
            androidx.compose.runtime.MutableState r14 = r12.f37611B
            boolean r14 = com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt.k(r14)
            r0 = 6
            r1 = 0
            if (r14 == 0) goto L_0x0079
            r14 = -284123208(0xffffffffef109fb8, float:-4.475893E28)
            r13.X(r14)
            int r14 = com.hansecom.abt.R.string.L3
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r14, r13, r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r14 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r14 = r14.a(r13, r0)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r14.c(r13, r1)
            r14 = -1256084932(0xffffffffb521aa3c, float:-6.02249E-7)
            r13.X(r14)
            kotlin.jvm.functions.Function1 r14 = r12.f37612z
            boolean r14 = r13.W(r14)
            kotlin.jvm.functions.Function1 r0 = r12.f37612z
            java.lang.Object r1 = r13.g()
            if (r14 != 0) goto L_0x005c
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x0064
        L_0x005c:
            com.hansecom.abt.presentation.screens.main.debugMenu.d r1 = new com.hansecom.abt.presentation.screens.main.debugMenu.d
            r1.<init>(r0)
            r13.N(r1)
        L_0x0064:
            r2 = r1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.M()
            r10 = 0
            r11 = 106(0x6a, float:1.49E-43)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = r13
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.M()
            goto L_0x00c7
        L_0x0079:
            r14 = -283852671(0xffffffffef14c081, float:-4.6036504E28)
            r13.X(r14)
            int r14 = com.hansecom.abt.R.string.K3
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r14, r13, r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r14 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r14 = r14.a(r13, r0)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r14.c(r13, r1)
            r14 = -1256076267(0xffffffffb521cc15, float:-6.027415E-7)
            r13.X(r14)
            kotlin.jvm.functions.Function0 r14 = r12.f37610A
            boolean r14 = r13.W(r14)
            kotlin.jvm.functions.Function0 r0 = r12.f37610A
            java.lang.Object r1 = r13.g()
            if (r14 != 0) goto L_0x00ab
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x00b3
        L_0x00ab:
            com.hansecom.abt.presentation.screens.main.debugMenu.e r1 = new com.hansecom.abt.presentation.screens.main.debugMenu.e
            r1.<init>(r0)
            r13.N(r1)
        L_0x00b3:
            r2 = r1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.M()
            r10 = 0
            r11 = 106(0x6a, float:1.49E-43)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = r13
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.M()
        L_0x00c7:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x00d0
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$2.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
