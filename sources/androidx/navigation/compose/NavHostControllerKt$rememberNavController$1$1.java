package androidx.navigation.compose;

import android.content.Context;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostControllerKt$rememberNavController$1$1 extends Lambda implements Function0<NavHostController> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f22510z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$rememberNavController$1$1(Context context) {
        super(0);
        this.f22510z = context;
    }

    /* renamed from: b */
    public final NavHostController invoke() {
        return NavHostControllerKt.c(this.f22510z);
    }
}
