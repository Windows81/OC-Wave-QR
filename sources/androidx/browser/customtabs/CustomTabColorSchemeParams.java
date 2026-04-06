package androidx.browser.customtabs;

import android.os.Bundle;

public final class CustomTabColorSchemeParams {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1596a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1597b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1598c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1599d;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Integer f1600a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f1601b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f1602c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f1603d;

        public CustomTabColorSchemeParams a() {
            return new CustomTabColorSchemeParams(this.f1600a, this.f1601b, this.f1602c, this.f1603d);
        }
    }

    public CustomTabColorSchemeParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1596a = num;
        this.f1597b = num2;
        this.f1598c = num3;
        this.f1599d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1596a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1597b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1598c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1599d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
