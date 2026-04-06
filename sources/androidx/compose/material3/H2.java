package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class H2 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f10085A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f10086B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f10087z;

    public /* synthetic */ H2(Function0 function0, String str, SoftwareKeyboardController softwareKeyboardController) {
        this.f10087z = function0;
        this.f10085A = str;
        this.f10086B = softwareKeyboardController;
    }

    public final Object invoke() {
        return Boolean.valueOf(ExposedDropdownMenuKt.D(this.f10087z, this.f10085A, this.f10086B));
    }
}
