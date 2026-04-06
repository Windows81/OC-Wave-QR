package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: A  reason: collision with root package name */
    public final Context f19683A;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f19684z = new ArrayList();

    public interface SupportParentable {
        Intent r();
    }

    public TaskStackBuilder(Context context) {
        this.f19683A = context;
    }

    public static TaskStackBuilder m(Context context) {
        return new TaskStackBuilder(context);
    }

    public TaskStackBuilder e(Intent intent) {
        this.f19684z.add(intent);
        return this;
    }

    public TaskStackBuilder g(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f19683A.getPackageManager());
        }
        if (component != null) {
            i(component);
        }
        e(intent);
        return this;
    }

    public TaskStackBuilder h(Activity activity) {
        Intent r2 = activity instanceof SupportParentable ? ((SupportParentable) activity).r() : null;
        if (r2 == null) {
            r2 = NavUtils.a(activity);
        }
        if (r2 != null) {
            ComponentName component = r2.getComponent();
            if (component == null) {
                component = r2.resolveActivity(this.f19683A.getPackageManager());
            }
            i(component);
            e(r2);
        }
        return this;
    }

    public TaskStackBuilder i(ComponentName componentName) {
        int size = this.f19684z.size();
        try {
            Intent b2 = NavUtils.b(this.f19683A, componentName);
            while (b2 != null) {
                this.f19684z.add(size, b2);
                b2 = NavUtils.b(this.f19683A, b2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public Iterator iterator() {
        return this.f19684z.iterator();
    }

    public Intent n(int i2) {
        return (Intent) this.f19684z.get(i2);
    }

    public int o() {
        return this.f19684z.size();
    }

    public void p() {
        q((Bundle) null);
    }

    public void q(Bundle bundle) {
        if (!this.f19684z.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f19684z.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!ContextCompat.l(this.f19683A, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f19683A.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
