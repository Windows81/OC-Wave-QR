package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f37637A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DebugMenuViewModel f37638B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37639z;

    public /* synthetic */ a(Function0 function0, Modifier modifier, DebugMenuViewModel debugMenuViewModel, int i2, int i3) {
        this.f37639z = function0;
        this.f37637A = modifier;
        this.f37638B = debugMenuViewModel;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DebugMenuDialogKt.f(this.f37639z, this.f37637A, this.f37638B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
