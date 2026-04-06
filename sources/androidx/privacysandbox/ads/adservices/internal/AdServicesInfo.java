package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;

@Metadata
public final class AdServicesInfo {

    /* renamed from: a  reason: collision with root package name */
    public static final AdServicesInfo f22710a = new AdServicesInfo();

    @Metadata
    public static final class Extensions30Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Extensions30Impl f22711a = new Extensions30Impl();

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Extensions30Impl.f22711a.a();
        }
        return 0;
    }
}
