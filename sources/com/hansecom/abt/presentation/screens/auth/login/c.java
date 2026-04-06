package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34315A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34316B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.State f34317z;

    public /* synthetic */ c(Login.State state, Function0 function0, Function0 function02, int i2) {
        this.f34317z = state;
        this.f34315A = function0;
        this.f34316B = function02;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return LoginScreenKt.n(this.f34317z, this.f34315A, this.f34316B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
