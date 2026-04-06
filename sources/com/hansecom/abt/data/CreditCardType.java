package com.hansecom.abt.data;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata
public enum CreditCardType {
    Visa("^4[0-9]*", "^4[0-9]{12,18}$", "brand-visa"),
    MasterCard("^5[0-9]*", "^5[1-5][0-9]{14}$", "brand-mastercard"),
    AmericanExpress("^3[47][0-9]*", "^3[47][0-9]{13}$", "brand-amex"),
    Diners("^3(?:0[0-5]|[68][0-9])[0-9]*", "^3(?:0[0-5]|[68][0-9])[0-9]{11}$", "brand-diners"),
    Discover("^6(?:011|5[0-9]{2})[0-9]*", "^6(?:011|5[0-9]{2})[0-9]{12,18}$", "brand-discover"),
    JCB("^(?:2131|1800|35[0-9]{3})[0-9]*", "^(?:2131|1800|35[0-9]{14,17})$", "brand-jcb");
    
    public static final Companion C = null;

    /* renamed from: A  reason: collision with root package name */
    public final String f33168A;

    /* renamed from: B  reason: collision with root package name */
    public final String f33169B;

    /* renamed from: z  reason: collision with root package name */
    public final String f33170z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreditCardType a(String str) {
            Object obj;
            Intrinsics.i(str, "name");
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (Character.isLetter(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Iterator it = CreditCardType.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.B(((CreditCardType) obj).name(), sb2, true)) {
                    break;
                }
            }
            return (CreditCardType) obj;
        }

        public final CreditCardType b(String str) {
            Object obj;
            Intrinsics.i(str, "cardNumber");
            Iterator it = CreditCardType.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CreditCardType) obj).j().d(str)) {
                    break;
                }
            }
            return (CreditCardType) obj;
        }

        public Companion() {
        }
    }

    static {
        CreditCardType[] d2;
        K = EnumEntriesKt.a(d2);
        C = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    CreditCardType(String str, String str2, String str3) {
        this.f33170z = str;
        this.f33168A = str2;
        this.f33169B = str3;
    }

    public static EnumEntries f() {
        return K;
    }

    public final String h() {
        String str = this.f33169B;
        return "https://secure.networkmerchants.com/shared/images/" + str + ".png";
    }

    public final Regex j() {
        return new Regex(this.f33170z);
    }
}
