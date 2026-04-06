package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccountScreenKt$CloseAccountDialog$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35058A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.State f35059z;

    public AccountScreenKt$CloseAccountDialog$2(Account.State state, Function1 function1) {
        this.f35059z = state;
        this.f35058A = function1;
    }

    public static final Unit f(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Account.Action.ClosePasswordChange(str));
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g(Function1 function1) {
        function1.invoke(Account.Action.ClosePasswordVisibilityToggle.f35018a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r14 = r19
            r1 = r20
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r19.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r19.B()
            goto L_0x00bc
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.account.CloseAccountDialog.<anonymous> (AccountScreen.kt:180)"
            r4 = -751039316(0xffffffffd33c0cac, float:-8.0766645E11)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            com.hansecom.abt.presentation.screens.home.account.Account$State r1 = r0.f35059z
            java.lang.String r1 = r1.d()
            r2 = -747019907(0xffffffffd379617d, float:-1.07108244E12)
            r14.X(r2)
            kotlin.jvm.functions.Function1 r2 = r0.f35058A
            boolean r2 = r14.W(r2)
            kotlin.jvm.functions.Function1 r3 = r0.f35058A
            java.lang.Object r4 = r19.g()
            if (r2 != 0) goto L_0x0048
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0050
        L_0x0048:
            com.hansecom.abt.presentation.screens.home.account.J r4 = new com.hansecom.abt.presentation.screens.home.account.J
            r4.<init>(r3)
            r14.N(r4)
        L_0x0050:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r19.M()
            com.hansecom.abt.presentation.screens.home.account.Account$State r3 = r0.f35059z
            boolean r3 = r3.f()
            r4 = -747015453(0xffffffffd37972e3, float:-1.07137434E12)
            r14.X(r4)
            kotlin.jvm.functions.Function1 r4 = r0.f35058A
            boolean r4 = r14.W(r4)
            kotlin.jvm.functions.Function1 r5 = r0.f35058A
            java.lang.Object r6 = r19.g()
            if (r4 != 0) goto L_0x0078
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0080
        L_0x0078:
            com.hansecom.abt.presentation.screens.home.account.K r6 = new com.hansecom.abt.presentation.screens.home.account.K
            r6.<init>(r5)
            r14.N(r6)
        L_0x0080:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r19.M()
            int r5 = com.hansecom.abt.R.string.f33066s
            com.hansecom.abt.presentation.screens.home.account.Account$State r6 = r0.f35059z
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = r6.e()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 1
            r9 = 0
            r10 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r7, r10, r8, r9)
            java.lang.String r8 = "close_account_password"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r7, r8)
            androidx.compose.ui.text.input.ImeAction$Companion r8 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r9 = r8.b()
            r16 = 0
            r17 = 7808(0x1e80, float:1.0941E-41)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 102236160(0x6180000, float:2.8588023E-35)
            r14 = r19
            com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00bc
            androidx.compose.runtime.ComposerKt.X()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$CloseAccountDialog$2.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
