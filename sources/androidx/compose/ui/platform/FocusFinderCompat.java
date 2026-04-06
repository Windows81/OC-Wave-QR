package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FocusFinderCompat {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f17765d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f17766e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 f17767f = new FocusFinderCompat$Companion$FocusFinderThreadLocal$1();

    /* renamed from: a  reason: collision with root package name */
    public final Rect f17768a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final UserSpecifiedFocusComparator f17769b = new UserSpecifiedFocusComparator(new w(this));

    /* renamed from: c  reason: collision with root package name */
    public final MutableObjectList f17770c = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class UserSpecifiedFocusComparator implements Comparator<View> {

        /* renamed from: A  reason: collision with root package name */
        public final MutableScatterMap f17771A = ScatterMapKt.c();

        /* renamed from: B  reason: collision with root package name */
        public final MutableScatterSet f17772B = ScatterSetKt.a();
        public final MutableScatterMap C = ScatterMapKt.c();
        public final MutableObjectIntMap D = ObjectIntMapKt.b();

        /* renamed from: z  reason: collision with root package name */
        public final NextFocusGetter f17773z;

        @Metadata
        public interface NextFocusGetter {
        }

        public UserSpecifiedFocusComparator(NextFocusGetter nextFocusGetter) {
            this.f17773z = nextFocusGetter;
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = (View) this.C.e(view);
            View view4 = (View) this.C.e(view2);
            if (view3 != view4 || view3 == null) {
                if (view3 != null) {
                    view = view3;
                }
                if (view4 != null) {
                    view2 = view4;
                }
                if (view3 == null && view4 == null) {
                    return 0;
                }
                return this.D.c(view) < this.D.c(view2) ? -1 : 1;
            } else if (view == view3) {
                return -1;
            } else {
                return (view2 == view3 || this.f17771A.e(view) == null) ? 1 : -1;
            }
        }
    }
}
