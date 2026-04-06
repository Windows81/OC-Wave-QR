package androidx.graphics.path;

import android.graphics.PointF;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;

@Metadata
public final class PathSegmentUtilities {

    /* renamed from: a  reason: collision with root package name */
    public static final PathSegment f21840a = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final PathSegment f21841b = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);

    public static final PathSegment a() {
        return f21841b;
    }

    public static final PathSegment b() {
        return f21840a;
    }
}
