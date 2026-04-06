package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36697A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36698B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaCreateCard.State f36699z;

    public /* synthetic */ b(FareMediaCreateCard.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f36699z = state;
        this.f36697A = function1;
        this.f36698B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaCreateCardScreenKt.g(this.f36699z, this.f36697A, this.f36698B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
