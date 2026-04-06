package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class S6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f10760A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10761B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TabRowDefaults f10762z;

    public /* synthetic */ S6(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3) {
        this.f10762z = tabRowDefaults;
        this.f10760A = modifier;
        this.f10761B = f2;
        this.C = j2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TabRowDefaults.f(this.f10762z, this.f10760A, this.f10761B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
