package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class FragmentContainer {
    public Fragment e(Context context, String str, Bundle bundle) {
        return Fragment.g0(context, str, bundle);
    }

    public abstract View f(int i2);

    public abstract boolean h();
}
