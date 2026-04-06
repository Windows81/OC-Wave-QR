package com.hansecom.abt.presentation.screens.main.debugMenu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$3", f = "DebugMenuViewModel.kt", l = {59, 60}, m = "invokeSuspend")
public final class DebugMenuViewModel$handle$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DebugMenuViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugMenuViewModel$handle$3(DebugMenuViewModel debugMenuViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = debugMenuViewModel;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DebugMenuViewModel$handle$3) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DebugMenuViewModel$handle$3(this.E, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.D
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.b(r5)
            goto L_0x003b
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            kotlin.ResultKt.b(r5)
            goto L_0x0030
        L_0x001e:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r5 = r4.E
            com.hansecom.abt.data.useCases.LogOutUseCase r5 = r5.f37628l
            r4.D = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L_0x0030
            return r0
        L_0x0030:
            r4.D = r2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.b(r1, r4)
            if (r5 != r0) goto L_0x003b
            return r0
        L_0x003b:
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r5 = r4.E
            android.content.Context r5 = r5.f37625i
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r0 = r4.E
            android.content.Context r0 = r0.f37625i
            java.lang.String r0 = r0.getPackageName()
            android.content.Intent r5 = r5.getLaunchIntentForPackage(r0)
            if (r5 == 0) goto L_0x0066
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r0 = r4.E
            android.content.ComponentName r5 = r5.getComponent()
            android.content.Intent r5 = android.content.Intent.makeRestartActivityTask(r5)
            android.content.Context r0 = r0.f37625i
            r0.startActivity(r5)
        L_0x0066:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            r0 = 0
            r5.exit(r0)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$3.x(java.lang.Object):java.lang.Object");
    }
}
