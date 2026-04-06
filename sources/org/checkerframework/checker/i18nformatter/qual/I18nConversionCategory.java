package org.checkerframework.checker.i18nformatter.qual;

import java.util.Date;
import java.util.StringJoiner;

public enum I18nConversionCategory {
    UNUSED((String) null, (int) null),
    GENERAL((String) null, (int) null),
    DATE(new Class[]{Date.class, r4}, new String[]{"date", "time"}),
    NUMBER(new Class[]{r4}, new String[]{"number", "choice"});
    
    public static I18nConversionCategory[] F;

    /* renamed from: A  reason: collision with root package name */
    public final String[] f44075A;

    /* renamed from: z  reason: collision with root package name */
    public final Class[] f44076z;

    static {
        I18nConversionCategory i18nConversionCategory;
        I18nConversionCategory i18nConversionCategory2;
        F = new I18nConversionCategory[]{i18nConversionCategory, i18nConversionCategory2};
    }

    /* access modifiers changed from: public */
    I18nConversionCategory(Class[] clsArr, String[] strArr) {
        this.f44076z = clsArr;
        this.f44075A = strArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(name());
        if (this.f44076z == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class canonicalName : this.f44076z) {
                stringJoiner.add(canonicalName.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
