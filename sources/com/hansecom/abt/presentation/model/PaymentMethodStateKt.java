package com.hansecom.abt.presentation.model;

import com.hansecom.abt.R;
import com.hansecom.abt.data.CreditCardType;
import com.hansecom.abt.data.domainExtensions.FareMediumExtKt;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.PaymentMethod;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class PaymentMethodStateKt {
    public static final PaymentMethodState.CreditCard a(PaymentMethod paymentMethod) {
        CreditCardType creditCardType;
        Intrinsics.i(paymentMethod, "<this>");
        String c2 = paymentMethod.c();
        String str = null;
        if (c2 == null || (creditCardType = CreditCardType.C.a(c2)) == null) {
            String f2 = paymentMethod.f();
            creditCardType = f2 != null ? CreditCardType.C.b(StringsKt.n1(f2, 5)) : null;
        }
        String d2 = paymentMethod.d();
        Intrinsics.f(d2);
        List h1 = StringsKt.h1(d2, 2);
        boolean z2 = false;
        String str2 = (String) h1.get(0);
        String str3 = (String) h1.get(1);
        LocalDate now = LocalDate.now();
        boolean z3 = now.getYear() % 2000 > Integer.parseInt(str3) || (now.getYear() % 2000 == Integer.parseInt(str3) && now.getMonth().getValue() > Integer.parseInt(str2));
        Long e2 = paymentMethod.e();
        Intrinsics.f(e2);
        long longValue = e2.longValue();
        if (creditCardType != null) {
            str = creditCardType.h();
        }
        String str4 = str;
        String g2 = paymentMethod.g();
        String f3 = paymentMethod.f();
        String str5 = str2 + "/" + str3;
        Boolean h2 = paymentMethod.h();
        if (h2 != null) {
            z2 = h2.booleanValue();
        }
        return new PaymentMethodState.CreditCard(longValue, g2, f3, z2, str5, z3, str4);
    }

    public static final PaymentMethodState.FareMedia b(FareMedium fareMedium) {
        Intrinsics.i(fareMedium, "<this>");
        String f2 = fareMedium.f();
        StringValue c2 = FareMediumExtKt.b(fareMedium) ? StringValueKt.c(R.string.e4) : StringValueKt.d(FareMediumExtKt.a(fareMedium));
        boolean b2 = FareMediumExtKt.b(fareMedium);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(fareMedium.c()));
        Boolean h2 = fareMedium.h();
        return new PaymentMethodState.FareMedia(f2, c2, b2, bigDecimal, h2 != null ? h2.booleanValue() : false);
    }
}
