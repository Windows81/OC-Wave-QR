package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;

public final /* synthetic */ class a implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CustomTabsService.AnonymousClass1 f1667a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CustomTabsSessionToken f1668b;

    public /* synthetic */ a(CustomTabsService.AnonymousClass1 r1, CustomTabsSessionToken customTabsSessionToken) {
        this.f1667a = r1;
        this.f1668b = customTabsSessionToken;
    }

    public final void binderDied() {
        this.f1667a.W2(this.f1668b);
    }
}
