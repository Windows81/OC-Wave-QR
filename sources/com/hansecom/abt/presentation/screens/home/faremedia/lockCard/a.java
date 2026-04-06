package com.hansecom.abt.presentation.screens.home.faremedia.lockCard;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36966A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36967B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaLockCardViewModel f36968z;

    public /* synthetic */ a(FareMediaLockCardViewModel fareMediaLockCardViewModel, Function0 function0, Function0 function02, int i2, int i3) {
        this.f36968z = fareMediaLockCardViewModel;
        this.f36966A = function0;
        this.f36967B = function02;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaLockCardDialogKt.i(this.f36968z, this.f36966A, this.f36967B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
