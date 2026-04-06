package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36452A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36453B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardInformation.State f36454z;

    public /* synthetic */ d(CardInformation.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f36454z = state;
        this.f36452A = function1;
        this.f36453B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CardInformationScreenKt.o(this.f36454z, this.f36452A, this.f36453B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
