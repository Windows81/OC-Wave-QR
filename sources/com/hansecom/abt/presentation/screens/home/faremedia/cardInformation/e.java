package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36455A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36456B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardInformationViewModel f36457z;

    public /* synthetic */ e(CardInformationViewModel cardInformationViewModel, Function0 function0, int i2, int i3) {
        this.f36457z = cardInformationViewModel;
        this.f36455A = function0;
        this.f36456B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CardInformationScreenKt.h(this.f36457z, this.f36455A, this.f36456B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
