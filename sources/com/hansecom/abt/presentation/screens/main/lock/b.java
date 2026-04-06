package com.hansecom.abt.presentation.screens.main.lock;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.main.lock.Lock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37681A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37682B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lock.State f37683z;

    public /* synthetic */ b(Lock.State state, Function1 function1, Flow flow, int i2, int i3) {
        this.f37683z = state;
        this.f37681A = function1;
        this.f37682B = flow;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return LockScreenKt.l(this.f37683z, this.f37681A, this.f37682B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
