package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class Q3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f10643A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f10644B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ CoroutineScope F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10645z;

    public /* synthetic */ Q3(boolean z2, SheetState sheetState, String str, String str2, String str3, Function0 function0, CoroutineScope coroutineScope) {
        this.f10645z = z2;
        this.f10643A = sheetState;
        this.f10644B = str;
        this.C = str2;
        this.D = str3;
        this.E = function0;
        this.F = coroutineScope;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.k(this.f10645z, this.f10643A, this.f10644B, this.C, this.D, this.E, this.F, (SemanticsPropertyReceiver) obj);
    }
}
