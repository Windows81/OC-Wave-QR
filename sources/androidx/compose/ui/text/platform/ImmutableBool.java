package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;
import kotlin.Metadata;

@Metadata
final class ImmutableBool implements State<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final boolean f18991z;

    public ImmutableBool(boolean z2) {
        this.f18991z = z2;
    }

    /* renamed from: g */
    public Boolean getValue() {
        return Boolean.valueOf(this.f18991z);
    }
}
