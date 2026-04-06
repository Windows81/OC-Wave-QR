package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.y3  reason: case insensitive filesystem */
public final /* synthetic */ class C0292y3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f14488A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f14489B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f14490z;

    public /* synthetic */ C0292y3(CoroutineScope coroutineScope, SheetState sheetState, Function0 function0) {
        this.f14490z = coroutineScope;
        this.f14488A = sheetState;
        this.f14489B = function0;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt.F(this.f14490z, this.f14488A, this.f14489B, ((Float) obj).floatValue());
    }
}
