package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37387A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f37388B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaUnlockCardViewModel f37389z;

    public /* synthetic */ c(FareMediaUnlockCardViewModel fareMediaUnlockCardViewModel, Function0 function0, Function0 function02, int i2, int i3) {
        this.f37389z = fareMediaUnlockCardViewModel;
        this.f37387A = function0;
        this.f37388B = function02;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaUnlockCardDialogKt.i(this.f37389z, this.f37387A, this.f37388B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
