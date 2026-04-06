package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class W implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f38348z;

    public /* synthetic */ W(FocusRequester focusRequester) {
        this.f38348z = focusRequester;
    }

    public final Object invoke(Object obj) {
        return SearchTextFieldKt.d(this.f38348z, (KeyboardActionScope) obj);
    }
}
