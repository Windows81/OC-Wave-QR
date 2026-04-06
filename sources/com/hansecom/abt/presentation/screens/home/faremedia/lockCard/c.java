package com.hansecom.abt.presentation.screens.home.faremedia.lockCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCard;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36970A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36971B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaLockCard.State f36972z;

    public /* synthetic */ c(FareMediaLockCard.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2) {
        this.f36972z = state;
        this.f36970A = function1;
        this.f36971B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaLockCardDialogKt.f(this.f36972z, this.f36970A, this.f36971B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
