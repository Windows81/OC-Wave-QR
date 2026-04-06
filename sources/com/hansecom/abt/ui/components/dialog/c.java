package com.hansecom.abt.ui.components.dialog;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AbtButtonStyle f38158A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtButtonStyle f38159B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtDialogState f38160z;

    public /* synthetic */ c(AbtDialogState abtDialogState, AbtButtonStyle abtButtonStyle, AbtButtonStyle abtButtonStyle2, Function0 function0, boolean z2, int i2, int i3) {
        this.f38160z = abtDialogState;
        this.f38158A = abtButtonStyle;
        this.f38159B = abtButtonStyle2;
        this.C = function0;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtDialogKt.j(this.f38160z, this.f38158A, this.f38159B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
