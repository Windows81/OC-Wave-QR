package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

public final class DragAndDropPermissionsCompat {

    /* renamed from: a  reason: collision with root package name */
    public final DragAndDropPermissions f20222a;

    public static class Api24Impl {
        public static DragAndDropPermissions a(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.f20222a = dragAndDropPermissions;
    }

    public static DragAndDropPermissionsCompat a(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions a2 = Api24Impl.a(activity, dragEvent);
        if (a2 != null) {
            return new DragAndDropPermissionsCompat(a2);
        }
        return null;
    }
}
