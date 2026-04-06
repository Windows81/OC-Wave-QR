package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

@Metadata
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1 implements OffsetProvider {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7005A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7006z;

    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1(TextFieldSelectionManager textFieldSelectionManager, boolean z2) {
        this.f7006z = textFieldSelectionManager;
        this.f7005A = z2;
    }

    public final long a() {
        return this.f7006z.K(this.f7005A);
    }
}
