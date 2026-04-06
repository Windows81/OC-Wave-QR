package com.hansecom.abt.presentation.screens.guest;

import android.content.Context;
import com.hansecom.abt.presentation.screens.guest.Guest;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$4$1", f = "GuestScreen.kt", l = {}, m = "invokeSuspend")
public final class GuestScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<Guest.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ Context K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GuestScreenKt$ScreenImpl$4$1(Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function1 function1, Context context, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = function02;
        this.H = function03;
        this.I = function2;
        this.J = function1;
        this.K = context;
    }

    /* renamed from: A */
    public final Object m(Guest.Effect effect, Continuation continuation) {
        return ((GuestScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        GuestScreenKt$ScreenImpl$4$1 guestScreenKt$ScreenImpl$4$1 = new GuestScreenKt$ScreenImpl$4$1(this.F, this.G, this.H, this.I, this.J, this.K, continuation);
        guestScreenKt$ScreenImpl$4$1.E = obj;
        return guestScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Guest.Effect effect = (Guest.Effect) this.E;
            if (Intrinsics.d(effect, Guest.Effect.OpenGuidedTour.f34690a)) {
                this.F.invoke();
            } else if (Intrinsics.d(effect, Guest.Effect.OpenCheckFareMediaBalance.f34689a)) {
                this.G.invoke();
            } else if (Intrinsics.d(effect, Guest.Effect.OpenHelpRequest.f34691a)) {
                this.H.invoke();
            } else if (effect instanceof Guest.Effect.OpenWebViewUrl) {
                Function2 function2 = this.I;
                Guest.Effect.OpenWebViewUrl openWebViewUrl = (Guest.Effect.OpenWebViewUrl) effect;
                String b2 = openWebViewUrl.b();
                StringValue a2 = openWebViewUrl.a();
                function2.m(b2, a2 != null ? StringResourceKt.b(this.K, a2, new Object[0]) : null);
            } else if (effect instanceof Guest.Effect.OpenBrowserUrl) {
                this.J.invoke(((Guest.Effect.OpenBrowserUrl) effect).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
