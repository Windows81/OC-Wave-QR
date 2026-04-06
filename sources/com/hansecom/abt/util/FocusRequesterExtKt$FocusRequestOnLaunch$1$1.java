package com.hansecom.abt.util;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.util.FocusRequesterExtKt$FocusRequestOnLaunch$1$1", f = "FocusRequesterExt.kt", l = {}, m = "invokeSuspend")
public final class FocusRequesterExtKt$FocusRequestOnLaunch$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FocusRequester E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusRequesterExtKt$FocusRequestOnLaunch$1$1(FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.E = focusRequester;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FocusRequesterExtKt$FocusRequestOnLaunch$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FocusRequesterExtKt$FocusRequestOnLaunch$1$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FocusRequester.i(this.E, 0, 1, (Object) null);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
