package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36694A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36695B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaCreateCardViewModel f36696z;

    public /* synthetic */ a(FareMediaCreateCardViewModel fareMediaCreateCardViewModel, Function0 function0, int i2, int i3) {
        this.f36696z = fareMediaCreateCardViewModel;
        this.f36694A = function0;
        this.f36695B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaCreateCardScreenKt.e(this.f36696z, this.f36694A, this.f36695B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
