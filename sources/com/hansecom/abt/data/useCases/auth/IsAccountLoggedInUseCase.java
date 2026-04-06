package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class IsAccountLoggedInUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AuthenticationPreferences f33790a;

    public IsAccountLoggedInUseCase(AuthenticationPreferences authenticationPreferences) {
        Intrinsics.i(authenticationPreferences, "authenticationPreferences");
        this.f33790a = authenticationPreferences;
    }

    public final Flow a() {
        return new IsAccountLoggedInUseCase$getFlow$$inlined$map$1(this.f33790a.f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase$invoke$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.preferences.AuthenticationPreferences r5 = r4.f33790a
            r0.E = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x004c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r5 = 0
            goto L_0x004d
        L_0x004c:
            r5 = r3
        L_0x004d:
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
