package androidx.navigation.compose;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostControllerKt$NavControllerSaver$1 extends Lambda implements Function2<SaverScope, NavHostController, Bundle> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavHostControllerKt$NavControllerSaver$1 f22508z = new NavHostControllerKt$NavControllerSaver$1();

    public NavHostControllerKt$NavControllerSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Bundle m(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.q0();
    }
}
