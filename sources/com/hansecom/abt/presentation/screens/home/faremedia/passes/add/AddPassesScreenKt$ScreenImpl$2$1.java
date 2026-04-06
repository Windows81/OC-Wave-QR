package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$2$1", f = "AddPassesScreen.kt", l = {}, m = "invokeSuspend")
public final class AddPassesScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<AddPasses.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPassesScreenKt$ScreenImpl$2$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
    }

    /* renamed from: A */
    public final Object m(AddPasses.Effect effect, Continuation continuation) {
        return ((AddPassesScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AddPassesScreenKt$ScreenImpl$2$1 addPassesScreenKt$ScreenImpl$2$1 = new AddPassesScreenKt$ScreenImpl$2$1(this.F, continuation);
        addPassesScreenKt$ScreenImpl$2$1.E = obj;
        return addPassesScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            AddPasses.Effect effect = (AddPasses.Effect) this.E;
            if (effect instanceof AddPasses.Effect.AddPassEffect) {
                AddPasses.Effect.AddPassEffect addPassEffect = (AddPasses.Effect.AddPassEffect) effect;
                this.F.m(Boxing.c(addPassEffect.b()), addPassEffect.a());
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
