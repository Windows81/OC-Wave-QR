package kotlin.text;

import java.util.List;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f41196A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f41197z;

    public /* synthetic */ f(List list, boolean z2) {
        this.f41197z = list;
        this.f41196A = z2;
    }

    public final Object m(Object obj, Object obj2) {
        return StringsKt__StringsKt.B0(this.f41197z, this.f41196A, (CharSequence) obj, ((Integer) obj2).intValue());
    }
}
