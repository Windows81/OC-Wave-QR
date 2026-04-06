package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36933A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36934B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaLinkCard.State f36935z;

    public /* synthetic */ a(FareMediaLinkCard.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f36935z = state;
        this.f36933A = function1;
        this.f36934B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaLinkCardScreenKt.g(this.f36935z, this.f36933A, this.f36934B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
