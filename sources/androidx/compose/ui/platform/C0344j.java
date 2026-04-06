package androidx.compose.ui.platform;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.ui.platform.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0344j implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f17983z;

    public /* synthetic */ C0344j(Function2 function2) {
        this.f17983z = function2;
    }

    public final int compare(Object obj, Object obj2) {
        return AndroidComposeViewAccessibilityDelegateCompat_androidKt.B(this.f17983z, obj, obj2);
    }
}
