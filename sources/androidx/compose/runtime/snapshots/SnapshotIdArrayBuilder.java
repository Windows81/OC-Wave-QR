package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SnapshotIdArrayBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final MutableLongList f15271a;

    public SnapshotIdArrayBuilder(long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(copyOf.length);
            mutableLongList.e(mutableLongList.f1819b, copyOf);
        } else {
            mutableLongList = new MutableLongList(0, 1, (DefaultConstructorMarker) null);
        }
        this.f15271a = mutableLongList;
    }

    public final void a(long j2) {
        this.f15271a.d(j2);
    }

    public final long[] b() {
        MutableLongList mutableLongList = this.f15271a;
        int i2 = mutableLongList.f1819b;
        if (i2 == 0) {
            return null;
        }
        long[] jArr = new long[i2];
        long[] jArr2 = mutableLongList.f1818a;
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = jArr2[i3];
        }
        return jArr;
    }
}
