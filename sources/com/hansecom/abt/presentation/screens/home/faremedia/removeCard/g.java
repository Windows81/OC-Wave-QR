package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37255A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f37256B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaRemoveCardViewModel f37257z;

    public /* synthetic */ g(FareMediaRemoveCardViewModel fareMediaRemoveCardViewModel, Function0 function0, Function0 function02, int i2, int i3) {
        this.f37257z = fareMediaRemoveCardViewModel;
        this.f37255A = function0;
        this.f37256B = function02;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaRemoveCardDialogKt.k(this.f37257z, this.f37255A, this.f37256B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
