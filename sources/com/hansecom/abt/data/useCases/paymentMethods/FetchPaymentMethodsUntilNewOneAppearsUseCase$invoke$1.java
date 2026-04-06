package com.hansecom.abt.data.useCases.paymentMethods;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1", f = "FetchPaymentMethodsUntilNewOneAppearsUseCase.kt", l = {14, 15, 16, 18, 23, 24}, m = "invokeSuspend")
public final class FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public int E;
    public int F;
    public final /* synthetic */ FetchPaymentMethodsUntilNewOneAppearsUseCase G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1(FetchPaymentMethodsUntilNewOneAppearsUseCase fetchPaymentMethodsUntilNewOneAppearsUseCase, Continuation continuation) {
        super(2, continuation);
        this.G = fetchPaymentMethodsUntilNewOneAppearsUseCase;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1(this.G, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        kotlin.ResultKt.b(r8);
        r8 = ((java.util.List) r8).size();
        r1 = r7.G.f34036a;
        r7.D = r8;
        r7.F = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
        if (r1.B(r7) != r0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        r7.D = r1;
        r7.F = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        if (kotlinx.coroutines.DelayKt.b(500, r7) != r0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        r4 = r1;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r1 >= 4) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r5 = r7.G.f34036a;
        r7.D = r4;
        r7.E = r1;
        r7.F = 4;
        r8 = r5.i(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r8 != r0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        kotlin.ResultKt.b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (r4 == ((java.util.List) r8).size()) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r1 >= 3) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r8 = r7.G.f34036a;
        r7.D = r4;
        r7.E = r1;
        r7.F = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        if (r8.B(r7) != r0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        r7.D = r4;
        r7.E = r1;
        r7.F = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        if (kotlinx.coroutines.DelayKt.b(1500, r7) != r0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d2, code lost:
        return kotlin.Unit.f40552a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.F
            r2 = 3
            r3 = 1
            switch(r1) {
                case 0: goto L_0x0049;
                case 1: goto L_0x003f;
                case 2: goto L_0x0039;
                case 3: goto L_0x0033;
                case 4: goto L_0x0025;
                case 5: goto L_0x001c;
                case 6: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0013:
            int r1 = r7.E
            int r4 = r7.D
            kotlin.ResultKt.b(r8)
            goto L_0x00ce
        L_0x001c:
            int r1 = r7.E
            int r4 = r7.D
            kotlin.ResultKt.b(r8)
            goto L_0x00be
        L_0x0025:
            int r1 = r7.E
            int r4 = r7.D
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            goto L_0x009c
        L_0x0033:
            int r1 = r7.D
            kotlin.ResultKt.b(r8)
            goto L_0x0084
        L_0x0039:
            int r1 = r7.D
            kotlin.ResultKt.b(r8)
            goto L_0x0077
        L_0x003f:
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            goto L_0x005b
        L_0x0049:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase r8 = r7.G
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r8 = r8.f34036a
            r7.F = r3
            java.lang.Object r8 = r8.i(r7)
            if (r8 != r0) goto L_0x005b
            return r0
        L_0x005b:
            kotlin.ResultKt.b(r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase r1 = r7.G
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r1 = r1.f34036a
            r7.D = r8
            r4 = 2
            r7.F = r4
            java.lang.Object r1 = r1.B(r7)
            if (r1 != r0) goto L_0x0076
            return r0
        L_0x0076:
            r1 = r8
        L_0x0077:
            r7.D = r1
            r7.F = r2
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r4, r7)
            if (r8 != r0) goto L_0x0084
            return r0
        L_0x0084:
            r4 = r1
            r1 = r3
        L_0x0086:
            r8 = 4
            if (r1 >= r8) goto L_0x00d0
            com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase r5 = r7.G
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r5 = r5.f34036a
            r7.D = r4
            r7.E = r1
            r7.F = r8
            java.lang.Object r8 = r5.i(r7)
            if (r8 != r0) goto L_0x009c
            return r0
        L_0x009c:
            kotlin.ResultKt.b(r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            if (r4 == r8) goto L_0x00a8
            goto L_0x00d0
        L_0x00a8:
            if (r1 >= r2) goto L_0x00ce
            com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase r8 = r7.G
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r8 = r8.f34036a
            r7.D = r4
            r7.E = r1
            r5 = 5
            r7.F = r5
            java.lang.Object r8 = r8.B(r7)
            if (r8 != r0) goto L_0x00be
            return r0
        L_0x00be:
            r7.D = r4
            r7.E = r1
            r8 = 6
            r7.F = r8
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r5, r7)
            if (r8 != r0) goto L_0x00ce
            return r0
        L_0x00ce:
            int r1 = r1 + r3
            goto L_0x0086
        L_0x00d0:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1.x(java.lang.Object):java.lang.Object");
    }
}
