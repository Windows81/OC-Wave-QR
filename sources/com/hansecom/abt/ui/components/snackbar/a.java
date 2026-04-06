package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38811A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38812B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f38813z;

    public /* synthetic */ a(AbtSnackbarHostState abtSnackbarHostState, Modifier modifier, int i2, int i3) {
        this.f38813z = abtSnackbarHostState;
        this.f38811A = modifier;
        this.f38812B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtSnackbarHostKt.c(this.f38813z, this.f38811A, this.f38812B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
