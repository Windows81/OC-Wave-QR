package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$navInflater$2 extends Lambda implements Function0<NavInflater> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController f22255z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$navInflater$2(NavController navController) {
        super(0);
        this.f22255z = navController;
    }

    /* renamed from: b */
    public final NavInflater invoke() {
        NavInflater h2 = this.f22255z.f22209c;
        return h2 == null ? new NavInflater(this.f22255z.F(), this.f22255z.f22230x) : h2;
    }
}
