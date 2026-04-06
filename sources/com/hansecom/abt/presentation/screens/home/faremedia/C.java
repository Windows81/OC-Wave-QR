package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35885A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35886B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State.CardItem.Card f35887z;

    public /* synthetic */ C(FareMedia.State.CardItem.Card card, Function1 function1, Function1 function12, int i2) {
        this.f35887z = card;
        this.f35885A = function1;
        this.f35886B = function12;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.k0(this.f35887z, this.f35885A, this.f35886B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
