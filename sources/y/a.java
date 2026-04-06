package y;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.emptyView.EmptyViewKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Integer f44349A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f44350B;
    public final /* synthetic */ CharSequence C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Integer F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f44351z;

    public /* synthetic */ a(Modifier modifier, Integer num, String str, CharSequence charSequence, String str2, String str3, Integer num2, Function0 function0, boolean z2, int i2, int i3) {
        this.f44351z = modifier;
        this.f44349A = num;
        this.f44350B = str;
        this.C = charSequence;
        this.D = str2;
        this.E = str3;
        this.F = num2;
        this.G = function0;
        this.H = z2;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return EmptyViewKt.c(this.f44351z, this.f44349A, this.f44350B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
