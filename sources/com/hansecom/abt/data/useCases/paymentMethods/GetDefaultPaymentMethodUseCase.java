package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.util.GooglePayClient;
import com.hansecom.mapi.models.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetDefaultPaymentMethodUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AppPreferences f34042a;

    /* renamed from: b  reason: collision with root package name */
    public final PaymentMethodsRepository f34043b;

    /* renamed from: c  reason: collision with root package name */
    public final GooglePayClient f34044c;

    @Metadata
    public interface Response {

        @Metadata
        public static final class CreditCard implements Response {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethod f34045a;

            public CreditCard(PaymentMethod paymentMethod) {
                Intrinsics.i(paymentMethod, "paymentMethod");
                this.f34045a = paymentMethod;
            }

            public final PaymentMethod a() {
                return this.f34045a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CreditCard) && Intrinsics.d(this.f34045a, ((CreditCard) obj).f34045a);
            }

            public int hashCode() {
                return this.f34045a.hashCode();
            }

            public String toString() {
                PaymentMethod paymentMethod = this.f34045a;
                return "CreditCard(paymentMethod=" + paymentMethod + ")";
            }
        }

        @Metadata
        public static final class GooglePay implements Response {

            /* renamed from: a  reason: collision with root package name */
            public static final GooglePay f34046a = new GooglePay();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GooglePay);
            }

            public int hashCode() {
                return -1574718685;
            }

            public String toString() {
                return "GooglePay";
            }
        }

        @Metadata
        public static final class Undefined implements Response {

            /* renamed from: a  reason: collision with root package name */
            public static final Undefined f34047a = new Undefined();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Undefined);
            }

            public int hashCode() {
                return 207622340;
            }

            public String toString() {
                return "Undefined";
            }
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34048a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.hansecom.abt.data.localDomain.PaymentMethodType[] r0 = com.hansecom.abt.data.localDomain.PaymentMethodType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.data.localDomain.PaymentMethodType r1 = com.hansecom.abt.data.localDomain.PaymentMethodType.CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.data.localDomain.PaymentMethodType r1 = com.hansecom.abt.data.localDomain.PaymentMethodType.GOOGLE_PAY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.data.localDomain.PaymentMethodType r1 = com.hansecom.abt.data.localDomain.PaymentMethodType.CASH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.data.localDomain.PaymentMethodType r1 = com.hansecom.abt.data.localDomain.PaymentMethodType.FARE_MEDIA     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f34048a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.WhenMappings.<clinit>():void");
        }
    }

    public GetDefaultPaymentMethodUseCase(AppPreferences appPreferences, PaymentMethodsRepository paymentMethodsRepository, GooglePayClient googlePayClient) {
        Intrinsics.i(appPreferences, "appPreferences");
        Intrinsics.i(paymentMethodsRepository, "paymentMethodRepository");
        Intrinsics.i(googlePayClient, "googlePayClient");
        this.f34042a = appPreferences;
        this.f34043b = paymentMethodsRepository;
        this.f34044c = googlePayClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1 r0 = (com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1 r0 = new com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1
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
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r5 = r4.f34043b
            r0.E = r3
            java.lang.Object r5 = r5.N(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.g(r5)
            if (r0 == 0) goto L_0x005e
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            java.lang.Throwable r5 = kotlin.Result.e(r5)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r0.c(r5)
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$Undefined r5 = com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.Response.Undefined.f34047a
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x0079
        L_0x005e:
            boolean r0 = kotlin.Result.h(r5)
            if (r0 == 0) goto L_0x0075
            com.hansecom.mapi.models.PaymentMethod r5 = (com.hansecom.mapi.models.PaymentMethod) r5
            if (r5 == 0) goto L_0x006e
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$CreditCard r0 = new com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$CreditCard
            r0.<init>(r5)
            goto L_0x0070
        L_0x006e:
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$Undefined r0 = com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.Response.Undefined.f34047a
        L_0x0070:
            java.lang.Object r5 = kotlin.Result.b(r0)
            goto L_0x0079
        L_0x0075:
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x0079:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$invoke$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0066
            if (r2 == r6) goto L_0x0056
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            kotlin.ResultKt.b(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r11 = r12.j()
            goto L_0x00da
        L_0x003a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0042:
            java.lang.Object r11 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase r11 = (com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase) r11
            kotlin.ResultKt.b(r12)
            goto L_0x00bc
        L_0x004b:
            kotlin.ResultKt.b(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r11 = r12.j()
            goto L_0x00e8
        L_0x0056:
            java.lang.Object r11 = r0.D
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase r2 = (com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase) r2
            kotlin.ResultKt.b(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x007b
        L_0x0066:
            kotlin.ResultKt.b(r12)
            com.hansecom.abt.data.preferences.AppPreferences r12 = r10.f34042a
            r0.C = r10
            r0.D = r11
            r0.G = r6
            java.lang.Object r12 = r12.d(r0)
            if (r12 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r2 = r12
            r12 = r11
            r11 = r10
        L_0x007b:
            com.hansecom.abt.data.localDomain.PaymentMethodType r2 = (com.hansecom.abt.data.localDomain.PaymentMethodType) r2
            int[] r8 = com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.WhenMappings.f34048a
            int r2 = r2.ordinal()
            r2 = r8[r2]
            if (r2 == r6) goto L_0x00db
            if (r2 == r5) goto L_0x00a5
            if (r2 == r4) goto L_0x009c
            if (r2 != r3) goto L_0x0096
            kotlin.Result$Companion r11 = kotlin.Result.f40519A
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$Undefined r11 = com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.Response.Undefined.f34047a
            java.lang.Object r11 = kotlin.Result.b(r11)
            goto L_0x00cc
        L_0x0096:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x009c:
            kotlin.Result$Companion r11 = kotlin.Result.f40519A
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$Undefined r11 = com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.Response.Undefined.f34047a
            java.lang.Object r11 = kotlin.Result.b(r11)
            goto L_0x00cc
        L_0x00a5:
            com.hansecom.abt.data.localDomain.PaymentMethodType r2 = com.hansecom.abt.data.localDomain.PaymentMethodType.GOOGLE_PAY
            boolean r12 = r12.contains(r2)
            if (r12 == 0) goto L_0x00cd
            com.hansecom.abt.util.GooglePayClient r12 = r11.f34044c
            r0.C = r11
            r0.D = r7
            r0.G = r4
            java.lang.Object r12 = r12.d(r0)
            if (r12 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00cd
            kotlin.Result$Companion r11 = kotlin.Result.f40519A
            com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase$Response$GooglePay r11 = com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.Response.GooglePay.f34046a
            java.lang.Object r11 = kotlin.Result.b(r11)
        L_0x00cc:
            return r11
        L_0x00cd:
            r0.C = r7
            r0.D = r7
            r0.G = r3
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L_0x00da
            return r1
        L_0x00da:
            return r11
        L_0x00db:
            r0.C = r7
            r0.D = r7
            r0.G = r5
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
