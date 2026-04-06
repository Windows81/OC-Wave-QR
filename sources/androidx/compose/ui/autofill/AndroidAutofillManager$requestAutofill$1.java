package androidx.compose.ui.autofill;

import androidx.compose.ui.semantics.SemanticsInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidAutofillManager$requestAutofill$1 extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SemanticsInfo f15571A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidAutofillManager f15572z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAutofillManager$requestAutofill$1(AndroidAutofillManager androidAutofillManager, SemanticsInfo semanticsInfo) {
        super(4);
        this.f15572z = androidAutofillManager;
        this.f15571A = semanticsInfo;
    }

    public final void b(int i2, int i3, int i4, int i5) {
        this.f15572z.f15563f.set(i2, i3, i4, i5);
        this.f15572z.f().b(this.f15572z.f15560c, this.f15571A.v(), this.f15572z.f15563f);
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
