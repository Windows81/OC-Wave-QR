package com.hansecom.abt.util;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f39038A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f39039z;

    public /* synthetic */ d(FocusRequester focusRequester, int i2) {
        this.f39039z = focusRequester;
        this.f39038A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FocusRequesterExtKt.c(this.f39039z, this.f39038A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
