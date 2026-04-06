package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37014A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37015B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPassesViewModel f37016z;

    public /* synthetic */ a(FareMediaPassesViewModel fareMediaPassesViewModel, Function0 function0, int i2, int i3) {
        this.f37016z = fareMediaPassesViewModel;
        this.f37014A = function0;
        this.f37015B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaPassesScreenKt.e(this.f37016z, this.f37014A, this.f37015B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
