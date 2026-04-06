package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zal;
import java.util.ArrayList;
import java.util.Map;

final class zaao extends zaav {

    /* renamed from: A  reason: collision with root package name */
    public final Map f24568A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zaaw f24569B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaaw, Map map) {
        super(zaaw, (zaau) null);
        this.f24569B = zaaw;
        this.f24568A = map;
    }

    public final void a() {
        zal zal = new zal(this.f24569B.f24580d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f24568A.keySet()) {
            if (!client.m() || ((zaal) this.f24568A.get(client)).f24564c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i2 = 0;
        int i3 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i3 = zal.b(this.f24569B.f24579c, (Api.Client) arrayList.get(i2));
                i2++;
                if (i3 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i3 = zal.b(this.f24569B.f24579c, (Api.Client) arrayList2.get(i2));
                i2++;
                if (i3 == 0) {
                    break;
                }
            }
        }
        if (i3 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i3, (PendingIntent) null);
            zaaw zaaw = this.f24569B;
            zaaw.f24577a.l(new zaam(this, zaaw, connectionResult));
            return;
        }
        zaaw zaaw2 = this.f24569B;
        if (zaaw2.f24589m && zaaw2.f24587k != null) {
            zaaw2.f24587k.u();
        }
        for (Api.Client client2 : this.f24568A.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.f24568A.get(client2);
            if (!client2.m() || zal.b(this.f24569B.f24579c, client2) == 0) {
                client2.i(connectionProgressReportCallbacks);
            } else {
                zaaw zaaw3 = this.f24569B;
                zaaw3.f24577a.l(new zaan(this, zaaw3, connectionProgressReportCallbacks));
            }
        }
    }
}
