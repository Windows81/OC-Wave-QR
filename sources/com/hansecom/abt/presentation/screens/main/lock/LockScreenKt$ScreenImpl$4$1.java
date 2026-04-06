package com.hansecom.abt.presentation.screens.main.lock;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.main.lock.Lock;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$4$1", f = "LockScreen.kt", l = {}, m = "invokeSuspend")
public final class LockScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<Lock.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ AbtSnackbarHostState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockScreenKt$ScreenImpl$4$1(Function0 function0, AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(Lock.Effect effect, Continuation continuation) {
        return ((LockScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        LockScreenKt$ScreenImpl$4$1 lockScreenKt$ScreenImpl$4$1 = new LockScreenKt$ScreenImpl$4$1(this.F, this.G, continuation);
        lockScreenKt$ScreenImpl$4$1.E = obj;
        return lockScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Lock.Effect effect = (Lock.Effect) this.E;
            if (Intrinsics.d(effect, Lock.Effect.ShowBiometricDialog.f37670a)) {
                this.F.invoke();
            } else if (effect instanceof Lock.Effect.Error) {
                AbtSnackbarHostState.e(this.G, ((Lock.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
