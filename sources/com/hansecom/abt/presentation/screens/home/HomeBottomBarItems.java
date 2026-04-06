package com.hansecom.abt.presentation.screens.home;

import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.account.AccountGraph;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaGraph;
import com.hansecom.abt.presentation.screens.home.more.MoreGraph;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public enum HomeBottomBarItems {
    FareMedia(FareMediaGraph.INSTANCE, R.drawable.f33019u, R.string.z6, "bottom_bar_fare_media"),
    TripPlanner(new TripPlannerDestination(false, false, 3, (DefaultConstructorMarker) null), R.drawable.L, R.string.B6, "bottom_bar_fare_media"),
    Account(AccountGraph.INSTANCE, R.drawable.a0, R.string.y6, "bottom_bar_account"),
    More(MoreGraph.INSTANCE, R.drawable.C, R.string.A6, "bottom_bar_more");
    

    /* renamed from: A  reason: collision with root package name */
    public final int f34970A;

    /* renamed from: B  reason: collision with root package name */
    public final int f34971B;
    public final String C;

    /* renamed from: z  reason: collision with root package name */
    public final Object f34972z;

    static {
        HomeBottomBarItems[] d2;
        I = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    HomeBottomBarItems(Object obj, int i2, int i3, String str) {
        this.f34972z = obj;
        this.f34970A = i2;
        this.f34971B = i3;
        this.C = str;
    }

    public final Object f() {
        return this.f34972z;
    }

    public final int h() {
        return this.f34970A;
    }

    public final String j() {
        return this.C;
    }

    public final int k() {
        return this.f34971B;
    }
}
