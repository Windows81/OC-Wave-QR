package androidx.compose.ui.autofill;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidAutofillManager$onSemanticsChanged$1 extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f15569A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidAutofillManager f15570z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAutofillManager$onSemanticsChanged$1(AndroidAutofillManager androidAutofillManager, int i2) {
        super(4);
        this.f15570z = androidAutofillManager;
        this.f15569A = i2;
    }

    public final void b(int i2, int i3, int i4, int i5) {
        this.f15570z.f().e(this.f15570z.f15560c, this.f15569A, new Rect(i2, i3, i4, i5));
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
