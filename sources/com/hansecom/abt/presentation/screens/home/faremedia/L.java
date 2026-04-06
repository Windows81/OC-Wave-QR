package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class L implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36017A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36018B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State.CardProvisioningStatus f36019z;

    public /* synthetic */ L(FareMedia.State.CardProvisioningStatus cardProvisioningStatus, Function0 function0, Function0 function02, int i2) {
        this.f36019z = cardProvisioningStatus;
        this.f36017A = function0;
        this.f36018B = function02;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.g0(this.f36019z, this.f36017A, this.f36018B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
