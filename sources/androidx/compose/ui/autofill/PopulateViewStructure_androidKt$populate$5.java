package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PopulateViewStructure_androidKt$populate$5 extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ViewStructure f15628A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutofillApi26Helper f15629z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopulateViewStructure_androidKt$populate$5(AutofillApi26Helper autofillApi26Helper, ViewStructure viewStructure) {
        super(4);
        this.f15629z = autofillApi26Helper;
        this.f15628A = viewStructure;
    }

    public final void b(int i2, int i3, int i4, int i5) {
        this.f15629z.r(this.f15628A, i2, i3, 0, 0, i4 - i2, i5 - i3);
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
