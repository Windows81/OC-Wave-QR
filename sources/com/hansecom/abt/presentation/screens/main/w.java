package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.main.Main;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class w implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Main.State f37717A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f37718B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37719z;

    public /* synthetic */ w(Function1 function1, Main.State state, AbtSnackbarHostState abtSnackbarHostState, int i2) {
        this.f37719z = function1;
        this.f37717A = state;
        this.f37718B = abtSnackbarHostState;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return MainScreenKt.r(this.f37719z, this.f37717A, this.f37718B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
