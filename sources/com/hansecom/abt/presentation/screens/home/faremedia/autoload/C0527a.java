package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.autoload.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0527a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f36263A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36264B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f36265z;

    public /* synthetic */ C0527a(String str, PaymentMethodState.CreditCard creditCard, int i2) {
        this.f36265z = str;
        this.f36263A = creditCard;
        this.f36264B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadScreenKt.r(this.f36265z, this.f36263A, this.f36264B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
