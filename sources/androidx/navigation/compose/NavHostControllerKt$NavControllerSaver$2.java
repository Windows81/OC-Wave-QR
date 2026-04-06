package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostControllerKt$NavControllerSaver$2 extends Lambda implements Function1<Bundle, NavHostController> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f22509z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$NavControllerSaver$2(Context context) {
        super(1);
        this.f22509z = context;
    }

    /* renamed from: b */
    public final NavHostController invoke(Bundle bundle) {
        NavHostController b2 = NavHostControllerKt.c(this.f22509z);
        b2.o0(bundle);
        return b2;
    }
}
