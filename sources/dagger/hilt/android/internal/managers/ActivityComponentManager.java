package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;

public class ActivityComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f39725A = new Object();

    /* renamed from: B  reason: collision with root package name */
    public final Activity f39726B;
    public final GeneratedComponentManager C;

    /* renamed from: z  reason: collision with root package name */
    public volatile Object f39727z;

    public interface ActivityComponentBuilderEntryPoint {
        ActivityComponentBuilder b();
    }

    public ActivityComponentManager(Activity activity) {
        this.f39726B = activity;
        this.C = new ActivityRetainedComponentManager((ComponentActivity) activity);
    }

    public Object a() {
        String str;
        if (this.f39726B.getApplication() instanceof GeneratedComponentManager) {
            return ((ActivityComponentBuilderEntryPoint) EntryPoints.a(this.C, ActivityComponentBuilderEntryPoint.class)).b().a(this.f39726B).d();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f39726B.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f39726B.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final SavedStateHandleHolder b() {
        return ((ActivityRetainedComponentManager) this.C).c();
    }

    public Object e() {
        if (this.f39727z == null) {
            synchronized (this.f39725A) {
                try {
                    if (this.f39727z == null) {
                        this.f39727z = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f39727z;
    }
}
