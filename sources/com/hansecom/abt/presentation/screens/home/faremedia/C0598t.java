package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.t  reason: case insensitive filesystem */
public final /* synthetic */ class C0598t implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37261A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State.CardItem.Card f37262B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f37263z;

    public /* synthetic */ C0598t(FareMedia.State state, Function1 function1, FareMedia.State.CardItem.Card card, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i2) {
        this.f37263z = state;
        this.f37261A = function1;
        this.f37262B = card;
        this.C = function12;
        this.D = function13;
        this.E = function14;
        this.F = function0;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.P(this.f37263z, this.f37261A, this.f37262B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
