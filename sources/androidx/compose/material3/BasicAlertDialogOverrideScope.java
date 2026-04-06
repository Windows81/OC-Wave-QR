package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BasicAlertDialogOverrideScope {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f9250a;

    /* renamed from: b  reason: collision with root package name */
    public final Modifier f9251b;

    /* renamed from: c  reason: collision with root package name */
    public final DialogProperties f9252c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f9253d;

    public BasicAlertDialogOverrideScope(Function0 function0, Modifier modifier, DialogProperties dialogProperties, Function2 function2) {
        this.f9250a = function0;
        this.f9251b = modifier;
        this.f9252c = dialogProperties;
        this.f9253d = function2;
    }

    public final Function2 a() {
        return this.f9253d;
    }

    public final Modifier b() {
        return this.f9251b;
    }

    public final Function0 c() {
        return this.f9250a;
    }

    public final DialogProperties d() {
        return this.f9252c;
    }
}
