package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarData;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38818A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Painter f38819B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f38820z;

    public /* synthetic */ d(SnackbarData snackbarData, Modifier modifier, Painter painter, long j2, long j3, int i2, int i3) {
        this.f38820z = snackbarData;
        this.f38818A = modifier;
        this.f38819B = painter;
        this.C = j2;
        this.D = j3;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtSnackbarKt.i(this.f38820z, this.f38818A, this.f38819B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
