package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EdgeToEdge {

    /* renamed from: a  reason: collision with root package name */
    public static final int f58a = Color.argb(230, 255, 255, 255);

    /* renamed from: b  reason: collision with root package name */
    public static final int f59b = Color.argb(128, 27, 27, 27);

    /* renamed from: c  reason: collision with root package name */
    public static EdgeToEdgeImpl f60c;

    public static final void a(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2) {
        Intrinsics.i(componentActivity, "<this>");
        Intrinsics.i(systemBarStyle, "statusBarStyle");
        Intrinsics.i(systemBarStyle2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        Function1 b2 = systemBarStyle.b();
        Resources resources = decorView.getResources();
        Intrinsics.h(resources, "view.resources");
        boolean booleanValue = ((Boolean) b2.invoke(resources)).booleanValue();
        Function1 b3 = systemBarStyle2.b();
        Resources resources2 = decorView.getResources();
        Intrinsics.h(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) b3.invoke(resources2)).booleanValue();
        EdgeToEdgeImpl edgeToEdgeImpl = f60c;
        if (edgeToEdgeImpl == null) {
            int i2 = Build.VERSION.SDK_INT;
            edgeToEdgeImpl = i2 >= 30 ? new EdgeToEdgeApi30() : i2 >= 29 ? new EdgeToEdgeApi29() : i2 >= 28 ? new EdgeToEdgeApi28() : new EdgeToEdgeApi26();
        }
        Window window = componentActivity.getWindow();
        Intrinsics.h(window, "window");
        edgeToEdgeImpl.a(systemBarStyle, systemBarStyle2, window, decorView, booleanValue, booleanValue2);
        Window window2 = componentActivity.getWindow();
        Intrinsics.h(window2, "window");
        edgeToEdgeImpl.b(window2);
    }
}
