package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: z  reason: collision with root package name */
    public IUnusedAppRestrictionsBackportService.Stub f19701z;

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$1  reason: invalid class name */
    public class AnonymousClass1 extends IUnusedAppRestrictionsBackportService.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ UnusedAppRestrictionsBackportService f19702l;

        public void J0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (iUnusedAppRestrictionsBackportCallback != null) {
                this.f19702l.a(new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback));
            }
        }
    }

    public abstract void a(UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback);

    public IBinder onBind(Intent intent) {
        return this.f19701z;
    }
}
