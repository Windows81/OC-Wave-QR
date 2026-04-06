package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuHostHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f20228a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f20229b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Map f20230c = new HashMap();

    public static class LifecycleContainer {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f20231a;

        /* renamed from: b  reason: collision with root package name */
        public LifecycleEventObserver f20232b;

        public void a() {
            this.f20231a.d(this.f20232b);
            this.f20232b = null;
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f20228a = runnable;
    }

    public void a(MenuProvider menuProvider) {
        this.f20229b.add(menuProvider);
        this.f20228a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f20229b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f20229b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f20229b.iterator();
        while (it.hasNext()) {
            if (((MenuProvider) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f20229b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).d(menu);
        }
    }

    public void f(MenuProvider menuProvider) {
        this.f20229b.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f20230c.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.a();
        }
        this.f20228a.run();
    }
}
