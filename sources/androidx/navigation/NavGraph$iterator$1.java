package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public boolean f22344A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavGraph f22345B;

    /* renamed from: z  reason: collision with root package name */
    public int f22346z = -1;

    public NavGraph$iterator$1(NavGraph navGraph) {
        this.f22345B = navGraph;
    }

    /* renamed from: b */
    public NavDestination next() {
        if (hasNext()) {
            this.f22344A = true;
            SparseArrayCompat V = this.f22345B.V();
            int i2 = this.f22346z + 1;
            this.f22346z = i2;
            return (NavDestination) V.p(i2);
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return this.f22346z + 1 < this.f22345B.V().o();
    }

    public void remove() {
        if (this.f22344A) {
            SparseArrayCompat V = this.f22345B.V();
            ((NavDestination) V.p(this.f22346z)).J((NavGraph) null);
            V.l(this.f22346z);
            this.f22346z--;
            this.f22344A = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element");
    }
}
