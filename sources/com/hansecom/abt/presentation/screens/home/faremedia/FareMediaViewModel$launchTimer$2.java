package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$launchTimer$2", f = "FareMediaViewModel.kt", l = {368}, m = "invokeSuspend")
public final class FareMediaViewModel$launchTimer$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ int E;
    public final /* synthetic */ FareMediaViewModel F;
    public final /* synthetic */ LocalDateTime G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaViewModel$launchTimer$2(FareMediaViewModel fareMediaViewModel, LocalDateTime localDateTime, Continuation continuation) {
        super(2, continuation);
        this.F = fareMediaViewModel;
        this.G = localDateTime;
    }

    public static final FareMedia.State C(LocalDateTime localDateTime, FareMedia.State state) {
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, (FareMedia.State.DialogType) null, false, ChronoUnit.SECONDS.between(localDateTime, LocalDateTime.now()), false, (String) null, false, 15359, (Object) null);
    }

    public final Object B(int i2, Continuation continuation) {
        return ((FareMediaViewModel$launchTimer$2) s(Integer.valueOf(i2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return B(((Number) obj).intValue(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaViewModel$launchTimer$2 fareMediaViewModel$launchTimer$2 = new FareMediaViewModel$launchTimer$2(this.F, this.G, continuation);
        fareMediaViewModel$launchTimer$2.E = ((Number) obj).intValue();
        return fareMediaViewModel$launchTimer$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            long s2 = DurationKt.s(this.E, DurationUnit.SECONDS);
            this.D = 1;
            if (DelayKt.c(s2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.F.r(new L0(this.G));
        return Unit.f40552a;
    }
}
