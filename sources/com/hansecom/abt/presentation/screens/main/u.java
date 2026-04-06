package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.main.Main;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class u implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Main.State f37706A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37707B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f37708z;

    public /* synthetic */ u(AbtSnackbarHostState abtSnackbarHostState, Main.State state, int i2) {
        this.f37708z = abtSnackbarHostState;
        this.f37706A = state;
        this.f37707B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return MainScreenKt.i(this.f37708z, this.f37706A, this.f37707B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
