package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class U implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11690A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f11691B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ CoroutineScope E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f11692z;

    public /* synthetic */ U(SheetState sheetState, boolean z2, String str, String str2, String str3, CoroutineScope coroutineScope) {
        this.f11692z = sheetState;
        this.f11690A = z2;
        this.f11691B = str;
        this.C = str2;
        this.D = str3;
        this.E = coroutineScope;
    }

    public final Object invoke(Object obj) {
        return BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.k(this.f11692z, this.f11690A, this.f11691B, this.C, this.D, this.E, (SemanticsPropertyReceiver) obj);
    }
}
