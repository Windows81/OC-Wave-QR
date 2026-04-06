package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class G2 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10073A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f10074B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ SoftwareKeyboardController F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f10075z;

    public /* synthetic */ G2(String str, boolean z2, String str2, String str3, String str4, Function0 function0, SoftwareKeyboardController softwareKeyboardController) {
        this.f10075z = str;
        this.f10073A = z2;
        this.f10074B = str2;
        this.C = str3;
        this.D = str4;
        this.E = function0;
        this.F = softwareKeyboardController;
    }

    public final Object invoke(Object obj) {
        return ExposedDropdownMenuKt.C(this.f10075z, this.f10073A, this.f10074B, this.C, this.D, this.E, this.F, (SemanticsPropertyReceiver) obj);
    }
}
