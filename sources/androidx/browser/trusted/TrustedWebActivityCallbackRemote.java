package androidx.browser.trusted;

import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

public class TrustedWebActivityCallbackRemote {

    /* renamed from: a  reason: collision with root package name */
    public final ITrustedWebActivityCallback f1697a;

    public TrustedWebActivityCallbackRemote(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f1697a = iTrustedWebActivityCallback;
    }

    public static TrustedWebActivityCallbackRemote a(IBinder iBinder) {
        ITrustedWebActivityCallback J = iBinder == null ? null : ITrustedWebActivityCallback.Stub.J(iBinder);
        if (J == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(J);
    }
}
