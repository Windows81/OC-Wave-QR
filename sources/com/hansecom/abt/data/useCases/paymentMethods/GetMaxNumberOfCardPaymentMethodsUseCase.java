package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetMaxNumberOfCardPaymentMethodsUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final EnvironmentConfigurationRepository f34052a;

    public GetMaxNumberOfCardPaymentMethodsUseCase(EnvironmentConfigurationRepository environmentConfigurationRepository) {
        Intrinsics.i(environmentConfigurationRepository, "environmentConfigurationRepository");
        this.f34052a = environmentConfigurationRepository;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r5 = r5.a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository r5 = r4.f34052a
            r0.E = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.h(r5)
            if (r0 == 0) goto L_0x0063
            com.hansecom.mapi.models.EnvironmentConfiguration r5 = (com.hansecom.mapi.models.EnvironmentConfiguration) r5
            com.hansecom.mapi.models.PaymentMethodConfiguration r5 = r5.b()
            if (r5 == 0) goto L_0x005e
            java.lang.Integer r5 = r5.a()
            if (r5 == 0) goto L_0x005e
            int r5 = r5.intValue()
            goto L_0x005f
        L_0x005e:
            r5 = 3
        L_0x005f:
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.c(r5)
        L_0x0063:
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
