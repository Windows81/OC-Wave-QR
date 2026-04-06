package com.hansecom.abt.util;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
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
@DebugMetadata(c = "com.hansecom.abt.util.TodoExtKt$todoToast$1$1$1", f = "TodoExt.kt", l = {}, m = "invokeSuspend")
final class TodoExtKt$todoToast$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AbtSnackbarHostState E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoExtKt$todoToast$1$1$1(AbtSnackbarHostState abtSnackbarHostState, String str, Continuation continuation) {
        super(2, continuation);
        this.E = abtSnackbarHostState;
        this.F = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TodoExtKt$todoToast$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TodoExtKt$todoToast$1$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            AbtSnackbarHostState.e(this.E, this.F, SnackbarType.WARNING, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
