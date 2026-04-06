package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusManager;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class m implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34327A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusManager f34328z;

    public /* synthetic */ m(FocusManager focusManager, Function1 function1) {
        this.f34328z = focusManager;
        this.f34327A = function1;
    }

    public final Object invoke(Object obj) {
        return LoginScreenKt$ScreenImpl$9.k(this.f34328z, this.f34327A, (KeyboardActionScope) obj);
    }
}
