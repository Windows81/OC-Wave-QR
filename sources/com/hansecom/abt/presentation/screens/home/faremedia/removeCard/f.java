package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37252A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37253B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaRemoveCard.State f37254z;

    public /* synthetic */ f(FareMediaRemoveCard.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2) {
        this.f37254z = state;
        this.f37252A = function1;
        this.f37253B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaRemoveCardDialogKt.h(this.f37254z, this.f37252A, this.f37253B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
