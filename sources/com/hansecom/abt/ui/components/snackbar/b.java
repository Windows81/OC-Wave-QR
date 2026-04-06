package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f38814A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarVisuals f38815z;

    public /* synthetic */ b(AbtSnackbarVisuals abtSnackbarVisuals, int i2) {
        this.f38815z = abtSnackbarVisuals;
        this.f38814A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtSnackbarKt.g(this.f38815z, this.f38814A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
