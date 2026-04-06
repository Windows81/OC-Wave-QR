package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0530c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36343A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36344B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetupViewModel f36345z;

    public /* synthetic */ C0530c(AutoloadSetupViewModel autoloadSetupViewModel, Function0 function0, int i2, int i3) {
        this.f36345z = autoloadSetupViewModel;
        this.f36343A = function0;
        this.f36344B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadSetupScreenKt.f(this.f36345z, this.f36343A, this.f36344B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
