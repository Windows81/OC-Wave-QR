package com.hansecom.abt.presentation.screens.main.lock;

import com.hansecom.abt.presentation.screens.main.lock.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class LockScreenKt$LockScreen$1$1 extends FunctionReferenceImpl implements Function1<Lock.Action, Unit> {
    public LockScreenKt$LockScreen$1$1(Object obj) {
        super(1, obj, LockViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Lock.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Lock.Action action) {
        Intrinsics.i(action, "p0");
        ((LockViewModel) this.f40885A).k(action);
    }
}
