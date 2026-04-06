package w;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavController;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f44345A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f44346B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController f44347z;

    public /* synthetic */ a(NavController navController, boolean z2, String str, Function2 function2, int i2, int i3) {
        this.f44347z = navController;
        this.f44345A = z2;
        this.f44346B = str;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AppFeatureGuardKt.c(this.f44347z, this.f44345A, this.f44346B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
