package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCard;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37384A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37385B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaUnlockCard.State f37386z;

    public /* synthetic */ b(FareMediaUnlockCard.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2) {
        this.f37386z = state;
        this.f37384A = function1;
        this.f37385B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaUnlockCardDialogKt.f(this.f37386z, this.f37384A, this.f37385B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
