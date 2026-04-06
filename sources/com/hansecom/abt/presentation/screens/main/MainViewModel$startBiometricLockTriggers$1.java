package com.hansecom.abt.presentation.screens.main;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.MainViewModel$startBiometricLockTriggers$1", f = "MainViewModel.kt", l = {99}, m = "invokeSuspend")
public final class MainViewModel$startBiometricLockTriggers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Lifecycle E;
    public final /* synthetic */ MainViewModel F;
    public final /* synthetic */ boolean G;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.MainViewModel$startBiometricLockTriggers$1$1", f = "MainViewModel.kt", l = {100, 107, 110, 110}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.main.MainViewModel$startBiometricLockTriggers$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public int E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(mainViewModel, z2, lifecycle, continuation);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x008a A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.E
                java.lang.String r2 = "Activity paused"
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                java.lang.String r8 = "LOCK"
                if (r1 == 0) goto L_0x0038
                if (r1 == r6) goto L_0x0034
                if (r1 == r5) goto L_0x002e
                if (r1 == r4) goto L_0x002a
                if (r1 == r3) goto L_0x0021
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0021:
                java.lang.Object r0 = r9.D
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.b(r10)
                goto L_0x00ab
            L_0x002a:
                kotlin.ResultKt.b(r10)
                goto L_0x008b
            L_0x002e:
                kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0032 }
                goto L_0x0071
            L_0x0032:
                r10 = move-exception
                goto L_0x008e
            L_0x0034:
                kotlin.ResultKt.b(r10)
                goto L_0x004c
            L_0x0038:
                kotlin.ResultKt.b(r10)
                com.hansecom.abt.presentation.screens.main.MainViewModel r10 = r4
                com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase r10 = r10.f37580p
                boolean r1 = r5
                r9.E = r6
                java.lang.Object r10 = r10.a(r1, r9)
                if (r10 != r0) goto L_0x004c
                return r0
            L_0x004c:
                boolean r10 = r5
                if (r10 != 0) goto L_0x0053
                kotlin.Unit r10 = kotlin.Unit.f40552a
                return r10
            L_0x0053:
                timber.log.Timber$Forest r10 = timber.log.Timber.f44337a
                timber.log.Timber$Tree r10 = r10.p(r8)
                java.lang.String r1 = "Activity resumed"
                java.lang.Object[] r6 = new java.lang.Object[r7]
                r10.a(r1, r6)
                com.hansecom.abt.presentation.screens.main.MainViewModel r10 = r4     // Catch:{ all -> 0x0032 }
                com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase r10 = r10.f37579o     // Catch:{ all -> 0x0032 }
                androidx.lifecycle.Lifecycle r1 = r8     // Catch:{ all -> 0x0032 }
                r9.E = r5     // Catch:{ all -> 0x0032 }
                java.lang.Object r10 = r10.c(r1, r9)     // Catch:{ all -> 0x0032 }
                if (r10 != r0) goto L_0x0071
                return r0
            L_0x0071:
                timber.log.Timber$Forest r10 = timber.log.Timber.f44337a
                timber.log.Timber$Tree r10 = r10.p(r8)
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r10.a(r2, r1)
                com.hansecom.abt.presentation.screens.main.MainViewModel r10 = r4
                com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r10 = r10.f37578n
                r9.E = r4
                java.lang.Object r10 = r10.a(r9)
                if (r10 != r0) goto L_0x008b
                return r0
            L_0x008b:
                kotlin.Unit r10 = kotlin.Unit.f40552a
                return r10
            L_0x008e:
                timber.log.Timber$Forest r1 = timber.log.Timber.f44337a
                timber.log.Timber$Tree r1 = r1.p(r8)
                java.lang.Object[] r4 = new java.lang.Object[r7]
                r1.a(r2, r4)
                com.hansecom.abt.presentation.screens.main.MainViewModel r1 = r4
                com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r1 = r1.f37578n
                r9.D = r10
                r9.E = r3
                java.lang.Object r1 = r1.a(r9)
                if (r1 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                r0 = r10
            L_0x00ab:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainViewModel$startBiometricLockTriggers$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainViewModel$startBiometricLockTriggers$1(Lifecycle lifecycle, MainViewModel mainViewModel, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.E = lifecycle;
        this.F = mainViewModel;
        this.G = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$startBiometricLockTriggers$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MainViewModel$startBiometricLockTriggers$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Lifecycle lifecycle = this.E;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final MainViewModel mainViewModel = this.F;
            final boolean z2 = this.G;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, r3, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
