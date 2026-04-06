package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;

public class CustomTabsSessionToken {

    /* renamed from: a  reason: collision with root package name */
    public final ICustomTabsCallback f1657a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f1658b;

    /* renamed from: c  reason: collision with root package name */
    public final CustomTabsCallback f1659c;

    public static class MockCallback extends ICustomTabsCallback.Stub {
        public void E2(String str, Bundle bundle) {
        }

        public void H1(int i2, int i3, Bundle bundle) {
        }

        public void L2(Bundle bundle) {
        }

        public void P2(int i2, Uri uri, boolean z2, Bundle bundle) {
        }

        public Bundle Q0(String str, Bundle bundle) {
            return null;
        }

        public void a2(String str, Bundle bundle) {
        }

        public IBinder asBinder() {
            return this;
        }

        public void k2(Bundle bundle) {
        }

        public void o2(int i2, Bundle bundle) {
        }

        public void q1(Bundle bundle) {
        }

        public void r0(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
        }

        public void y1(Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f1657a = iCustomTabsCallback;
        this.f1658b = pendingIntent;
        this.f1659c = iCustomTabsCallback == null ? null : new CustomTabsCallback() {
            public void a(String str, Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.a2(str, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public Bundle b(String str, Bundle bundle) {
                try {
                    return CustomTabsSessionToken.this.f1657a.Q0(str, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    return null;
                }
            }

            public void c(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.r0(i2, i3, i4, i5, i6, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void d(int i2, int i3, Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.H1(i2, i3, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void e(Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.L2(bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void f(Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.q1(bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void g(int i2, Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.o2(i2, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void h(String str, Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.E2(str, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void i(int i2, Uri uri, boolean z2, Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.P2(i2, uri, z2, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void j(Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.y1(bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void k(Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.f1657a.k2(bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }
        };
    }

    public IBinder a() {
        ICustomTabsCallback iCustomTabsCallback = this.f1657a;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    public final IBinder b() {
        ICustomTabsCallback iCustomTabsCallback = this.f1657a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public PendingIntent c() {
        return this.f1658b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent c2 = customTabsSessionToken.c();
        PendingIntent pendingIntent = this.f1658b;
        boolean z2 = true;
        boolean z3 = pendingIntent == null;
        if (c2 != null) {
            z2 = false;
        }
        if (z3 != z2) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(c2) : b().equals(customTabsSessionToken.b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f1658b;
        return pendingIntent != null ? pendingIntent.hashCode() : b().hashCode();
    }
}
