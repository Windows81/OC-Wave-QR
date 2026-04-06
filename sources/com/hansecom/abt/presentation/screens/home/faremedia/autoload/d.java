package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36272A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36273B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadViewModel f36274z;

    public /* synthetic */ d(AutoloadViewModel autoloadViewModel, Function1 function1, int i2, int i3) {
        this.f36274z = autoloadViewModel;
        this.f36272A = function1;
        this.f36273B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadScreenKt.j(this.f36274z, this.f36272A, this.f36273B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
