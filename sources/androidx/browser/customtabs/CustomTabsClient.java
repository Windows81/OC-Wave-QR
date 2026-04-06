package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

public class CustomTabsClient {

    /* renamed from: a  reason: collision with root package name */
    public final ICustomTabsService f1604a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f1605b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1606c;

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$1  reason: invalid class name */
    class AnonymousClass1 extends CustomTabsServiceConnection {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f1607b;

        public final void a(ComponentName componentName, CustomTabsClient customTabsClient) {
            customTabsClient.a(0);
            this.f1607b.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$2  reason: invalid class name */
    class AnonymousClass2 extends ICustomTabsCallback.Stub {

        /* renamed from: l  reason: collision with root package name */
        public Handler f1608l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ CustomTabsCallback f1609m;

        public void E2(final String str, final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.h(str, bundle);
                    }
                });
            }
        }

        public void H1(final int i2, final int i3, final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.d(i2, i3, bundle);
                    }
                });
            }
        }

        public void L2(final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.e(bundle);
                    }
                });
            }
        }

        public void P2(int i2, Uri uri, boolean z2, Bundle bundle) {
            if (this.f1609m != null) {
                final int i3 = i2;
                final Uri uri2 = uri;
                final boolean z3 = z2;
                final Bundle bundle2 = bundle;
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.i(i3, uri2, z3, bundle2);
                    }
                });
            }
        }

        public Bundle Q0(String str, Bundle bundle) {
            CustomTabsCallback customTabsCallback = this.f1609m;
            if (customTabsCallback == null) {
                return null;
            }
            return customTabsCallback.b(str, bundle);
        }

        public void a2(final String str, final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.a(str, bundle);
                    }
                });
            }
        }

        public void k2(final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.k(bundle);
                    }
                });
            }
        }

        public void o2(final int i2, final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.g(i2, bundle);
                    }
                });
            }
        }

        public void q1(final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.f(bundle);
                    }
                });
            }
        }

        public void r0(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
            if (this.f1609m != null) {
                final int i7 = i2;
                final int i8 = i3;
                final int i9 = i4;
                final int i10 = i5;
                final int i11 = i6;
                final Bundle bundle2 = bundle;
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.c(i7, i8, i9, i10, i11, bundle2);
                    }
                });
            }
        }

        public void y1(final Bundle bundle) {
            if (this.f1609m != null) {
                this.f1608l.post(new Runnable() {
                    public void run() {
                        AnonymousClass2.this.f1609m.j(bundle);
                    }
                });
            }
        }
    }

    public CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f1604a = iCustomTabsService;
        this.f1605b = componentName;
        this.f1606c = context;
    }

    public boolean a(long j2) {
        try {
            return this.f1604a.i1(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
