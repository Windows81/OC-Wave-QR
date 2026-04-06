package com.hansecom.abt.presentation.screens.auth.reset;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34617A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f34618B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResetPasswordViewModel f34619z;

    public /* synthetic */ d(ResetPasswordViewModel resetPasswordViewModel, Function0 function0, Function1 function1, int i2, int i3) {
        this.f34619z = resetPasswordViewModel;
        this.f34617A = function0;
        this.f34618B = function1;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ResetPasswordScreenKt.e(this.f34619z, this.f34617A, this.f34618B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
