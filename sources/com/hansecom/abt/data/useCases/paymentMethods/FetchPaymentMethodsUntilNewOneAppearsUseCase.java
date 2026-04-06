package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata
public final class FetchPaymentMethodsUntilNewOneAppearsUseCase {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f34034b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f34035c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final PaymentMethodsRepository f34036a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public FetchPaymentMethodsUntilNewOneAppearsUseCase(PaymentMethodsRepository paymentMethodsRepository) {
        Intrinsics.i(paymentMethodsRepository, "paymentMethodsRepository");
        this.f34036a = paymentMethodsRepository;
    }

    public final void b() {
        Job unused = BuildersKt__Builders_commonKt.d(GlobalScope.f41412z, (CoroutineContext) null, (CoroutineStart) null, new FetchPaymentMethodsUntilNewOneAppearsUseCase$invoke$1(this, (Continuation) null), 3, (Object) null);
    }
}
