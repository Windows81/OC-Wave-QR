package com.hansecom.abt.data.config;

import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum RemoteConfig {
    CARD_OPTIONS("card_options_menu", Integer.valueOf(R.raw.f33039e)),
    ACCOUNT("account_menu", Integer.valueOf(R.raw.f33035a)),
    MORE("more_menu", Integer.valueOf(R.raw.f33043i)),
    GUEST("guest_mode", Integer.valueOf(R.raw.f33040f)),
    SIGN_UP("sign_up_configuration", Integer.valueOf(R.raw.f33045k)),
    REGULAR_EXPRESSION("regular_expressions", Integer.valueOf(R.raw.f33044j)),
    GUIDED_TOUR("guided_tour", Integer.valueOf(R.raw.f33041g)),
    LINKS("links", Integer.valueOf(R.raw.f33042h)),
    APP_UPDATE("bouncer_android", Integer.valueOf(R.raw.f33038d)),
    FEATURE_CONFIG("feature_config", (int) null),
    FARE_CATEGORY_COLORS("fare_category_color_mapping", (int) null);
    

    /* renamed from: A  reason: collision with root package name */
    public final Integer f33177A;

    /* renamed from: z  reason: collision with root package name */
    public final String f33178z;

    static {
        RemoteConfig[] d2;
        N = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    RemoteConfig(String str, Integer num) {
        this.f33178z = str;
        this.f33177A = num;
    }

    public static EnumEntries h() {
        return N;
    }

    public final Integer f() {
        return this.f33177A;
    }

    public final String j() {
        return this.f33178z;
    }
}
