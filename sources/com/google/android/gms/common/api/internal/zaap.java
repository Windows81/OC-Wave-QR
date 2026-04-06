package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

final class zaap extends zaav {

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f24570A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zaaw f24571B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaaw, ArrayList arrayList) {
        super(zaaw, (zaau) null);
        this.f24571B = zaaw;
        this.f24570A = arrayList;
    }

    public final void a() {
        zaaw zaaw = this.f24571B;
        zaaw.f24577a.f24648y.f24624p = zaaw.x(zaaw);
        ArrayList arrayList = this.f24570A;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zaaw zaaw2 = this.f24571B;
            ((Api.Client) arrayList.get(i2)).e(zaaw2.f24591o, zaaw2.f24577a.f24648y.f24624p);
        }
    }
}
