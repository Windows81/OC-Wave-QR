package com.hansecom.abt.ui.components.formFields;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata
public final class CreditCarExpiryDateFieldKt {
    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (!(sb2.length() <= 0 || sb2.charAt(0) == '1' || sb2.charAt(0) == '0')) {
            sb2 = "0" + sb2;
        }
        if (sb2.length() < 2) {
            return sb2;
        }
        return StringsKt.n1(sb2, 2) + "/" + StringsKt.n1(StringsKt.i1(sb2, 2), 2);
    }
}
