package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.navigation.ActivityNavigator;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

@Metadata
@NavDestinationDsl
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {

    /* renamed from: i  reason: collision with root package name */
    public Context f22162i;

    /* renamed from: j  reason: collision with root package name */
    public String f22163j;

    /* renamed from: k  reason: collision with root package name */
    public KClass f22164k;

    /* renamed from: l  reason: collision with root package name */
    public String f22165l;

    /* renamed from: m  reason: collision with root package name */
    public Uri f22166m;

    /* renamed from: n  reason: collision with root package name */
    public String f22167n;

    /* renamed from: f */
    public ActivityNavigator.Destination a() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.a();
        destination.W(this.f22163j);
        KClass kClass = this.f22164k;
        if (kClass != null) {
            destination.S(new ComponentName(this.f22162i, JvmClassMappingKt.a(kClass)));
        }
        destination.R(this.f22165l);
        destination.U(this.f22166m);
        destination.V(this.f22167n);
        return destination;
    }
}
