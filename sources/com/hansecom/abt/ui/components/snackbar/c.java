package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarData;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f38816A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f38817z;

    public /* synthetic */ c(SnackbarData snackbarData, int i2) {
        this.f38817z = snackbarData;
        this.f38816A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtSnackbarKt.f(this.f38817z, this.f38816A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
