package com.hansecom.abt.presentation.screens.home.more;

import android.content.Context;
import com.hansecom.abt.presentation.screens.home.more.More;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$2$1", f = "MoreScreen.kt", l = {}, m = "invokeSuspend")
public final class MoreScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<More.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Context J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreScreenKt$ScreenImpl$2$1(Function0 function0, Function0 function02, Function2 function2, Function1 function1, Context context, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = function02;
        this.H = function2;
        this.I = function1;
        this.J = context;
    }

    /* renamed from: A */
    public final Object m(More.Effect effect, Continuation continuation) {
        return ((MoreScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MoreScreenKt$ScreenImpl$2$1 moreScreenKt$ScreenImpl$2$1 = new MoreScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, this.I, this.J, continuation);
        moreScreenKt$ScreenImpl$2$1.E = obj;
        return moreScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            More.Effect effect = (More.Effect) this.E;
            if (Intrinsics.d(effect, More.Effect.OpenGuidedTour.f37419a)) {
                this.F.invoke();
            } else if (Intrinsics.d(effect, More.Effect.OpenHelpRequest.f37420a)) {
                this.G.invoke();
            } else if (effect instanceof More.Effect.OpenWebViewUrl) {
                Function2 function2 = this.H;
                More.Effect.OpenWebViewUrl openWebViewUrl = (More.Effect.OpenWebViewUrl) effect;
                String b2 = openWebViewUrl.b();
                StringValue a2 = openWebViewUrl.a();
                function2.m(b2, a2 != null ? StringResourceKt.b(this.J, a2, new Object[0]) : null);
            } else if (effect instanceof More.Effect.OpenBrowserUrl) {
                this.I.invoke(((More.Effect.OpenBrowserUrl) effect).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
