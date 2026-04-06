package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import kotlin.Metadata;

@Metadata
public final class DragAndDropEvent {

    /* renamed from: a  reason: collision with root package name */
    public final DragEvent f15665a;

    public DragAndDropEvent(DragEvent dragEvent) {
        this.f15665a = dragEvent;
    }

    public final DragEvent a() {
        return this.f15665a;
    }
}
