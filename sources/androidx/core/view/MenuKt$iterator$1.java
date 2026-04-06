package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Menu f20235A;

    /* renamed from: z  reason: collision with root package name */
    public int f20236z;

    public MenuKt$iterator$1(Menu menu) {
        this.f20235A = menu;
    }

    /* renamed from: b */
    public MenuItem next() {
        Menu menu = this.f20235A;
        int i2 = this.f20236z;
        this.f20236z = i2 + 1;
        MenuItem item = menu.getItem(i2);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean hasNext() {
        return this.f20236z < this.f20235A.size();
    }

    public void remove() {
        Unit unit;
        Menu menu = this.f20235A;
        int i2 = this.f20236z - 1;
        this.f20236z = i2;
        MenuItem item = menu.getItem(i2);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
