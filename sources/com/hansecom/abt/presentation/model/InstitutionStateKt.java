package com.hansecom.abt.presentation.model;

import com.hansecom.mapi.models.Institution;
import com.hansecom.mapi.models.UserAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InstitutionStateKt {
    public static final InstitutionState a(Institution institution) {
        String str;
        Intrinsics.i(institution, "<this>");
        Integer a2 = institution.a();
        Intrinsics.f(a2);
        int intValue = a2.intValue();
        String d2 = institution.d();
        Intrinsics.f(d2);
        String c2 = institution.c();
        String f2 = institution.f();
        UserAddress b2 = institution.b();
        if (b2 != null) {
            StringBuilder sb = new StringBuilder();
            String e2 = b2.e();
            String str2 = "";
            if (e2 == null) {
                e2 = str2;
            }
            sb.append(e2);
            sb.append("\n");
            String f3 = b2.f();
            if (!(f3 == null || f3.length() == 0)) {
                sb.append(b2.f());
                sb.append(", ");
            }
            String a3 = b2.a();
            if (a3 == null) {
                a3 = str2;
            }
            sb.append(a3);
            sb.append(",\n");
            String c3 = b2.c();
            if (c3 == null) {
                c3 = str2;
            }
            sb.append(c3);
            sb.append(" ");
            String g2 = b2.g();
            if (g2 == null) {
                g2 = str2;
            }
            sb.append(g2);
            sb.append(", ");
            String b3 = b2.b();
            if (b3 != null) {
                str2 = b3;
            }
            sb.append(str2);
            str = sb.toString();
        } else {
            str = null;
        }
        return new InstitutionState(intValue, d2, c2, f2, str);
    }
}
